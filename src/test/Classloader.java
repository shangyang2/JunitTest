package test;

public class Classloader {
	private static String qsdf ="qdsf";
	private String ssss;
	

	public Classloader(String ssss) {
		super();
		this.ssss = ssss;
	}
	
public void test(){
	
}




	   public static void main(String args[]){
	      try{
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      }catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	   }
	
}




