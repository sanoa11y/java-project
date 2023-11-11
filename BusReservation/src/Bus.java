
public class Bus {
private int busno;
private boolean ac;
private int capacity;
Bus(int busno, boolean ac, int cap){
	this.busno=busno;
	this.ac=ac;
	this.capacity=cap;	
}
public int getbusno() { //accessor method
	return busno;
}
public boolean getAc() { //accessor method
		return ac;
}
public int getCapacity() { //accessor method
	return capacity;
}
public void setBusno(int busno) {
		busno=busno;
}
public void setac(boolean ac) {
			ac=ac;
			
}
	
public void setcapacity(int cap) {  //mutator(change value)
	capacity=cap;
}
public void displayBusinfo() {
	
	System.out.println("Busno:" +busno+ "ac:" +ac+ "capacity:" +capacity);
}
}
