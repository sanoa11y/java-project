
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) throws ParseException  {
		ArrayList<Bus> buses= new ArrayList<Bus>();// create obj list for class, any obj name  can be mention into here<>
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,55));
		int useropn=1;
		Scanner sc=new Scanner(System.in);
		for(Bus b:buses) {
			b.displayBusinfo();
		}
		while(useropn==1) {
		System.out.println("Enter 1 to Booking and 2 to Exit");
		
		useropn=sc.nextInt();
		if(useropn==1) {
		Booking booking =new Booking();
		if(booking.isAvailable(bookings,buses)) {
		bookings.add(booking); // if condion is true
		System.out.println("Your booking is confirmed...");
		}
		else 
			System.out.println("Sorry. Bus is full.Try another bus or date");
		
		
	}
	}
	}
    }
