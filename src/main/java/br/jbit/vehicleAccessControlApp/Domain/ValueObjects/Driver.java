package br.jbit.vehicleAccessControlApp.Domain.ValueObjects;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Driver implements Serializable {

    private String name;
    private String typeDriver;

    public Driver() {    }

    public Driver(String name, String typeDrive) {
        this.name = name;
        this.typeDriver = typeDrive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeDriver() {
        return typeDriver;
    }

    public void setTypeDriver(String typeDrive) {
        this.typeDriver = typeDrive;
    }
}
