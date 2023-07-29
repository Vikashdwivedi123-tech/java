package Array;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*   1 2 3
         4 5 6
         7 8 9
    */
//      int [][] arr = new int[3][3];

        /* int [][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9}}; */
        System.out.println("enter the value of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the value of columns: ");
        int col = sc.nextInt();
        int [][] arr = new int [row][col];
        //System.out.println(arr.length);// no of row

        // input
        // for rows
        for (int i = 0; i < row; i++) {
            // for each col in every row
            for (int j = 0; j< col ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Output
            for (int i = 0; i < row; i++) {
                // for each col in every row
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
        }
    }

}
