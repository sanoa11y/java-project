import java.text.ParseException;
import java.util.*;
public class TrainDemo {

	public static void main(String[] args) throws ParseException {
		ArrayList<Train> trains= new <Train>ArrayList();
		ArrayList<Booking> bookings= new <Booking>ArrayList();
		trains.add(new Train(1,true,2));
		trains.add(new Train(2,false,2));
		trains.add(new Train(3,true,6));
		
		Scanner sc=new Scanner(System.in);
		int useropn=1;
		for(Train t:trains) {
			t.display();
		}
		while(useropn==1) {
			System.out.println("Enter 1 to Booking and 2 to Exit");
		useropn=sc.nextInt();
		if(useropn==1) {
			Booking booking=new Booking();
			if(booking.available(trains,bookings)) {
		   bookings.add(booking);
		  System.out.println("your Booking confirmed...");
		}
			else {
				System.out.println("Sorry. coach is full.Try another coach or date");
			}
		}
		}
	}

}
