/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishan
 */
package algo.sorting.input;

public class Generate {
    public int[] numbers(int min, int max, int count) {
        int[] out = new int[count];
        int diff = max - min;
        for (int i=0; i< count; i++) {
             out[i] = min + (int)(Math.random() * diff);
        }
        return out;
    } 
}
