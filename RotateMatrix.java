package ctci;

import java.util.Scanner;

public class RotateMatrix{
	public static void main(String args[]){


		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] mat = new int[n][n];
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				mat[i][j] = scan.nextInt();
			}
		}
		mat = swapRows(transpose(mat, n), n);

		System.out.println("The resulting matrix is : ");
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}

	}

	public static int[][] transpose(int[][] mat, int n){
		for(int i = 0; i < n ; i++){
			for(int j = i + 1; j < n; j++){
				if(i != j){
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					mat[j][i] = temp;
				}
			}
		}
		return mat;
	}

	public static int[][] swapRows(int[][] mat, int n){
		int k = n - 1;
		for(int i = 0; i < n/2 ; i++){
			for(int j = 0 ; j < n; j++){
				int temp = mat[i][j];
				mat[i][j] = mat[k][j];
				mat[k][j] = temp;
			}
			k--;
		}
		return mat;
	}

}