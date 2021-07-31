package br.jbit.vehicleAccessControlApp.Domain.Entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private User user;

    private LocalDateTime accessTime;

    public Login() {
    }

    public Login(User user) {
        this.user = user;
        this.accessTime = LocalDateTime.now();

    }
}
