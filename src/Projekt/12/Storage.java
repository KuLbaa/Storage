package Projekt;

import java.util.ArrayList;

public class Storage implements java.io.Serializable{
	public int area;
	public int BaseArea;
	public String location;
	private int ID;
	ArrayList<MyObject> Objects = new ArrayList<>();
	private static int Count = 1;
		public Storage(int area, String location) {
			this.area = area;
			this.BaseArea = area;
			this.location = location;
			ID = Count++;
		}
		
		public String toString() {
			
			return location+" Size: "+area;
			
		}
		
		public ArrayList GetObjects() {
			
			return Objects;
			
		}

}
