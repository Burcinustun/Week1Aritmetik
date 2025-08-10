package patikaweek1;

import java.util.Scanner;

public class MatrixTranspoz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Row length: ");
        int row = input.nextInt();
        System.out.print("Column length: ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];

        //MATRİX İÇİN ELEMAN DEĞERLERİ OLUŞTURMAK:

        System.out.println("Matrix numbers: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();

            }
        }
        // TRANSPOZ İÇİN:
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];

            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();


        }
    }
}