/*Program handles File Not Found Exception.
The referred file "file.txt" doesn't exist
 */
package com.tgt.ignitplus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundException_Example {
    public static void main(String args[]) {
        try {
            // Following file does not exist
            File file = new File("file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception:\n" + e);
        }
    }
}
/*
Output:
Exception:
java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
 */