public class FlightDate {
	private int daynumber;
	private String monthName;
	private FlightDate sibling;
	private Passenger child;

	// creates new FlightDate
	public FlightDate(String month, int day) {
		this.daynumber = day;
		this.monthName = month;
	}

	// getter for sibling
	public FlightDate getSibling() {
		return this.sibling;
	}

	// setter for sibling
	public void setSibling(FlightDate newSiblingDate) {
		sibling = newSiblingDate;
	}

	// returns Flight Date
	public String getFlightDate() {
		return this.monthName + " " + this.daynumber;
	}

	// Traverses tree and returns passengers
	public String listPassengers() {
		String PassList = "";
		Passenger TempPass = child;
		if (child == null)
			return "There are no Passengers!";
		else {
			while (TempPass != null) {
				PassList += TempPass.getPassenger() + "\n";
				TempPass = TempPass.getSibling();
			}

		}
		return PassList;
	}

	// adds new passenger, traverses the list and finds correct location
	public Passenger addPassenger(String name) {
		Passenger TempPassenger = child;
		Passenger newPassenger = new Passenger(name);
		if (child == null) {

			child = newPassenger;
		} else {

			while (TempPassenger.getSibling() != null) {
				TempPassenger = TempPassenger.getSibling();
			}
			TempPassenger.setSibling(newPassenger);
		}
		return newPassenger;
	}
}
