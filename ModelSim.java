/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author Joshua Deniziuk
 */
public class ModelSim {
    public static void main(String[] args){
        TransportationSimulator ts = new TransportationSimulator();

        // call setupVehicleList which returns a pretty set of
        // subclasses with call signs and all that jazz
        // immediately pass the List to our simulator for processing
        ts.runTransportSimulation(setupVehicleList());

        System.out.println("Simulation results: ");
        System.out.println(ts.getSimulationResults());
    }

    /**
     *
     * @return
     */
    public static List<TransportVehicle> setupVehicleList(){
        Tank militaryTank = new Tank();
        militaryTank.setCallSign("M1 ABRAMS 2359 ARMY");

        Limousine nightclubLimo = new Limousine();
        nightclubLimo.setCallSign("Leonardo DiCaprio's Limosuine");


        List<TransportVehicle> vList = new LinkedList<>();
        vList.add(militaryTank);
        vList.add(nightclubLimo);

        return vList;
    }

    public static double computeTravelTime(TransportVehicle vehicle, double distance){
        return distance/vehicle.getAverageSpeed();
    
  }
}
