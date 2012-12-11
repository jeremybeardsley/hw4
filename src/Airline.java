public class Airline {

	private String airlineName;
	private Flight child;

	// Creates New airline, which becomes top node of the tree
	public Airline(String airlineName) {
		this.airlineName = airlineName;
	}

	// getter for child Fllight
	public Flight getchild() {
		return child;
	}

	// Setter for child flight
	public void setchild(Flight newchild) {
		child = newchild;
	}

	// Creates new flight using FlightNumber passed as an arg. Checks the tree
	// for the first available node
	// for a new flight. Starts at Child of the top node, if that has an item,
	// it traverses the sibling flights
	// until it finds a valid spot for new flight.
	public Flight addFlight(int FlightNumber) {
		Flight TempFlight = child;
		Flight newFlight = new Flight(FlightNumber);
		if (child == null) {

			child = newFlight;
		} else {
			while (TempFlight.getSibling() != null) {
				TempFlight = TempFlight.getSibling();
			}
			TempFlight.setSiblingFlight(newFlight);
		}
		return newFlight;
	}

	// traverses the tree looking for matching flight number, when it matches,
	// it removes the reference to that
	// sibling.
	public void removeFlight(int FlightNumber) {
		if (child.getSibling() == null
				&& child.getFlightNumber() == FlightNumber)
			child = null;
		else {
			Flight temp = child;
			while (temp.getSibling() != null
					&& temp.getSibling().getFlightNumber() != FlightNumber)
				temp = temp.getSibling();
			if (temp.getSibling() != null
					&& temp.getSibling().getFlightNumber() == FlightNumber)
				temp.setSiblingFlight(temp.getSibling().getSibling());
		}
	}

	// returns string of All Flights
	public String ListFlights() {
		Flight TempFlight = child;
		String FlightList = "";
		if (child == null) {
			return "There are No Flights!";
		}
		while (TempFlight != null) {
			FlightList += "\nFlight Number: " + TempFlight.getFlightNumber()
					+ "\n" + "Dates:\n";
			FlightList += TempFlight.ListDates();

			TempFlight = TempFlight.getSibling();
		}

		return FlightList;

	}

	// returns string of flights that match the argument FlightNumber
	public String ListFlights(int FlightNumber) {
		Flight TempFlight = child;
		String FlightList = "";
		if (child == null) {
			return "There are No Flights!";
		}
		while (TempFlight != null) {
			if (TempFlight.getFlightNumber() == FlightNumber) {
				FlightList += TempFlight.ListDates();
			}
			TempFlight = TempFlight.getSibling();
		}

		return FlightList;

	}

	// returns string of passengers on a given day for a given flight number
	public String ListFlights(int FlightNumber, String Month, int Day) {
		Flight TempFlight = child;
		String FlightList = "";
		String DateToFind = Month + " " + Day;

		if (child == null) {
			return "There are No Flights!";
		}
		while (TempFlight != null) {
			if (TempFlight.getFlightNumber() == FlightNumber) {

				FlightList += TempFlight.ListDates(DateToFind);

			}
			TempFlight = TempFlight.getSibling();
		}

		return FlightList;
	}
}
