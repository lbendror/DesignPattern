package singletonExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConnection db1 = DBConnection.getInstance();
		DBConnection db2 = DBConnection.getInstance();
	}
	
}
