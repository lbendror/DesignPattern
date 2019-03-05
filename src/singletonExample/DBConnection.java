// Singleton Exmaple

package singletonExample;

public class DBConnection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private static DBConnection instance;
	
	private DBConnection() {
	}
	
	public static DBConnection getInstance() {
		
		if  (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
}
