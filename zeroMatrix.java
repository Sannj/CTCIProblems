package ctci;

import java.util.Scanner;

public class zeroMatrix{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] mat = new int[n][n];
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				mat[i][j] = scan.nextInt();
			}
		}
		mat = markZeroes(mat, n);
		System.out.println("The resulting matrix is : ");
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}


	}
	public static int[][] markZeroes(int[][] mat, int n){
		boolean[][] temp = new boolean[n][n];
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				if(mat[i][j] == 0){
					temp[i][j] = true;
				}
			}
		}
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				if(temp[i][j] == true){
					for(int k = 0; k < n; k++){
						mat[i][k] = 0;
						mat[k][j] = 0;
					}
				}
			}
		}
		return mat;

	}
}