package Creational_Dp;

public class DbConnection_Client {
	
	public static void main(String[] args) {
		DbConnection db1=DbConnection.getDbInstance();
		DbConnection db2=DbConnection.getDbInstance();
		DbConnection db3=DbConnection.getDbInstance();
		
		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
		
		
	}
}
