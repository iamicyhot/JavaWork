package javademo;

public class foreachArrayOutput {

	public static void main(String[] args) {	
		int num[]= new int[10];
		for (int i=0; i<10; i++)
		{
			num[i]=i*3;
		}
		for(int nums: num)
		{
			System.out.println(nums);
		}
	
}}
