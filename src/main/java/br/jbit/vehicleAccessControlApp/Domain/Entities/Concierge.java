package br.jbit.vehicleAccessControlApp.Domain.Entities;


import br.jbit.vehicleAccessControlApp.Domain.ValueObjects.Driver;
import br.jbit.vehicleAccessControlApp.Domain.ValueObjects.Vehicle;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Concierge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Driver driver;
    @Embedded
    private Vehicle vehicle;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime entryTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime departureTime;

    private String origination;
    private String destination;

    private String accountable;

    public Concierge() {
    }

    public Concierge(Long id, Driver driver, Vehicle vehicle, LocalDateTime entryTime, LocalDateTime departureTime, String origination, String destination, String accountable) {
        this.id = id;
        this.driver = driver;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.origination = origination;
        this.destination = destination;
        this.accountable = accountable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getOrigination() {
        return origination;
    }

    public void setOrigination(String origination) {
        this.origination = origination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAccountable() {
        return accountable;
    }

    public void setAccountable(String accountable) {
        this.accountable = accountable;
    }
}
