/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishan
 */
package algo.sorting.classes;
import algo.sorting.interfaces.MySorter;

public class BubbleSort implements MySorter {
    @Override
    public int[] sort(int[] data) {
        if (data.length <= 1) {
            return data;
        }
        for(int i = 0;i < data.length - 1; i++) {
            for (int j=0; j < data.length - 1; j++) {
                if (data[j] > data[j+1]) {
                    this.swap(data, j, j+1);
                }
            }
        }
        return data;
    }
    
}
