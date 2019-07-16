package lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortedOrder{
	List<Integer>  getValues(HashMap<Integer,Integer> hm)
	{
		List<Integer> list=new ArrayList<Integer>(hm.values());
		Collections.sort(list);
		return list;
		
	}

	public static void main(String[] args) {
		int n=0,n1=0;
		SortedOrder so=new SortedOrder();
		HashMap<Integer,Integer> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many values you want to enter?");
		String st=sc.next();
		try {
			n=Integer.parseInt(st);
			System.out.println("Enter any"+n+"integer value:");
			for(int i=1;i<=n;i++)
			{
				String vs=sc.next();
				try {
					int v=Integer.parseInt(vs);
					hm.put(i, v);
					
				}catch(NumberFormatException ne) {
					i--;
					System.out.println("Invaid Integer");
					
				}
			}System.out.println(so.getValues(hm));
		}catch(NumberFormatException ne1) {
			System.out.println("Enter valid integer number");
		}
		
		

	}

}
