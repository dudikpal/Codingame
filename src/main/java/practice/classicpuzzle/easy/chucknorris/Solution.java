package practice.classicpuzzle.easy.chucknorris;

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
        String MESSAGE = in.nextLine();
        
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        char[] letters = MESSAGE.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            String binChar = Integer.toBinaryString(letters[i]);
            if (binChar.length() != 7) {
                sb.append(createSequence("0", 7 - binChar.length()));
            }
            sb.append(binChar);
        }
        
        StringBuilder result = new StringBuilder();
        String separator = "";
        String[] seqs = sb.toString().split("(?<=([01]))(?!\\1)");
        for (String seq : seqs) {
            result.append(separator);
            String bit = seq.substring(0, 1);
            if (bit.equals("1")) {
                result.append("0");
            } else {
                result.append("00");
            }
            separator = " ";
            result.append(separator);
            result.append(createSequence("0", seq.length()));
        }
        
        
        System.out.println(result.toString());
    }
    
    private static String createSequence(String fillWith, int times) {
        
        return fillWith.repeat(times);
        
    }
}