package practice.classicpuzzle.easy.mimetype;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    public static void main(String args[]) {
        /*String input = "3\n" +
                           "3\n" +
                           "html text/html\n" +
                           "png image/png\n" +
                           "gif image/gif\n" +
                           "animated.gif\n" +
                           "portrait.png\n" +
                           "index.html";*/
        String input = "3\n" +
                           "11\n" +
                           "wav audio/x-wav\n" +
                           "mp3 audio/mpeg\n" +
                           "pdf application/pdf\n" +
                           "a\n" +
                           "a.wav\n" +
                           "b.wav.tmp\n" +
                           "test.vmp3\n" +
                           "pdf\n" +
                           ".pdf\n" +
                           "mp3\n" +
                           "report..pdf\n" +
                           "defaultwav\n" +
                           ".mp3.\n" +
                           "final.";
        String[] lines = input.split("\n");
        
        int N = Integer.parseInt(lines[0]); // Number of elements which make up the association table.
        int Q = Integer.parseInt(lines[1]);; // Number Q of file names to be analyzed.
        Map<String, String> associations = new HashMap<>();
        for (int i = 2; i < N + 2; i++) {
            String[] entry = lines[i].split("\\s");
            String EXT = entry[0]; // file extension
            String MT = entry[1]; // MIME type.
            associations.put(EXT.toLowerCase(), MT);
        }
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = N + 2; i < Q + N + 2; i++) {
            String FNAME = lines[i]; // One file name per line.
            int lastIndex = FNAME.lastIndexOf('.');
            String fileType = "";
            if (lastIndex < 0) {
                fileType = "UNKNOWN";
            }
            String extension = FNAME.substring(lastIndex + 1);
            sb.append(separator);
            if (associations.containsKey(extension.toLowerCase()) && fileType == "") {
                fileType = associations.get(extension.toLowerCase());
            } else {
                fileType = "UNKNOWN";
            }
            sb.append(fileType);
            separator = "\n";
        }
        
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        
        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        System.out.println(sb.toString());
    }
}