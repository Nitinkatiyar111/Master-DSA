package ArrayQuestions;

public class RotateMatrix {

    public static void rotate(int[][] matrix){
        int n = matrix.length;

        // Transpose the matrix

        for (int i = 0; i < n; i++){
            for (int j = 0 ; j < i ; j++){

                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

            //reverse
            for (int i = 0; i < n ; i++){
                for (int j = 0; j < n / 2; j++){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;

                }
            }
        }


    public static void main(String[] args){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

       rotate(arr);

        System.out.println("Rotated Image:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}
