package Algorithm;

public class MiniNo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(MinimumNo(arr));
    }

    static int MinimumNo(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
