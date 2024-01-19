package diwaliassignment;

import java.util.stream.IntStream;

public class suminarray {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,};
	int sum=IntStream.of(a).sum();
	System.out.println("sum is:" +sum);
}
}
