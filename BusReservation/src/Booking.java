import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
String passengername;
int busNo;
Date date;
Booking() throws ParseException{
	System.out.println("Enter name of passenger");
	Scanner sc=new Scanner(System.in);
	passengername=sc.nextLine();
	System.out.println("Enter busno");
	busNo=sc.nextInt();
	System.out.println("Enter date dd-mm-yyyy");
	String dateinput=sc.next();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	try {
	date=sdf.parse(dateinput);
	}
	catch(ParseException pe) {
		pe.printStackTrace();
	}
}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus b:buses) {
			if(b.getbusno()== busNo) 
				capacity=b.getCapacity();
			}
		
		int booked=0;	
		for(Booking bo:bookings) {
			if(bo.busNo==busNo && bo.date.equals(date)) {  //compare old busno and new booking busno
				booked++;
			}
			
		}
		return booked<capacity?true:false;
		}
	}

