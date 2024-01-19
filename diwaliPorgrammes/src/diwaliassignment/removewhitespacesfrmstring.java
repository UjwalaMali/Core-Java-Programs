package diwaliassignment;

public class removewhitespacesfrmstring {
public static void main(String[] args) {
	String str ="Welcome To The Country";
	str =str.replaceAll("\\s","");
	System.out.println("string after remove space: "+str);
}
}
