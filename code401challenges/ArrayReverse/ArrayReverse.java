import java.util.Arrays;
public class ArrayReverse {
  public static void main(String[] args) {
    System.out.println("We are about to reverse an array!");
    int[] inArr = new int[]{1,2,3,4,5,6,7};
    int[] inArr2 = new int[]{1,3,5,7};
    reverseArray(inArr);
    reverseArray(inArr2);
  }

  public static int[] reverseArray(int[] inArr) {
    System.out.println("The input array is: " + Arrays.toString(inArr));
    int temp;
    int len = inArr.length;
    // Travel through half of the array swapping with a mirrored index. (ie: first and last are "mirrored")
    for(int i = 0; i < len/2; i++) {
        // Swap
        temp = inArr[i];
        inArr[i] = inArr[len-i-1];
        inArr[len-i-1] = temp;
    }
    System.out.println("The output array is: " + Arrays.toString(inArr));
    return inArr;
  }
}