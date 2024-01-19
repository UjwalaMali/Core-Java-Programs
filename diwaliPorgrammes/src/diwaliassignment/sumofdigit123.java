package diwaliassignment;

import java.util.Scanner;

public class sumofdigit123 {

	public static void main(String[] args) {
		
		int n,digit,sum=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter no: ");
		
		n=sc.nextInt();
		
		while(n>0) {
			
			digit=n%10;
			
			sum=sum+digit;
			
			n=n/10;
			
		}System.out.println("sum of digit: "+sum);
	}
}
