package diwaliassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Secondlargestarray {
public static void main(String[] args) {
	int a[]= {13,90,87,60,54};
	int size=a.length;
	Arrays.sort(a);
	System.out.println("sorted array:"+Arrays.toString(a));
	int res=a[size-2];
	System.out.println("2nd lagest:"+res);
}
}
