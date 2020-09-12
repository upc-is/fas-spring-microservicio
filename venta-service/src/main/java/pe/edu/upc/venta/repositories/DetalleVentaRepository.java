package pe.edu.upc.venta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.venta.entities.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
