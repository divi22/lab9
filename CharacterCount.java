package lab9;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
	HashMap<Character,Integer> countCharacter(char[] ch)
	{
		HashMap<Character,Integer> hm=new HashMap<>();
		int size=ch.length;
		int visited[]=new int[size];
		for(int i=0;i<size;i++)
		{
			if(visited[i]==1)
				continue;
			int count=1;
			for(int j=i+1;j<size;j++)
			{
				if(ch[i]==ch[j])
				{
					visited[j]=1;
					count++;
				}
			}
			hm.put(ch[i], count);
			
		}
		return hm;
		
		
	}

	public static void main(String[] args) {
		int n=1;
		CharacterCount cc=new CharacterCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many character you want to enter:");
		String str=sc.next();
		try {
			n=Integer.parseInt(str);
			char ch[]=new char[n];
			System.out.println("Enter"+n+"character value");
			for(int i=0;i<n;i++)
			{
				char ab=sc.next().charAt(0);
				ch[i]=ab;
			}
			System.out.println(cc.countCharacter(ch));
		}
		catch(Exception e) {
			System.out.println("Enter valid integer");
		}
		

	}

}
