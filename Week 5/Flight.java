//Author: Daniel Flesch
// Date: 2/12/24
// A class designed for making flights with a code and a destination.
public class Flight
{ //instance variables
    private String flightNumber;
    private String destination;

    /** 
     * no arguement constructor
     * */ 
    public Flight()
    { //initialize instance variables
    flightNumber = "";
    destination = "";
    }

    /**
     * two arguement constructor
     * @param fn
     * @param d
     *  */ 
    public Flight(String fn, String d)
    { //initialize instance variables
        flightNumber = fn;
        destination = d;
    }

    /**
     * sets the number/code for the flight.
     * @param fn
     */
    public void setFlightNumber(String fn)
    {
        flightNumber = fn;
    }

    /**
     * sets the destination for the flight.
     * @param d
     */
    public void setDestination(String d)
    {
        destination = d;
    }

    /**
     * gets the flight number.
     * @return flightNumber
     */
    public String getFlightNumber()
    {
        return flightNumber;
    }

    /**
     * gets the destination of the flight.
     * @return destination
     */
    public String getDestination()
    {
        return destination;
    }
}