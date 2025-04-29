package com.java.factory;

import com.java.factory.logistics.RoadLogistics;
import com.java.factory.logistics.SeaLogistics;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main( String[] args ) {
        log.info( "Factory Pattern - Hello World!" );
        
        RoadLogistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();
        
        SeaLogistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
