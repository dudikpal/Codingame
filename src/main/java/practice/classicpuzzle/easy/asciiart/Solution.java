package practice.classicpuzzle.easy.asciiart;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine().toUpperCase();
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            sb.append(separator);
            for (int j = 0; j < T.length(); j++) {
                int charCode = Character.valueOf(T.charAt(j)) - 65;
                if (charCode >= 0 && 26 > charCode) {
                    sb.append(ROW.substring(charCode * L, charCode * L + L));
                } else {
                    sb.append(ROW.substring(26 * L, 26 * L + L));
                }
            }
            separator = "\n";
        }
        
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        System.out.println(sb.toString());
    }
}
