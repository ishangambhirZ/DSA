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
import algo.sorting.exceptions.*;
import algo.sorting.interfaces.*;

public class Sorter {
    public static final int SELECTION_SORT = 1;
    public static final int BUBBLE_SORT = 2;
    public static final int INSERTION_SORT = 3;
    public static final int MERGE_SORT = 4;
    public static final int QUICK_SORT = 5;
    
    public int[] sort(int[] data, int type) throws InvalidSortTypeException {
        MySorter m = null;
        
        switch (type) {
            case SELECTION_SORT :
                m = new SelectionSort();
                break;
            case BUBBLE_SORT :
                m = new SelectionSort();
                break;
            case INSERTION_SORT :
                m = new InsertionSort();
                break;
            case MERGE_SORT :
                m = new MergeSort();
                break;
            case QUICK_SORT:
                m = new QuickSort();
                break;
                
        }
        
        if (m != null) {
            return m.sort(data);
        } else {
            throw new InvalidSortTypeException("Invalid Sorting Method");
        }
    } 
}
