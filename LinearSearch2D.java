package Algorithm;

public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Searching(arr,6));
    }

    static  int Searching(int[][] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return arr[i][j];
                }
            }
        }
        return -1;
    }
}
