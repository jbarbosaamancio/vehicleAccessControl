package br.jbit.vehicleAccessControlApp.Domain.Entities;

import br.jbit.vehicleAccessControlApp.Domain.Enums.UserLevel;

public class Roles {
    private UserLevel userLevel;
    private String userRole;
    public Roles(UserLevel userLevel) {
        this.userLevel = userLevel;
        this.userRole = userLevel == UserLevel.ADMIN ? "ADMIN" : "USER";
    }

    public UserLevel getUserLevel() {
        return userLevel;
    }

    public String getUserRole() {
        return userRole;
    }


}
