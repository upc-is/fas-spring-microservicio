Feature: Tramite de documentos
  Scenario: Registro de documento ingresados
    Given El usuario se encuentra en el módulo de registro de documentos
    When Ingresa los datos de los documento ingresados a las entidades
      And Hace click en el boton registrar
    Then El sistema registra los datos ingresados
      And genera un número de registro por cada documento ingresado

  Scenario: Registro y emisión de documentos
    Given El usuario se encuentra en el módulo de emisión de documentos
    When Ingresa información de los documentos a emitir
      And registra la Instituciones u órganos o áreas o administrados o ciudadanos de destino
    Then El sistema genera el documento con la información registrada

  Scenario: Registro y emisión del cargo de documento
    Given El usuario necesita el cargo de los documentos emitidos
      And el usuario se encuentra en el modulo de cargos
    When Ingresa los datos de los documentos: número, naturaleza, remitente y destinatario
    Then El sistema genera el cargo del documento con la información solicitada

  Scenario: Generación de la Hoja de ruta de los documentos registrados
    Given El usuario necesita la Hoja de ruta de los documentos
      And el usuario se encuentra en el módulo de Hojas de ruta
    When Registra las derivaciones subsiguientes del documento que fueran necesarias
    Then El sistema deriva los documentos a las Instituciones u órganos o áreas o administrados o ciudadanos destinatarios

  Scenario: Culminación del proceso de atención del documento
    Given El usuario desea finalizar el proceso de atención del documento
      And el usuario se encuentra en el módulo de culminación del proceso
    When Registra la respuesta final de atención del documento
    Then EL sistema envia el mensaje de tramite culminado al documento
