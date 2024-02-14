#language:es

Característica: Agendar citas por medio de la pagina web
  Yo como usuario
  Quiero poder agendar citas
  Para tramitar servicios relacionados con mi vehículo

  @agendarCitaCedula
  Escenario: Agendar cita exitosa para un usuario con Cédula de ciudadania
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio Cambio de matricula
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con NIT
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio Duplicado licencia de conducción moto
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con RUT
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio Dupliacado Pasaporte
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con CNPJ
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio Traspaso de vehículo blindado
    Entonces debe ver que la cita fue agendada de forma exitosa

  @agendarMultiTramite
  Escenario: Agendar cita multitramite
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para tramitar diferentes servicios
      | entidadPrestadora             | servicio                              |
      | Alcaldía de Medellín          | Cambio de matricula                   |
      | Secretaría Movilidad Medellín | Duplicado licencia de conducción moto |
    Entonces debe ver que la cita fue agendada de forma exitosa