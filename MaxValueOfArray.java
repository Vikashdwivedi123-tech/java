package Array;
import java.util.*;
public class MaxValueOfArray {
    public static void main(String[] args) {
        int[] arr = {23,24,12,45};
        System.out.println(max(arr));
    }

    // imagine that array is not empty!
    static int max(int [] arr){
        int MaxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>MaxVal){
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
