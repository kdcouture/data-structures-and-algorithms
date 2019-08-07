/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package array_shift;
import java.util.Arrays;

public class Library {
    public static int[] array_shift(int[] inArr, int toPlace) {
        System.out.println("CC2 start");
        System.out.println("Before insertion: " + Arrays.toString(inArr));
        // Function start
        double midpoint = Math.ceil(inArr.length/2.0);
        int idx;
        // Create longer array
        int[] retArr = new int[inArr.length+1];
        // Place first half of array
        for(idx = 0; idx < midpoint; idx++) {
            retArr[idx] = inArr[idx];
        }
        // Place new element in the middle
        retArr[idx] = toPlace;
        idx++;
        // Copy rest of array
        for(idx = idx; idx < retArr.length; idx++) {
            retArr[idx] = inArr[idx-1];
        }
        System.out.println("After insertion: " + Arrays.toString(retArr));
        System.out.println("CC2 end");
        return retArr;
    }
}
