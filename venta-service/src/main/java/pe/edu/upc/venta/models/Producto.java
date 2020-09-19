package pe.edu.upc.venta.models;

import lombok.Data;

import java.util.Date;

@Data
public class Producto {
    private Long id;
    private String nombre;
    private Integer stock;
    private Double precio;
    private Date createAt;
    private String status;
}
