package matProg;
import java.util.Scanner;

public class AddMatrix {

	int[][] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and column:");
		int r=sc.nextInt();
		int c=sc.nextInt();

		int mat[][]=new int[r][c];
		System.out.println("enter "+r*c+" elements row eise:");
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=sc.nextInt();

			}
		}
		return mat;
	}
	void display(int mat[][])
		
		
		{
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j <mat [i].length; j++) {
					System.out.print(mat[i][j]+" ");

				}
				System.out.println();

			}

		}
	int[][] addMat(int x[][],int y[][])
	{
		if(x.length!=y.length || x[0].length!=y[0].length)
		{
			System.out.println("order must be same");
			System.out.println("Addition failed");
			return null;
		}
		
		int z[][]=new int[x.length][x[0].length];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j]=x[i][j]+y[i][j];
				
			}
		}
		return z;
	}






	}


