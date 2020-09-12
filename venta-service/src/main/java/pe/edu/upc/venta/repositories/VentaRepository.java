package pe.edu.upc.venta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.venta.entities.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
