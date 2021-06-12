import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TramiteStepdefs {
    @Given("El usuario se encuentra en el módulo de registro de documentos")
    public void elUsuarioSeEncuentraEnElMóduloDeRegistroDeDocumentos() {
        // Ingresar a la Aplicación y cargar el modulo de registro
    }

    @When("Ingresa los datos de los documento ingresados a las entidades")
    public void ingresaLosDatosDeLosDocumentoIngresadosALasEntidades() {
        // El modulo muestra el formulario de registro
        // Se inserta los datos solicitados al formulario
    }

    @And("Hace click en el boton registrar")
    public void haceClickEnElBotonRegistrar() {
        // hace click en el formulario
    }

    @Then("El sistema registra los datos ingresados")
    public void elSistemaRegistraLosDatosIngresados() {
        // Se obtiene los datos del formulario
        // y se guardan en el objeto Tramite
        // Se llama a Entity manager del JPA para
        // hacer persistente el objeto tramite
    }

    @And("genera un número de registro por cada documento ingresado")
    public void generaUnNúmeroDeRegistroPorCadaDocumentoIngresado() {
        // Despues de la persitencia del objeto,
        // y se obtiene el objeto devuelto
        // del objeto devuelto se obtiene el número de registro.
    }

    @Given("El usuario se encuentra en el módulo de emisión de documentos")
    public void elUsuarioSeEncuentraEnElMóduloDeEmisiónDeDocumentos() {
        // Ingresar a la Aplicación y cargar el modulo de emisión
    }

    @When("Ingresa información de los documentos a emitir")
    public void ingresaInformaciónDeLosDocumentosAEmitir() {
        // El modulo muestra el formulario de emisión
        // Se inserta los datos solicitados al formulario
    }

    @And("registra la Instituciones u órganos o áreas o administrados o ciudadanos de destino")
    public void registraLaInstitucionesUÓrganosOÁreasOAdministradosOCiudadanosDeDestino() {
        // Se inserta los datos solicitados al formulario
    }

    @Then("El sistema genera el documento con la información registrada")
    public void elSistemaGeneraElDocumentoConLaInformaciónRegistrada() {
        // Con la información ingresada se crea el objeto Tramite
        // Se llama al metodo emitir y el objeto genera el documeto
    }

    @Given("El usuario necesita el cargo de los documentos emitidos")
    public void elUsuarioNecesitaElCargoDeLosDocumentosEmitidos() {
    }

    @And("el usuario se encuentra en el modulo de cargos")
    public void elUsuarioSeEncuentraEnElModuloDeCargos() {
        // Ingresar a la Aplicación y cargar el modulo de cargos
    }

    @When("Ingresa los datos de los documentos: número, naturaleza, remitente y destinatario")
    public void ingresaLosDatosDeLosDocumentosNúmeroNaturalezaRemitenteYDestinatario() {
        // El modulo muestra el formulario de cargo
        // Se inserta los datos solicitados al formulario
    }

    @Then("El sistema genera el cargo del documento con la información solicitada")
    public void elSistemaGeneraElCargoDelDocumentoConLaInformaciónSolicitada() {
        // Con la información ingresada se obtiene el objeto Tramite
        // Se llama al metodo expedicionCargo y el objeto genera el cargo
    }

    @Given("El usuario necesita la Hoja de ruta de los documentos")
    public void elUsuarioNecesitaLaHojaDeRutaDeLosDocumentos() {
    }

    @And("el usuario se encuentra en el módulo de Hojas de ruta")
    public void elUsuarioSeEncuentraEnElMóduloDeHojasDeRuta() {
        // Ingresar a la Aplicación y cargar el modulo Hoja de ruta
    }

    @When("Registra las derivaciones subsiguientes del documento que fueran necesarias")
    public void registraLasDerivacionesSubsiguientesDelDocumentoQueFueranNecesarias() {
        // El modulo muestra el formulario de derivaciones
        // Se inserta los datos solicitados
        // para realizar las derivaciones de la Hoja de ruta
    }

    @Then("El sistema deriva los documentos a las Instituciones u órganos o áreas o administrados o ciudadanos destinatarios")
    public void elSistemaDerivaLosDocumentosALasInstitucionesUÓrganosOÁreasOAdministradosOCiudadanosDestinatarios() {
        // Con la información ingresada se obtiene el objeto Tramite
        // Se llama al metodo generarHojaRuta
        // y el objeto genera la Hoja de ruta
        // El sistema deriva el documento a la Entidad destino
    }

    @Given("El usuario desea finalizar el proceso de atención del documento")
    public void elUsuarioDeseaFinalizarElProcesoDeAtenciónDelDocumento() {
    }

    @And("el usuario se encuentra en el módulo de culminación del proceso")
    public void elUsuarioSeEncuentraEnElMóduloDeCulminaciónDelProceso() {
        // Ingresar a la Aplicación y
        // cargar el modulo culminación de proceso
    }

    @When("Registra la respuesta final de atención del documento")
    public void registraLaRespuestaFinalDeAtenciónDelDocumento() {
        // El modulo muestra el formulario de culminación de proceso del tramite
        // Se inserta los datos solicitados para
        // dar la respuesta final al tramite del documento
    }

    @Then("EL sistema envia el mensaje de tramite culminado al documento")
    public void elSistemaEnviaElMensajeDeTramiteCulminadoAlDocumento() {
        // Con la información ingresada se obtiene el objeto Tramite
        // Se llama al metodo culminar
        // El objeto tramite pasa al estado culminado
    }
}
