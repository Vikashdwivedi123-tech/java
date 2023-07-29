package Array;

import java.util.*;

public class TransposeOfmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the value of columns: ");
        int col = sc.nextInt();


        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("Transpose of matrix is given by-");

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
