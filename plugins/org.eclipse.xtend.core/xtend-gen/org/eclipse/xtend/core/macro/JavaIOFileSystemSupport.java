/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.core.macro;

import com.google.common.base.Objects;
import com.google.common.io.ByteStreams;
import com.google.inject.Inject;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend.core.macro.AbstractFileSystemSupport;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.macro.file.Path;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.workspace.FileWorkspaceConfig;
import org.eclipse.xtext.workspace.IProjectConfig;
import org.eclipse.xtext.workspace.IWorkspaceConfig;
import org.eclipse.xtext.workspace.IWorkspaceConfigProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public class JavaIOFileSystemSupport extends AbstractFileSystemSupport {
  @Inject
  @Accessors
  private IWorkspaceConfigProvider projectInformationProvider;
  
  @Override
  public Iterable<? extends Path> getChildren(final Path path) {
    List<Path> _xblockexpression = null;
    {
      boolean _exists = this.exists(path);
      boolean _not = (!_exists);
      if (_not) {
        return CollectionLiterals.<Path>emptyList();
      }
      boolean _isFile = this.isFile(path);
      if (_isFile) {
        return CollectionLiterals.<Path>emptyList();
      }
      File _javaIOFile = this.getJavaIOFile(path);
      String[] _list = _javaIOFile.list();
      final Function1<String, Path> _function = new Function1<String, Path>() {
        @Override
        public Path apply(final String it) {
          return path.getAbsolutePath(it);
        }
      };
      _xblockexpression = ListExtensions.<String, Path>map(((List<String>)Conversions.doWrapArray(_list)), _function);
    }
    return _xblockexpression;
  }
  
  protected File getJavaIOFile(final Path path) {
    ResourceSet _context = this.getContext();
    final IWorkspaceConfig workspaceConfig = this.projectInformationProvider.getWorkspaceConfig(_context);
    if ((workspaceConfig instanceof FileWorkspaceConfig)) {
      List<String> _segments = path.getSegments();
      final String projectName = IterableExtensions.<String>head(_segments);
      boolean _equals = Objects.equal(projectName, null);
      if (_equals) {
        URI _path = ((FileWorkspaceConfig)workspaceConfig).getPath();
        String _fileString = _path.toFileString();
        return new File(_fileString);
      }
      final IProjectConfig projectConfig = ((FileWorkspaceConfig)workspaceConfig).findProjectByName(projectName);
      boolean _equals_1 = Objects.equal(projectConfig, null);
      if (_equals_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Project for path ");
        _builder.append(path, "");
        _builder.append(" is unknown");
        throw new IllegalStateException(_builder.toString());
      }
      URI _path_1 = projectConfig.getPath();
      final String projectPath = _path_1.toFileString();
      List<String> _segments_1 = path.getSegments();
      Iterable<String> _tail = IterableExtensions.<String>tail(_segments_1);
      String _join = IterableExtensions.join(_tail, "/");
      return new File(projectPath, _join);
    }
    throw new IllegalStateException("Workspace is not file based");
  }
  
  @Override
  public boolean exists(final Path path) {
    File _javaIOFile = this.getJavaIOFile(path);
    return _javaIOFile.exists();
  }
  
  @Override
  public boolean isFolder(final Path path) {
    File _javaIOFile = this.getJavaIOFile(path);
    return _javaIOFile.isDirectory();
  }
  
  @Override
  public boolean isFile(final Path path) {
    File _javaIOFile = this.getJavaIOFile(path);
    return _javaIOFile.isFile();
  }
  
  @Override
  public long getLastModification(final Path path) {
    File _javaIOFile = this.getJavaIOFile(path);
    return _javaIOFile.lastModified();
  }
  
  @Override
  public String getCharset(final Path path) {
    IEncodingProvider _encodingProvider = this.getEncodingProvider();
    File _javaIOFile = this.getJavaIOFile(path);
    String _absolutePath = _javaIOFile.getAbsolutePath();
    URI _createFileURI = URI.createFileURI(_absolutePath);
    return _encodingProvider.getEncoding(_createFileURI);
  }
  
  @Override
  public InputStream getContentsAsStream(final Path path) {
    try {
      File _javaIOFile = this.getJavaIOFile(path);
      FileInputStream _fileInputStream = new FileInputStream(_javaIOFile);
      return new BufferedInputStream(_fileInputStream);
    } catch (final Throwable _t) {
      if (_t instanceof FileNotFoundException) {
        final FileNotFoundException exc = (FileNotFoundException)_t;
        String _message = exc.getMessage();
        throw new IllegalArgumentException(_message, exc);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public void mkdir(final Path path) {
    File _javaIOFile = this.getJavaIOFile(path);
    _javaIOFile.mkdirs();
  }
  
  @Override
  public void delete(final Path path) {
    boolean _exists = this.exists(path);
    boolean _not = (!_exists);
    if (_not) {
      return;
    }
    File _javaIOFile = this.getJavaIOFile(path);
    boolean _isDirectory = _javaIOFile.isDirectory();
    if (_isDirectory) {
      try {
        File _javaIOFile_1 = this.getJavaIOFile(path);
        Files.sweepFolder(_javaIOFile_1);
      } catch (final Throwable _t) {
        if (_t instanceof FileNotFoundException) {
          final FileNotFoundException exc = (FileNotFoundException)_t;
          String _message = exc.getMessage();
          throw new IllegalArgumentException(_message, exc);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    File _javaIOFile_2 = this.getJavaIOFile(path);
    _javaIOFile_2.delete();
  }
  
  @Override
  public void setContentsAsStream(final Path path, final InputStream stream) {
    Path _parent = path.getParent();
    this.mkdir(_parent);
    try {
      File _javaIOFile = this.getJavaIOFile(path);
      FileOutputStream _fileOutputStream = new FileOutputStream(_javaIOFile);
      BufferedOutputStream _bufferedOutputStream = new BufferedOutputStream(_fileOutputStream);
      this.copyAndCloseStreams(stream, _bufferedOutputStream);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException exc = (IOException)_t;
        String _message = exc.getMessage();
        throw new IllegalArgumentException(_message, exc);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private void copyAndCloseStreams(final InputStream in, final OutputStream out) throws IOException {
    IOException exception = null;
    try {
      ByteStreams.copy(in, out);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        exception = e;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    } finally {
      try {
        in.close();
      } catch (final Throwable _t_1) {
        if (_t_1 instanceof IOException) {
          final IOException e_1 = (IOException)_t_1;
          boolean _equals = Objects.equal(exception, null);
          if (_equals) {
            exception = e_1;
          }
        } else {
          throw Exceptions.sneakyThrow(_t_1);
        }
      }
      try {
        out.close();
      } catch (final Throwable _t_2) {
        if (_t_2 instanceof IOException) {
          final IOException e_2 = (IOException)_t_2;
          boolean _equals_1 = Objects.equal(exception, null);
          if (_equals_1) {
            exception = e_2;
          }
        } else {
          throw Exceptions.sneakyThrow(_t_2);
        }
      }
    }
    boolean _notEquals = (!Objects.equal(exception, null));
    if (_notEquals) {
      throw exception;
    }
  }
  
  @Override
  public java.net.URI toURI(final Path path) {
    File _javaIOFile = this.getJavaIOFile(path);
    return _javaIOFile.toURI();
  }
  
  @Override
  public Path getPath(final Resource res) {
    ResourceSet _resourceSet = res.getResourceSet();
    URIConverter _uRIConverter = _resourceSet.getURIConverter();
    URI _uRI = res.getURI();
    final URI uri = _uRIConverter.normalize(_uRI);
    boolean _isFile = uri.isFile();
    if (_isFile) {
      ResourceSet _resourceSet_1 = res.getResourceSet();
      final IWorkspaceConfig workspaceConfig = this.projectInformationProvider.getWorkspaceConfig(_resourceSet_1);
      final IProjectConfig projectConfig = workspaceConfig.findProjectContaining(uri);
      URI _path = projectConfig.getPath();
      String _fileString = _path.toFileString();
      final File projectPathAsFile = new File(_fileString);
      String _fileString_1 = uri.toFileString();
      final File absoluteFilePathAsFile = new File(_fileString_1);
      java.net.URI _uRI_1 = projectPathAsFile.toURI();
      final String projectPath = _uRI_1.getPath();
      java.net.URI _uRI_2 = absoluteFilePathAsFile.toURI();
      final String absolutefilePath = _uRI_2.getPath();
      boolean _isChildOf = this.isChildOf(absoluteFilePathAsFile, projectPathAsFile);
      boolean _not = (!_isChildOf);
      if (_not) {
        throw new IllegalStateException((((("Couldn\'t determine file path. The file (\'" + absolutefilePath) + "\') doesn\'t seem to be contained in the project (\'") + projectPath) + "\')"));
      }
      int _length = projectPath.length();
      final String filePath = absolutefilePath.substring(_length);
      String _name = projectConfig.getName();
      String _plus = ("/" + _name);
      String _plus_1 = (_plus + "/");
      String _string = filePath.toString();
      String _plus_2 = (_plus_1 + _string);
      return new Path(_plus_2);
    } else {
      String _path_1 = uri.path();
      String _plus_3 = ("/" + _path_1);
      return new Path(_plus_3);
    }
  }
  
  private boolean isChildOf(final File child, final File parent) {
    File currentChild = child;
    while ((!Objects.equal(currentChild, null))) {
      {
        boolean _equals = currentChild.equals(parent);
        if (_equals) {
          return true;
        }
        File _parentFile = currentChild.getParentFile();
        currentChild = _parentFile;
      }
    }
    return false;
  }
  
  @Pure
  public IWorkspaceConfigProvider getProjectInformationProvider() {
    return this.projectInformationProvider;
  }
  
  public void setProjectInformationProvider(final IWorkspaceConfigProvider projectInformationProvider) {
    this.projectInformationProvider = projectInformationProvider;
  }
}
