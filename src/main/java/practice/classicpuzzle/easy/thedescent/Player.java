package practice.classicpuzzle.easy.thedescent;

import java.util.Scanner;

class Player {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // game loop
        while (true) {
            
            int index = 0;
            int maxHeight = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (maxHeight < mountainH) {
                    maxHeight = mountainH;
                    index = i;
                }
            }
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            //System.err.println("Debug messages...");
            System.out.println(index); // The index of the mountain to fire on.
        }
    }
}