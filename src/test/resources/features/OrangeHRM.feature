Feature: Validar la completitud del formulario de contratación

  Como automatizador
  Quiero completar que el formulario de contratación
  Para validar el resultado del mismo

    @ValidarFormularioDeContratacion
  Scenario: Validar el resultado al completar el formulario de contratación en OrangeHRM
    Given actor se loguea en la página web
      | User name | Password |
      | Admin     | admin123 |
      When completa el formulario de contratación
        | Fields         | Data                     |
        | Full Name      | Fisrt Name               |
        | Full Name      | Middle Name              |
        | Full Name      | Last Name                |
        | Vacancy        | Junior Account Assistant |
        | Email          | text@email.com           |
        | Contact Number | 1111111                  |
        | Keywords       | Test text                |
        | Notes          | Test Text                |
      Then valida el resultado del formulario

