package lab9;

import java.util.HashMap;
import java.util.Scanner;

public class Square {
	
	HashMap<Integer,Double> getSquares(int[] num)
	{
		HashMap<Integer,Double> hm=new HashMap<>();
		for(int a:num)
		{
			hm.put(a, Math.pow(a, 2));
		}
		return hm;
	}

	public static void main(String[] args) {
		int n=0,size=0;
		
		Square ss=new Square();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		String str=sc.nextLine();
		try {
			size=Integer.parseInt(str);
			int arr[]=new int[size];
			System.out.println("Enter element:");
			for(int i=0;i<size;i++)
			{
				String st=sc.nextLine();
				try {
					int el=Integer.parseInt(st);
					arr[i]=el;
				}
				catch(NumberFormatException ne)
				{
					System.out.println("Enter valid Integer");
					i--;
				}
			}
			System.out.println(ss.getSquares(arr));
		}
		catch(NumberFormatException ne1)
		{
			System.out.println("Enter a number");
		}
		

	}

}
