package oo2;

public class Ch08_2 {

	public static void main(String[] args) {
	  //MySQLConnection m0 = new MySQLConnection();
		MySQLConnection.connection();
		MySQLConnection.connection();
		MySQLConnection.connection();
		MySQLConnection.connection();
		MySQLConnection.connection();
		MySQLConnection.connection();
		MySQLConnection m1 = MySQLConnection.connection();
		m1.close();
	}

}
