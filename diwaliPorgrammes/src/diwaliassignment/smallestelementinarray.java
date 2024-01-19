package diwaliassignment;

import java.util.ArrayList;
import java.util.Collections;

public class smallestelementinarray {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add(23);
		al.add(76);
		al.add(9);
		al.add(74);
		al.add(32);
		System.out.println(Collections.min(al));
	}
}
