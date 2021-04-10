package com.gmail.quebed.myfilechooser;

import static org.junit.Assert.assertTrue;

import com.gmail.quebed.myfilechooser.core.FileChooser;

import org.junit.Test;

public class FileChooserTests {
    FileChooser fc = null;

    @Test(expected = NullPointerException.class)
    public void testIsNull() {
        fc.chooseFile();
    }

    @Test
    public void testIsNotNull() {
        fc = new FileChooser();
        assertTrue(null != fc);
        fc = null;
        assertTrue(null == fc);
    }
}
