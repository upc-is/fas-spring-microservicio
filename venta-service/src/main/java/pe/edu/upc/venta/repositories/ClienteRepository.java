package pe.edu.upc.venta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.venta.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
