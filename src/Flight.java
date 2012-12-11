public class Flight {
	private int flightNumber;
	private Flight sibling;
	private FlightDate child;

	// creates new flight using flight number
	public Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	// getter for sibling flight
	public Flight getSibling() {
		return this.sibling;
	}

	// setter for sibling flight
	public void setSiblingFlight(Flight newSiblingFlight) {
		sibling = newSiblingFlight;
	}

	// getter for flight number
	public int getFlightNumber() {
		return this.flightNumber;
	}

	// creates a new flight date object, traversing tree to find correct
	// location
	public FlightDate addDate(String month, int dayNumber) {
		FlightDate TempDate = child;
		FlightDate newDate = new FlightDate(month, dayNumber);
		if (child == null) {

			child = newDate;
		} else {

			while (TempDate.getSibling() != null) {
				TempDate = TempDate.getSibling();
			}
			TempDate.setSibling(newDate);
		}
		return newDate;
	}

	// traverses tree to find a given Flight Date and removes it
	public void removeFlightDate(String month, int dayNumber) {
		String DateToFind = month + " " + dayNumber;
		if (child.getSibling() == null && child.getFlightDate() == DateToFind)
			child = null;
		else {
			FlightDate temp = child;
			while (temp.getSibling() != null
					&& temp.getSibling().getFlightDate() != DateToFind)
				temp = temp.getSibling();
			if (temp.getSibling() != null
					&& temp.getSibling().getFlightDate() == DateToFind)
				temp.setSibling(temp.getSibling().getSibling());
		}
	}

	// Returns all flight dates
	public String ListDates() {
		String DateList = "";
		FlightDate TempDate = child;
		if (child == null)
			return "There is no Flights!";
		else {
			while (TempDate != null) {
				DateList += TempDate.getFlightDate() + "\n";
				TempDate = TempDate.getSibling();
			}

		}

		return DateList;
	}

	// Returns all flights at a given Date
	public String ListDates(String DateString) {
		String DateList = "";
		String PassList = "";
		FlightDate TempDate = child;
		if (child == null)
			return "There are no Passengers!";
		else {
			while (TempDate != null) {

				if (TempDate.getFlightDate().equals(DateString)) {
					DateList += TempDate.getFlightDate();
					PassList += TempDate.listPassengers();

				}
				TempDate = TempDate.getSibling();
			}

		}

		return DateList + "\n" + PassList;
	}
}
