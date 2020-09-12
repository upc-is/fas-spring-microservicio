package pe.edu.upc.venta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.venta.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
