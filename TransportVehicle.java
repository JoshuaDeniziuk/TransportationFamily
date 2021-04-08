/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

/**
 *
 * @author Joshua Deniziuk
 */
public  class TransportVehicle {
    private String callSign;
    private int passengerCount;
    private double averageSpeed;
    private double costPerPassengerMile;
    private double safetyCoefficient;
    private boolean inTransit;
    
    private double fuelCapacity;
    private double currentFuelLevel;
    
    
    
    // methods for "getters" "setters" of our
    // private member variables
    
    /**
     * Gets the value of member variable passengerCount
     * @return 
     */
    public int getPassengerCount(){
        // go into "private vault" and retrieve
        // the value of a single member variable
        return passengerCount;
    }
    
    /**
     * Sets a value for passengerCount
     * Checks for 0 or positive value 
     * and sets count at 0 for negative inputs
     * @param cnt value to inject
     */
    public void setPassengerCount(int cnt){
        // check incoming value for 
        // reasonableness and then  inject into
        // private vault
        if(cnt >= 0){
            passengerCount = cnt;
        } else {
            passengerCount = 0;
        }
    } 
    
    public double getAvergageSpeed(){
        return getAverageSpeed();
    }
    
    public void setAverageSpeed(double spd){
        averageSpeed = spd;
    }

    /**
     * @return the averageSpeed
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * @return the costPerPassengerMile
     */
    public double getCostPerPassengerMile() {
        return costPerPassengerMile;
    }

    /**
     * @param costPerPassengerMile the costPerPassengerMile to set
     */
    public void setCostPerPassengerMile(double costPerPassengerMile) {
        this.costPerPassengerMile = costPerPassengerMile;
    }

    /**
     * @return the safetyCoefficient
     */
    public double getSafetyCoefficient() {
        return safetyCoefficient;
    }

    /**
     * @param safetyCoefficient the safetyCoefficient to set
     */
    public void setSafetyCoefficient(double safetyCoefficient) {
        this.safetyCoefficient = safetyCoefficient;
    }

    /**
     * @return the inTransit
     */
    public boolean isInTransit() {
        return inTransit;
    }

    /**
     * @param inTransit the inTransit to set
     */
    public void setInTransit(boolean inTransit) {
        this.inTransit = inTransit;
    }

    /**
     * @return the fuelCapacity
     */
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * @param fuelCapacity the fuelCapacity to set
     */
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * @return the currentFuelLevel
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * @param currentFuelLevel the currentFuelLevel to set
     */
    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    /**
     * @return the callSign
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * @param callSign the callSign to set
     */
    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }
    
    
    
}
