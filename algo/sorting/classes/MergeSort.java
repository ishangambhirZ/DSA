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
public class MergeSort implements MySorter {

    @Override
    public int[] sort(int[] data) {
        this.doSort(data, 0, data.length - 1);
        return data;
    }
    
    private void doSort(int[] data, int start, int end) {
        if (end == start) {
            return ;
        } else if (end - start == 1) {
            if (data[start] > data[end]) {
                this.swap(data, start, end);
            } 
        } else {
            int mid = (start + end)/2;
            if (mid != start) {
                this.doSort(data, start, mid);
            }
            
            if (mid + 1 != end) {
                this.doSort(data, mid+1, end);
            }
            
            if (mid != start || mid + 1 != end) {
                this.merge(data,start, mid, end); 
            }
            
        }
        return;
    }
    
    private void merge(int[] data, int start, int mid, int end) {
        int[] result = new int[end - start + 1];
        int i = start, j = mid + 1;
        int counter = 0;
        
        while(i <= mid && j <= end) {
            if (data[i] < data[j]) {
                result[counter] = data[i];
                i++;
                counter++;
            } else {
                result[counter] = data[j];
                j++;
                counter++;
            }
        }
        
        while(i <= mid) {
            result[counter] = data[i];
            i++;
            counter++;
        }
        
        while(j <= end) {
            result[counter] = data[j];
            j++;
            counter++;
        }
        
        for(int k = start; k <= end; k++) {
            data[k] = result[k-start];
        }
    }
}
