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
public class InsertionSort implements MySorter {
    public int[] sort(int[] data) {
        if (data.length <= 1) {
            return data;
        }
        int temp = 0;
        for(int i = 1; i < data.length; i++) {
            temp = data[i];
            for(int j=i-1;j>=0;j--) {
                if (data[j] > temp) {
                    this.swap(data, j ,j+1);
                } else {
                    break;
                }
            }
        }
        return data;
    }
    
}
