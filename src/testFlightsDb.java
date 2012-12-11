import java.io.IOException;

public class testFlightsDb {
	public static void main(String[] args) throws IOException {

		// Create New Airline
		Airline XYZ = new Airline("XYZ");

		// Creates new Testflight, 3 test dates, and random passengers
		Flight testFlight1 = XYZ.addFlight(123);
		FlightDate testDate1 = testFlight1.addDate("Apr", 1);
		Passenger testPassenger1 = testDate1.addPassenger("Bob");
		Passenger testPassenger2 = testDate1.addPassenger("George");
		Passenger testPassenger3 = testDate1.addPassenger("Peter");
		Passenger testPassenger4 = testDate1.addPassenger("Mike");
		FlightDate testDate2 = testFlight1.addDate("Jun", 5);
		Passenger testPassenger5 = testDate2.addPassenger("Ruth");
		Passenger testPassenger6 = testDate2.addPassenger("Chris");
		Passenger testPassenger7 = testDate2.addPassenger("Mary");
		Passenger testPassenger8 = testDate2.addPassenger("Sue");
		FlightDate testDate3 = testFlight1.addDate("Aug", 4);
		Passenger testPassenger9 = testDate3.addPassenger("Alvin");
		Passenger testPassenger10 = testDate3.addPassenger("Simon");
		Passenger testPassenger11 = testDate3.addPassenger("Theodore");
		// More Testing Data
		Flight testFlight2 = XYZ.addFlight(546);
		FlightDate testDate4 = testFlight2.addDate("Sep", 6);
		Passenger testPassenger12 = testDate4.addPassenger("Steve");
		Passenger testPassenger13 = testDate4.addPassenger("Mark");
		Passenger testPassenger14 = testDate4.addPassenger("Bill");
		FlightDate testDate5 = testFlight2.addDate("Dec", 30);
		Passenger testPassenger15 = testDate5.addPassenger("Mitt");
		Passenger testPassenger16 = testDate5.addPassenger("Barack");
		FlightDate testDate6 = testFlight2.addDate("Jan", 15);
		Passenger testPassenger17 = testDate6.addPassenger("Garen");
		Passenger testPassenger18 = testDate6.addPassenger("Xin");
		Passenger testPassenger19 = testDate6.addPassenger("Teemo");
		// More testing data
		Flight testFlight3 = XYZ.addFlight(789);
		FlightDate testDate7 = testFlight3.addDate("May", 2);
		Passenger testPassenger20 = testDate7.addPassenger("Annie");
		Passenger testPassenger21 = testDate7.addPassenger("Soroka");
		Passenger testPassenger22 = testDate7.addPassenger("Cho");
		FlightDate testDate8 = testFlight3.addDate("Feb", 22);
		Passenger testPassenger23 = testDate8.addPassenger("Caitlin");
		Passenger testPassenger24 = testDate8.addPassenger("TF");
		Passenger testPassenger25 = testDate8.addPassenger("Ashe");
		FlightDate testDate9 = testFlight3.addDate("Jul", 29);

		System.out
				.println("\n******************All Flights and Dates for XYZ Airline******************");
		// List all Flights
		System.out.print(XYZ.ListFlights());
		// Remove flight #789
		XYZ.removeFlight(789);
		System.out
				.println("\n******************Removing Flight #789******************");
		// List remaining flights
		System.out.print(XYZ.ListFlights());

		System.out
				.println("\n******************Dates of Flight #123******************");
		// List dates of flight #123
		System.out.print(XYZ.ListFlights(123));

		System.out
				.println("\n******************Passengers on Flight #546******************");
		// List passengers of flight #546 on Dec 30th
		System.out.print(XYZ.ListFlights(546, "Dec", 30));
	}
}
