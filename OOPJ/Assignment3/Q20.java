import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in); 
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		
		
		//Input for first Matrices:
		for(int i=0;i<3;i++){//Row
			for(int j=0;j<3;j++){//Col
				System.out.println("Enter element for first matrices:");
				arr1[i][j] = sc.nextInt();
			}
		}
		//Input for second matrices:
		for(int i=0;i<3;i++){//Row
			for(int j=0;j<3;j++){//Col
				System.out.println("Enter element for second matrices:");
				arr2[i][j] = sc.nextInt();
			}
		}

        // Dimensions of the matrix
        int rows = arr1.length;
        int cols = arr1[0].length;

        // Resultant matrix to store the sum
        int sum[][] = new int[rows][cols];

        // Adding two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Printing the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              
                // Print elements on the same line
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
			