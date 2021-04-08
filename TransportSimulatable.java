/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;
import java.util.List; 

/**
 *
 * @author Joshua Deniziuk
 */
public interface TransportSimulatable {
    
    /**
     * Implementing classes must have this method that takes in a List
     * of subclasses of TransportVehicle and implementer is responsible for
     * figuring out what kinds of subclasses were passed in and to undertake
     * the simulation of this set of vehicles moving a given distance.
     * @param vList
     */
    public void runTransportSimulation(List<TransportVehicle> vList);
    
    /**
     * Once a call has been made to runTransportaitonSimulation, the client
     * can call this method and get a String containing some basic info about the 
     * most recent simulation, such as Total Passengers from A to B, number
     * injured, and number killed. Also, total passenger hours could be computed as well.
     * @return null is returned when the simulation failed or there is no simulation 
     * about which to report metrics
     */
    public String getSimulationResults();
    
    
}
