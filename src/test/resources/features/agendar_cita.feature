#language:es

Característica: Agendar citas por medio de la pagina web
  Yo como usuario
  Quiero poder agendar citas
  Para tramitar servicios relacionados con mi vehículo

  @agendarCita
  Escenario: Agendar cita exitosa
    Dado que el usuario se encuentra en la pagina web
    Cuando agenda una cita para el servicio Cambio de matricula
    Entonces debe ver que la cita fue agendada de forma exitosa

  Escenario: Agendar cita usuario juridico
    Dado que el usuario se encuentra en la pagina web
    Cuando agenda una cita para el servicio Lavado de carro
    Entonces debe ver que la cita fue agendada de forma exitosa

  @agendarCitaMultiTramite
  Escenario: Agendar cita multitramite
    Dado que el usuario se encuentra en la pagina web
    Cuando agenda una cita para realizar varios tramites
    Entonces debe ver que la cita fue agendada de forma exitosa


