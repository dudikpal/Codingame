package practice.classicpuzzle.easy.horseracingduals;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    private List<Integer> horses = new ArrayList<>();
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            
        }
        
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        System.out.println("answer");
    }
    
    public int result(String input) {
        String[] lines = input.split("\n");
        horses = Stream.of(lines)
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        Collections.sort(horses);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < horses.size() - 1; i++) {
            int actualDiff;
            if (minDiff > (actualDiff = horses.get(i + 1) - horses.get(i))) {
                minDiff = actualDiff;
            }
        }
        return minDiff;
    }
}
