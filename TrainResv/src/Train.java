import java.util.*;
public class Train {
//private int trainno=1;
private int coach;
private boolean ac;
private int capacity;
Train( int coach,boolean ac,  int capacity){
	this. coach=coach;
	this.ac=ac;
	this.capacity=capacity;
}
public int getCoach() {
	return coach;
}
public boolean getAc() {
	return ac;
}
public int getcapacity() {
	return capacity;
}
	public void setCoach(int co) {
		coach=co;
	}
	public void setAc(boolean ac) {
		ac=ac;
	}
	public void setcapacity(int capacity) {
		capacity=capacity;
	} 
	public void display() {
	System.out.println("coach:" + coach + " Ac:" + ac + " capacity:"+ capacity);
	}
	
	
}
