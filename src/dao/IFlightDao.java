package dao;


import java.util.Set;

public interface IFlightDao {
    insertFlight(Flight flight) ;
    Set<Flight>getAllFlight();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestiantionAirPort(String DestiantionAirPort);
    void updateFlight(Flight flight);

}
