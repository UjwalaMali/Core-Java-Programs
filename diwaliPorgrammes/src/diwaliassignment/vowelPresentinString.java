package diwaliassignment;

public class vowelPresentinString {

	public static void main(String[] args) {
		
		String str= new String("Hi welcome the world");
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				
				System.out.println("given string contain  " +str.charAt(i)+ " at index"+i);
				
			}
		}
	}
	
}
		
		
	
	

	

