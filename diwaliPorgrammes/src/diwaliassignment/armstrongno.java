package diwaliassignment;

public class armstrongno {
public static void main(String[] args) {
	
	int number=371,originalnumber ,remainder,result=0;
	
	originalnumber=number;
	
	while(originalnumber!=0) {
		
		remainder=originalnumber%10;
		result+=Math.pow(remainder, 3);
		originalnumber/=10;
		
	}if(result==number) {
		System.out.println(number+" armstrong no");
	}else {
		System.out.println(number+" not a armstrong no");
	}
	
	
	
	

	
	
}
	
	
}
