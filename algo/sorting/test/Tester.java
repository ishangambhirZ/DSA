/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishan
 */
package algo.sorting.test;
public class Tester {
    public boolean test(int[] data) {
       for(int i=0; i< data.length-1; i++) {
           if(data[i]> data[i+1]) {
               return false;
           }
       }
       return true;
    }
}
