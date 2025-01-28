import java.util.Scanner;
public class MatrixOperations {
    // Create a 2D array to represent a matrix
    public static void main(String[] args) {
        // Create the scanner object
        Scanner sc = new Scanner(System.in);
        // Give the size of the matrix
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int cols = sc.nextInt();
        // The matrix is a 2D array
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        // The user inputs the elements of the matrices
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        // The user inputs the elements of the matrices
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        // Addition of two matrices
        int[][] sumMatrix = new int[rows][cols];
        System.out.println("\nMatrix Addition (A + B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        // Subtraction of matrices
        int[][] diffMatrix = new int[rows][cols];
        System.out.println("\nMatrix Subtraction (A - B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diffMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
                System.out.print(diffMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

