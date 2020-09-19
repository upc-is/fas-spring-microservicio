package pe.edu.upc.venta.entities;

import lombok.Data;
import pe.edu.upc.venta.models.Cliente;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ventas")
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "fecha_venta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVenta;

    @Column(nullable = false)
    private Double precioTotal;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(length = 1, nullable = false)
    private String status;

    @OneToMany(mappedBy = "venta")
    private List< DetalleVenta > detalleVentas;

    public Venta() {
        detalleVentas = new ArrayList<>();
    }

    @Transient
    private Cliente cliente;
}
