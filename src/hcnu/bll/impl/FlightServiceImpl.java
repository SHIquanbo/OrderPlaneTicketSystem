package hcnu.bll.impl;

import hcnu.bean.Flight;
import hcnu.bll.IFlightService;
import hcnu.dao.IFlightDao;
import hcnu.dao.impl.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;

    public FlightServiceImpl() {
        this.iFlightDao=new FlightDaoIml();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
