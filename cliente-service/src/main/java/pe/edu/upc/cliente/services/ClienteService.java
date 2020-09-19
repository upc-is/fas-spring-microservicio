package pe.edu.upc.cliente.services;

import pe.edu.upc.cliente.entities.Cliente;

import java.util.Optional;

public interface ClienteService extends CrudService<Cliente, Long> {
    Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception;
}
