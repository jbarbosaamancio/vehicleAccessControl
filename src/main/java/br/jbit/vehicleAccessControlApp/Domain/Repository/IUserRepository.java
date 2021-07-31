package br.jbit.vehicleAccessControlApp.Domain.Repository;

import br.jbit.vehicleAccessControlApp.Domain.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IUserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM USER WHERE USERNAME LIKE %:username% ", nativeQuery = true)
    User findByUsername(@Param("username") String username);
}
