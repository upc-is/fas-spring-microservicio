package pe.edu.upc.venta.models;

import lombok.Data;

import java.util.Date;

@Data
public class Cliente {
    private Long id;
    private String nombres;
    private String apellidos;
    private String numeroDocumento;
    private String celular;
    private String direccion;
    private String correo;
    private Date createAt;
    private String status;
}
