package pe.edu.upc.venta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.venta.entities.DetalleVenta;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
