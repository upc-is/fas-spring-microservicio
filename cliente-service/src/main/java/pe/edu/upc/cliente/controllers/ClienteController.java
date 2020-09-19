package pe.edu.upc.cliente.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.cliente.entities.Cliente;
import pe.edu.upc.cliente.services.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cliente>> fetchAll() {
        try {
            List<Cliente> clientes = clienteService.findAll();
            return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> fetchById(@PathVariable("id") Long id) {
        try {
            Optional<Cliente> optionalCliente = clienteService.findById(id);
            if(optionalCliente.isPresent()) {
                return new ResponseEntity<Cliente>(optionalCliente.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch( Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping(path = "/documento/{numeroDocumento}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> fetchByDocumento(@PathVariable("numeroDocumento") String numeroDocumento) {
        try {
            Optional<Cliente> optionalCliente = clienteService.findByNumeroDocumento(numeroDocumento);
            if(optionalCliente.isPresent()) {
                return ResponseEntity.ok(optionalCliente.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch( Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
