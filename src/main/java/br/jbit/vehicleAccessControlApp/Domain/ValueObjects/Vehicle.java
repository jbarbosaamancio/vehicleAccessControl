package br.jbit.vehicleAccessControlApp.Domain.ValueObjects;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Vehicle implements Serializable {

    private String brand;
    private String model;
    private String vehiclePlate;

    public Vehicle() { }

    public Vehicle(String brand, String model, String vehiclePlate) {
        this.brand = brand;
        this.model = model;
        this.vehiclePlate = vehiclePlate;
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

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }
}
