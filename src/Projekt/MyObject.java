package Projekt;

public class MyObject implements java.io.Serializable{
	public String name;
	public int size;
	private int ID;
	public String description;
	private static int Count = 1;
		public MyObject(String name, int size, String description) {
			
			this.name = name;
			this.size = size;
			this.description = description;
			ID = Count++;
		}
		
		public String toString() {
			
			return name+" size: "+size;
			
		}
		
		
}
