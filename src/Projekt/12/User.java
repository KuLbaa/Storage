package Projekt;

public class User {
	String name;
	private String password;
		public User (String name, String password) {
			
			this.name = name;
			this.password = password;
			
		}
		
		public String GetPassword() {
			
			return password;
			
		}
}
