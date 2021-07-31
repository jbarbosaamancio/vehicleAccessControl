package br.jbit.vehicleAccessControlApp.Domain.Repository;

import br.jbit.vehicleAccessControlApp.Domain.Entities.Concierge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IConciergeRepository extends JpaRepository<Concierge, Long> {

    @Query(value = "SELECT * FROM CONCIERGE WHERE VEHICLE_PLATE LIKE %:plate% ", nativeQuery = true)
    List<Concierge> findByVehiclePlate(@Param("plate") String plate);

}
