package Projekt;

import java.awt.Color;
import java.util.ArrayList;

public class Storage implements java.io.Serializable{
	public double area;
	public double BaseArea;
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
		
		public Double GetFreeCapacity() {
			
			return (Double) ((area*100)/BaseArea);
			
		}
		
		public Color SetColor() {
			
			if(area/BaseArea == BaseArea) {
				
				return Color.GREEN;
			}
			if((area/BaseArea)*100 < BaseArea/2) {
				
				return Color.YELLOW;
				
			}
			else {
				
				return Color.RED;
				
			}
			
		}

}
