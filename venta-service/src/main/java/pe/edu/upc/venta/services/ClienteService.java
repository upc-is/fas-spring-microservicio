package pe.edu.upc.venta.services;

import pe.edu.upc.venta.entities.Cliente;

import java.util.Optional;

public interface ClienteService extends CrudService<Cliente, Long> {
    Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception;
}
