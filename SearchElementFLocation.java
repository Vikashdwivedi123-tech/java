package Array;
import java.util.*;
public class SearchElementFLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the value of columns: ");
        int col = sc.nextInt();


        int [][] matrix = new int [row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                matrix[i][j]= sc.nextInt();
            }

        }
        System.out.println("enter an element to be searched: ");
        int n = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == n){
                    System.out.println("n is found at location ("+ i + ", "+ j +")");
                }
            }
        }
    }
}
