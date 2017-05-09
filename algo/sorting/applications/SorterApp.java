/**
 *
 * @author Ishan
 */
package algo.sorting.applications;
import algo.sorting.input.*;
import algo.sorting.test.*;
import algo.sorting.classes.Sorter;

public class SorterApp {
    public static void main(String[] args) {
        int min,max,count,sort_type;
        min = Integer.parseInt(args[0]);
        max = Integer.parseInt(args[1]);
        count = Integer.parseInt(args[2]);
        sort_type = Integer.parseInt(args[3]);
        Generate g = new Generate();
        int[] input = g.numbers(min, max, count);
        System.out.print("Input::");
        printArray(input);
        Sorter s = new Sorter();
        try {
            int[] output = s.sort(input, sort_type);
            System.out.println("Output::");
            printArray(output);
            Tester t = new Tester();
            if(t.test(output)) {
                System.out.println("Sort successful");
            } else {
                System.out.println(input);
                System.out.println(output);
                System.out.println("Sort unsuccessful");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public static void printArray(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
