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
public class QuickSort implements MySorter {
    @Override
    public int[] sort(int[] data) {
        this.doSort(data, 0, data.length - 1);
        return data;
    }
    
    private void doSort(int[] data, int start, int end) {
        if (end == start) {
        } else if (end - start == 1) {
            if (data[end] < data[start]) {
                this.swap(data, start, end);
            }
        } else {
           int pivot = this.setPivot(data, start, end);
           if (pivot - 1 > start) {
                this.doSort(data, start, pivot - 1);
           }
           
           if (end > pivot + 1) {
               this.doSort(data, pivot + 1, end);
           }
        }  
    }
    
    private int setPivot(int[] data, int start, int end) {
        
        int pivot = (int)((end - start)* Math.random()) + start;
        
        if (pivot != start) {
            this.swap(data, pivot, start);
        }
        int i = start;
        int j = end;
        pivot = start;
        
        while(i <= j && j >= start && i <= end) {
            while (pivot < j && j > start && data[j] >= data[pivot]){
                j--;
            }
            
            if (data[j] < data[pivot] && pivot < j) {
                this.swap(data, pivot, j);
                pivot = j;
                j--;
            } else {
                break;
            }
            
            while (pivot >= i && i < end && data[i] <= data[pivot]){
                i++;
            }
            
            if (data[i] > data[pivot] && pivot > i) { 
                this.swap(data, pivot, i);
                pivot = i;
                i++;
            } else {
                break;
            }
        }
        return pivot;
    }
}
