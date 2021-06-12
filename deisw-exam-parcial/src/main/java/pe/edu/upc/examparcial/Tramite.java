package pe.edu.upc.examparcial;

import java.util.Date;

public class Tramite {
    private int id;
    private Documento documento;
    private Date fechaRegistro;
    private Entidad tramitador;
    private Flujo flujo;

    public int registrar(Documento documento) {
        return 1;
    }
    public Documento emitir(Entidad entidad){
        return new Documento();
    }
    public Cargo expedicionCargo() {
        return new Cargo();
    }
    public HojaRuta generarHojaRuta() {
        return new HojaRuta();
    }
    public StateTramite culminar(){
        return StateTramite.FINISH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Entidad getTramitador() {
        return tramitador;
    }

    public void setTramitador(Entidad tramitador) {
        this.tramitador = tramitador;
    }

    public Flujo getFlujo() {
        return flujo;
    }

    public void setFlujo(Flujo flujo) {
        this.flujo = flujo;
    }
}
