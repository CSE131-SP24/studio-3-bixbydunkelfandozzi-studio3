package studio3;

import java.util.Scanner;

public class Studio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Prime numbers up to: ");
		int n = in.nextInt();
		boolean[] numbers = new boolean [n];
		int x = 0;

		for (int i = 0; i < n; i++)
		{
			numbers[i]=true;
		}

		for (int i = 2; i <=n; i++)
		{
			for (int j = 2;j <n; j = i^2 + x*i)
			{ 
				x++;
				numbers[j]=false;
			}

		}

		for (int i = 0; i < n; i++)
		{
			if (numbers[i] = true)
			{
		System.out.println(i);
			}
		}
	}

}

