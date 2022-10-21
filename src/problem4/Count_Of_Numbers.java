package problem4;

import java.util.Scanner;

public class Count_Of_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int i,j,temp =0;
		int arr[]= {1,2,8,9,12,46,76,82,15,20,30};
		for(i=1;i<=9;i++,temp=0)
		{
			for(j=0;j<11;j++)
			{
				if(arr[j]%i==0)
				{
					temp++;
				}
				
			}
		System.out.println(temp);
		}
			
		

	}

}
