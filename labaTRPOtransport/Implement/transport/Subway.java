package com.company.transport;

import com.company.Person.Driver;
import com.company.Person.Passanger;
import com.company.Person.Security;
import com.company.Route;

public class Subway extends UndergroundTransport {
    public Subway(){}
    public Subway(int number, int amount, int[] timeTable, Route route, Driver driver, Passanger[] passangers, Security security){
        super(number, amount, timeTable, route, driver, passangers, security);
    }

    @Override
    public void go() {

    }
}