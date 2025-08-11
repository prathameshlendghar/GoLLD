package CarRentalSystemDesign.vehicle;

import CarRentalSystemDesign.types.VehicleType;
import CarRentalSystemDesign.user.Owner;

public class Vehicle {
    String registeredNumber;
    VehicleType vehicleType;
    Owner owner;
    int power;
    int yearsOld;
    int monthOld;
    int kmRun;
    String brand;
    String model;
    int fuel;
    int rating;


    public Vehicle(String registeredNumber, VehicleType vehicleType, Owner owner, int power, int yearsOld, int monthOld, int kmRun, String brand, String model, int rating) {
        this.registeredNumber = registeredNumber;
        this.vehicleType = vehicleType;
        this.owner = owner;
        this.power = power;
        this.yearsOld = yearsOld;
        this.monthOld = monthOld;
        this.kmRun = kmRun;
        this.brand = brand;
        this.model = model;
        this.rating = rating;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getMonthOld() {
        return monthOld;
    }

    public void setMonthOld(int monthOld) {
        this.monthOld = monthOld;
    }

    public int getKmRun() {
        return kmRun;
    }

    public void setKmRun(int kmRun) {
        this.kmRun = kmRun;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
