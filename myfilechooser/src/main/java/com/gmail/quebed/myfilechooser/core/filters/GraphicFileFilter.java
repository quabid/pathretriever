package com.gmail.quebed.myfilechooser.core.filters;

import java.io.File;

import javax.swing.filechooser.FileFilter;

import com.gmail.quebed.myfilechooser.core.utils.GraphicFileUtils;
import com.gmail.quebed.myfilechooser.core.utils.ShellFileUtils;

public class GraphicFileFilter extends FileFilter {

    // Accept all directories and all gif, jpg, tiff, or png files.
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = GraphicFileUtils.getExtension(f);
        if (extension != null) {
            if (extension.equals(ShellFileUtils.shell)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    // The description of this filter
    public String getDescription() {
        return "Graphic Files";
    }
}
