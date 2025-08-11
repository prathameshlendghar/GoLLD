package vehicleRentingSystemDesign.vehicle;

import vehicleRentingSystemDesign.types.VehicleType;
import vehicleRentingSystemDesign.user.Owner;

import java.time.LocalDate;

public class Vehicle {
    String registeredNumber;
    VehicleType vehicleType;
    Owner owner;
    int power;
    LocalDate purchaseDate;
    int kmRun;
    String brand;
    String model;
    int fuel;
    int rating;
    float oneDayPrice;


    public Vehicle(String registeredNumber, VehicleType vehicleType, LocalDate purchaseDate, Owner owner, int power, int kmRun, String brand, String model, int rating, float oneDayPrice) {
        this.registeredNumber = registeredNumber;
        this.vehicleType = vehicleType;
        this.owner = owner;
        this.power = power;
        this.purchaseDate = purchaseDate;
        this.kmRun = kmRun;
        this.brand = brand;
        this.model = model;
        this.rating = rating;
        this.oneDayPrice = oneDayPrice;
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

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
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

    public float getOneDayPrice() {
        return oneDayPrice;
    }

    public void setOneDayPrice(float oneDayPrice) {
        this.oneDayPrice = oneDayPrice;
    }
}
