//import java.sql.Date;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
String passengername;
int coachno;
Date date;
Booking()throws ParseException{
	
	System.out.println("Enter passenger name");
	Scanner sc=new Scanner(System.in);
	passengername=sc.next();
	System.out.println("Enter coach no");
	coachno=sc.nextInt();
	System.out.println("Enter date: dd-mm-yyyy");
	String userdate=sc.next() ;
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	date=sdf.parse(userdate);
}
public boolean available(ArrayList<Train> trains,ArrayList<Booking> bookings) {
	int capacity=0;
	for(Train t:trains) {
		if(t.getCoach()==coachno) 
		capacity=t.getcapacity();
		
	}
	int booked=0;
	for(Booking b:bookings) {
		if(b.coachno==coachno && b.date.equals(date)) {
			booked++;
		}
	}
	return booked<capacity? true:false;
}
}

