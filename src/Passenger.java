public class Passenger {

	private String PassengerName;
	private Passenger sibling;

	// getter for sibling
	public Passenger getSibling() {
		return this.sibling;
	}

	// setter for sibling
	public void setSibling(Passenger newSiblingPassenger) {
		sibling = newSiblingPassenger;
	}

	// creates new passenger
	public Passenger(String name) {
		this.PassengerName = name;
	}

	// getter for Passenger Name
	public String getPassenger() {
		return PassengerName;
	}

}
