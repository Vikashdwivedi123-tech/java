package Algorithm;

public class SearchinRange {
    public static void main(String[] args) {
    int [] arr = {12,34,5,67,8};
        System.out.println(Search(arr,5,1,3));
    }

    static int Search(int[] arr,int target,int start,int end){
        for (int i = start; i <=end ; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
