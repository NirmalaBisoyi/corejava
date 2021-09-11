package corejava;


public class Physicsteacher extends Teacher{
	
	String collegename="physics";
	
    @Override 
	public void does() {
		// TODO Auto-generated method stub
		System.out.println("Child Does method");
	}
    
	
	public static void main(String args[]) {
		
		Teacher childObj = new Physicsteacher();
		String myColName = childObj.collegename;
		childObj.does();
		
	}
}
