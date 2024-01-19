
public class Example {
public static void main(String[] args) {
	
	Example e=new Example();
	e=null;
	System.gc();
	
	System.out.println("system is running....");
	
}  
   @Override
  protected void finalize() {
	   
	   System.out.println("finalize is running...");
	  
  }
   
	
}
