/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishan
 */
package algo.sorting.interfaces;
public interface MySorter {
    int[] sort(int[] data);
    
    default public void swap(int[] data,int i,int j) {
        data[i] = data[i] + data[j]; 
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
    
    default public void printArray(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
