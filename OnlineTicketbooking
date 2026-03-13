class OnlineTicketbooking{
	int availableseat=1;
	
public void bookticket(String username,int seatrequesting) {
	
	synchronized(this){//current object,critical section
	
	if(availableseat>=seatrequesting) {
			System.out.println("seat is available for requesting user: "+username);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			availableseat=availableseat-seatrequesting;
			System.out.println(username+"booked successfully");
			System.out.println("seat left:"+availableseat);
		}
		
		else {
			System.out.println("not enough seat for users:"+username);
		}
	}
}
}

class User extends Thread{
	OnlineTicketbooking onlineTicketbooking;//has-a relationship,aggregation
	String name;
	int seat;
	public User(OnlineTicketbooking onlineTicketbooking, String name, int seat) {
		super();
		this.onlineTicketbooking = onlineTicketbooking;
		this.name = name;
		this.seat = seat;
	}
	public void run() {
		onlineTicketbooking.bookticket(name, seat);
	}	
}

public class Synchronizedmethodpgm {

	public static void main(String[] args) {
		OnlineTicketbooking t=new OnlineTicketbooking();
		User u1=new User(t,"Yashu ",1);
		User u2=new User(t,"Deepu ",1);
		u1.start();
		u2.start();
	}
}
