package br.jbit.vehicleAccessControlApp.Domain.Entities;


import br.jbit.vehicleAccessControlApp.Domain.Enums.UserLevel;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false,length = 20, unique = true)
    private String username;

    @Column(nullable = false,length = 20)
    private String password;


    private Set<Roles> roles;


}
