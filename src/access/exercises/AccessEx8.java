package access.exercises;

class Connection {
	private Connection() {}
	public static Connection makeConnection() {
		return new Connection();
	}
}

class ConnectionManager {
	private static Connection[] connections = new Connection[5];
	
	public static Connection getConnection() {
		for(int i = 0; i < connections.length; i++) {
			if(connections[i] == null) {
				System.out.println("Connection" + (i+1));
				connections[i] = Connection.makeConnection();
				return connections[i];
			}
		}
		System.out.println("Out of connections");
		return null; 
	}
}

public class AccessEx8 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
			ConnectionManager.getConnection();
	}
}