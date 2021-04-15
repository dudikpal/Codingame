package practice.classicpuzzle.easy.horseracingduals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    
    @Test
    void result() {
        
        String input = "10\n" +
                           "5\n" +
                           "15\n" +
                           "17\n" +
                           "3\n" +
                           "8\n" +
                           "11\n" +
                           "28\n" +
                           "6\n" +
                           "55\n" +
                           "7";
        
        int expected = 1;
        
        assertEquals(expected, new Solution().result(input));
    }
}