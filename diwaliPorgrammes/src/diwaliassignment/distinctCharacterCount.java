package diwaliassignment;

import java.util.HashSet;

public class distinctCharacterCount {
	
    static int cntdistinct(String str) {
	
	HashSet<Character>s= new HashSet<Character>();
	
	for(int i=0;i<str.length();i++) {
		
		s.add(str.charAt(i));
		
	}
	return s.size();
	
}
    public static void main(String[] args) {
	
	String str = "JavaByKiran"; // unique character{J,a,v,B,y,K,i,r,n}
	System.out.println(cntdistinct(str)); 
}
}
