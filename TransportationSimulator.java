/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;
import java.util.Random;
import java.util.List;

public class TransportationSimulator implements TransportSimulatable {

        private String simResults;

        // constructor
        public TransportationSimulator(){
            simResults = null;
        }

        public void runTransportSimulation(List<TransportVehicle> vList) {

            StringBuilder sb = new StringBuilder();
            int passTotal = 0;
            // Only examine elements if we actually have a list and that list
            // is NOT empty (!)
            if(vList != null && !vList.isEmpty()){
                // Use Enhanced for Loop to visit each item individually
                // This says, serve me once TransportVehicle at a time,
                // and do so by sticking it in the variable called v
                // which I can look at more closely inside the for loop
                for(TransportVehicle v: vList){
                    sb.append("-----------------------------------------\n");
                    sb.append("Examining Vehicle: " + v.getCallSign() + "\n");
                    sb.append("Passenger Count: " + v.getPassengerCount() + "\n");

                   int injuries = getInjuries(v.getSafetyCoefficient(),v.getPassengerCount());
                    sb.append("Passenger Injuries: " + injuries + "\n");
                    sb.append("Passenger fatalities: " + getDeaths(injuries) + "\n");
                    passTotal = passTotal + v.getPassengerCount();
                }

                sb.append("--------------------------------------");
                sb.append("\nTotal Passengers in all vehicles: " + passTotal);

            }
            // after we've run the simulatoin, dump our String train into
            // the member variable which holds simulation results
            simResults = sb.toString();
        }

            public String getSimulationResults() {
                if (simResults != null){

            // ship to caller the results of the most recent simulation
                    return simResults;

        }
    return null;
    }
            
    public int getInjuries (double safety, int passengers){

            Random rando = new Random();

            double chance = rando.nextDouble();
                if(chance >= safety){
                    return 0;
            }else{
                    return (int)(passengers * safety );
            }
        }

        public int getDeaths (int injuries){
            Random rando = new Random();
            double chance = rando.nextDouble();
            return (int) Math.round(injuries * chance);
        }

    }

