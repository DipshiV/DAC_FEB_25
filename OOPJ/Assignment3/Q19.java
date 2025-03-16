import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in); 
		int arr[][] = new int[3][3];
		
		//Input for first Matrices:
		for(int i=0;i<3;i++){//Row
			for(int j=0;j<3;j++){//Col
				System.out.print("Enter element for matrices:");
				arr[i][j] = sc.nextInt();
			}
		}
		

        int rows = arr.length;
        int cols = arr[0].length;

        // Resultant matrix to store the sum
        int transpose[][] = new int[rows][cols];

        // Transpose of matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Printing the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              
                // Print elements on the same line
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
			