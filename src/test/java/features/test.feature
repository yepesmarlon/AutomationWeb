Feature: Funcionalidad de contratación de una persona

  Como actor
  Quiero ingresar a la pagina de Orange HRM
  Para completar el proceso de contratación de una persona

  @CompletarContratación
  Scenario: Validar el resultado al completar el proceso de contratación de una persona
    Given actor abre la pagina de Orange HRM
    When completa el formulario del proceso de contracación
    Then validar los textos del resultado