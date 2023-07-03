package Creational_Dp;

public class DbConnection {
	
	static DbConnection  db;
	
	private DbConnection(){
		
	}
	
	public static DbConnection getDbInstance() {
		if(db==null) {
			db=new DbConnection();
		}
	
		return db;
	}
}