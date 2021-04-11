package com.gmail.quebed.myfilechooser.core;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import com.gmail.quebed.myfilechooser.core.filters.TextFileFilter;

public class TextFileChooser {
    /**
     * Opens a dialog for files only and returns the absolute path
     * 
     * @return String
     */
    public final String chooseFile() {
        JFileChooser jfc = new JFileChooser();
        JFrame mjf = new JFrame();
        String filePath = null;
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.addChoosableFileFilter(new TextFileFilter());
        jfc.setAcceptAllFileFilterUsed(false);
        int returnVal = jfc.showOpenDialog(mjf);

        switch (returnVal) {
        case JFileChooser.APPROVE_OPTION:
            System.out.println("User approved");
            filePath = jfc.getSelectedFile().getAbsolutePath();
            break;

        case JFileChooser.CANCEL_OPTION:
            System.out.println("User cancelled");
            break;

        default:
            System.out.println("Default Case: " + returnVal);
            break;
        }

        mjf.dispose();
        return filePath;
    }

}
