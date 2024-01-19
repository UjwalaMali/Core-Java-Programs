package diwaliassignment;

public class elementOfArrayOnOddPostion {

	public static void main(String[] args) {
		
	int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
	
	System.out.println("element of array on odd position: ");
	// for even position take int i=1
	for(int i=0;i<a.length;i=i+2) {
		
		System.out.println(a[i]);
	}
	}
}
