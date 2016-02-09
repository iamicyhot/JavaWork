package javademo;

public class TwoDArray {

	public static void main(String[] args) {
		int new2[][] = new int[2][3];
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				new2[i][j]= ((i*10)+j);
			}
		}
		for(int i=0; i<2; i++)
		{
			System.out.println();
			for(int j=0; j<3; j++)
			{
				System.out.print("  "+new2[i][j]);
			}
		}
			

	}

}
