package com.gmail.quebed.myfilechooser.core;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser {
    public FileChooser() {
        super();
    }

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
    /*
     * public static void main(String[] args) { FileChooser fc = new FileChooser();
     * String path = null;
     * 
     * if (null != (path = fc.chooseFile())) { System.out.println("User Chose: " +
     * path); } }
     */
}
