package pe.edu.upc.examparcial;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TramiteTest {
    static Documento documento, documentoEmitido;
    static Tramite tramite;
    static Entidad entidad;
    static Cargo cargoEmitido;
    static HojaRuta hojaRutaEmitido;
    static StateTramite stateTramite;
    @BeforeAll
    void init() {
        tramite = new Tramite();
        documento = new Documento();
        documentoEmitido = new Documento();
        entidad = new Entidad();
        cargoEmitido = new Cargo();
        hojaRutaEmitido = new HojaRuta();
        stateTramite = StateTramite.FINISH;
    }

    @Test
    void registrar() {
        int expected = 1;
        int actual = tramite.registrar(documento);
        assertEquals(expected, actual);
    }

    @Test
    void emitir() {
        Documento expected = documentoEmitido;
        Documento actual = tramite.emitir(entidad);
        assertEquals(expected, actual);
    }

    @Test
    void expedicionCargo() {
        Cargo expected = cargoEmitido;
        Cargo actual = tramite.expedicionCargo();
        assertEquals(expected, actual);
    }

    @Test
    void generarHojaRuta() {
        HojaRuta expected = hojaRutaEmitido;
        HojaRuta actual = tramite.generarHojaRuta();
        assertEquals(expected, actual);
    }

    @Test
    void culminar() {
        StateTramite expected = stateTramite;
        StateTramite actual = tramite.culminar();
        assertEquals(expected, actual);
    }
}