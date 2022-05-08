package AssignmentJP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char canContinue = 'y';
		int choice;
		ArrayList<Booking> bookings = new ArrayList<>();
		int BookingCounter = 0;
		ArrayList<Screen> screens = new ArrayList<>();
		int ScreenCounter = 0;

		while (canContinue == 'y') {
			System.out.println(
					"Choose an option from the menu and indicate your option with the the corresponding index");
			System.out.println("1.Admin  2.Buyer  ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("**** ADMIN ****");

				System.out.println("1.SetUp  2.View  ");
				int screenChoice = sc.nextInt();

				System.out.println("");
				sc.nextLine();

				switch (screenChoice) {
				case 1: {
					System.out.println("---- SetUP ----");
					System.out.println("Enter Screen Name from below option \na.Screen1 4PM \nb.Screen1 8PM "
							+ "\nc.Screen2 4PM \nd.Screen2 8PM \ne.Screen3 4PM");

					String showName = sc.nextLine();

					if (showName.equalsIgnoreCase("a")) {
						System.out.println("Screen14PM");
						System.out.println("Please enter number of rows : ");
						int noRow = sc.nextInt();
						System.out.println("Please enter number of Columns : ");
						int noCol = sc.nextInt();
						screens.add(new Screen("Screen14PM", noRow, noCol));
					} else if (showName.equalsIgnoreCase("b")) {
						System.out.println("Screen18PM");

						System.out.println("Please enter number of rows : ");
						int noRow = sc.nextInt();
						System.out.println("Please enter number of Columns : ");
						int noCol = sc.nextInt();
						screens.add(new Screen("Screen18PM", noRow, noCol));
					} else if (showName.equalsIgnoreCase("c")) {
						System.out.println("Screen24PM");

						System.out.println("Please enter number of rows : ");
						int noRow = sc.nextInt();
						System.out.println("Please enter number of Columns : ");
						int noCol = sc.nextInt();
						screens.add(new Screen("Screen24PM", noRow, noCol));
					} else if (showName.equalsIgnoreCase("d")) {
						System.out.println("Screen28PM");

						System.out.println("Please enter number of rows : ");
						int noRow = sc.nextInt();
						System.out.println("Please enter number of Columns : ");
						int noCol = sc.nextInt();
						screens.add(new Screen("Screen28PM", noRow, noCol));
					} else if (showName.equalsIgnoreCase("e")) {
						System.out.println("Screen34PM");

						System.out.println("Please enter number of rows : ");
						int noRow = sc.nextInt();
						System.out.println("Please enter number of Columns : ");
						int noCol = sc.nextInt();
						screens.add(new Screen("Screen34PM", noRow, noCol));
					}

					sc.nextLine();
					break;
				}
				case 2: {
					System.out.println("-------------------------------------------------");
					System.out.println("Booking summary: ");
					for (Screen s : screens) {
						s.printScreenDetails();
					}
					System.out.println("-------------------------------------------------");
					sc.nextLine();
					break;
				}
				default: {
					System.out.println("Enter a Valid choice!");
				}
				}
				break;
			}
			case 2: {
				System.out.println("**** Buyer ****");

				System.out.println("1.Availability  2.Book  3.Cancel ");
				int screenChoice = sc.nextInt();

				System.out.println("");
				sc.nextLine();

				switch (screenChoice) {
				case 1: {
					System.out.println("**** Availability ****");
					System.out.println("-------------------------------------------------");
					System.out.println("Booking summary: ");
					for (Screen s : screens) {
						s.printScreenDetails();
					}
					System.out.println("-------------------------------------------------");
					sc.nextLine();
					break;
				}
				case 2: {
					
					System.out.println("**** Book ****");
					
					int scrChoice;
                    System.out.println("Enter Number of seats required: ");
                    int noOfSeats = sc.nextInt();
                    System.out.println("Choose Booking option");
                    int i=1;
                    for(Screen s : screens) {
                        s.showAvailableSeats(i);
                        i+=2;
                    }
                    System.out.println();
                    screenChoice = sc.nextInt();
                    //System.out.println("Enter discount coupon if you have any else enter 00: ");
                    //sc.nextLine();
                    String disc = sc.nextLine();

                    bookings.add(new Booking());
                    switch(screenChoice){

                    case 1:{
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen14PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen14PM", disc,0,screens.get(k))) {
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else {
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 2:{
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen14PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen14PM", disc,1,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen14PM", disc,2,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 3:{
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen18PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen18PM", disc,0,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 4:{
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen18PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen18PM", disc,1,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen18PM", disc,2,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 5:{
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen24PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen24PM", disc,0,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 6:{
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals( "Screen24PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen24PM", disc,1,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen24PM", disc,2,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 7:{
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId .equals("Screen28PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen28PM", disc,0,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 8: {
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen28PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen28PM", disc,1,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen28PM", disc,2,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 9: {
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen34PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen34PM", disc,1,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen34PM", disc,2,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    case 10: {
                        int k;
                        for(k=0;k<screens.size();k++){
                            if(screens.get(k).ScreenTimeId.equals("Screen38PM"))
                                break;
                        }
                        if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen38PM", disc,1,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen38PM", disc,2,screens.get(k))){
                            System.out.println("Seats Booked successfully");
                            bookings.get(BookingCounter).printBookingDetails();
                            BookingCounter++;
                        }
                        else{
                            System.out.println("Booking Request currently not available");
                            bookings.remove(bookings.size()-1);
                        }
                        break;
                    }
                    default:{
                        System.out.println("Enter a Valid choice!");
                    }
                
                    }
				break;
				}
				case 3: {
					System.out.println("**** Cancel ****");
				break;
				}
				default: {
					System.out.println("Enter a Valid choice!");
				}
				}
				break;
			}
			case 3: {
				
				 System.out.println("Enter the booking Id to view the Booking summary: ");
                 int ind = sc.nextInt();
                 sc.nextLine();
                 if(ind >= bookings.size()) {
                     System.out.println("Invalid Booking ID");
                     break;
                 }
                 for (Booking booking : bookings) {
                     if(booking.BookingId == ind)
                     booking.printBookingDetails();
                 }
				break;
			}

			default: {
				System.out.println("Enter a Valid choice!");
			}

			}
			System.out.println("Do you want to continue? ");
			canContinue = sc.nextLine().charAt(0);
		}
	}
}
