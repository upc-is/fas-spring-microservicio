package pe.edu.upc.venta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.venta.entities.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
