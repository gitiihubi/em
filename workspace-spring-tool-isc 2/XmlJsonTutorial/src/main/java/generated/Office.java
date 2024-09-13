package generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Office{
	List<Staff> staff;	
	String name;	
	String address;
	@JsonProperty(value = "floorsNum")
	String floors;
	
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getFloors() {
		return floors;
	}
	public void setFloors(String floors) {
		this.floors = floors;
	}
	@Override
	public String toString() {
		return "Office [staff=" + staff + ", name=" + name + ", address="
				+ address + ", floors=" + floors + "]";
	}
	
	
	
}
