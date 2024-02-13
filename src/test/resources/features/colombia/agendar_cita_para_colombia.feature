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
    Cuando agenda una cita para el servicio Lavado de carro
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con RUT
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio Dupliacado Pasaporte
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita exitosa para un usuario con CNPJ
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para el servicio Traspaso de vehículo blindado
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita multitramite se necesita parametro 2062
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando agenda una cita para realizar varios tramites
    Entonces debe ver que la cita fue agendada de forma exitosa