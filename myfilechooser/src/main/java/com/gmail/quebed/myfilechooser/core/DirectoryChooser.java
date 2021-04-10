package com.gmail.quebed.myfilechooser.core;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class DirectoryChooser {
    /**
     * Opens a dialog for dirctories only and returns the absolute path
     * 
     * @return String
     */
    public final String chooseDir() {
        JFileChooser jfc = new JFileChooser();
        JFrame mjf = new JFrame();
        String dirPath = null;
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = jfc.showOpenDialog(mjf);

        switch (returnVal) {
        case JFileChooser.APPROVE_OPTION:
            System.out.println("User approved");
            dirPath = jfc.getSelectedFile().getAbsolutePath();
            break;

        case JFileChooser.CANCEL_OPTION:
            System.out.println("User cancelled");
            break;

        default:
            System.out.println("Default Case: " + returnVal);
            break;
        }

        mjf.dispose();
        return dirPath;
    }

    /*
     * public static void main(String[] args) { DirectoryChooser dc = new
     * DirectoryChooser(); String dirPath = null;
     * 
     * if (null != (dirPath = dc.chooseDir())) {
     * System.out.println("User chose directory: " + dirPath); } }
     */
}
