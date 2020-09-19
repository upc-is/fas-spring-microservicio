package pe.edu.upc.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.producto.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}