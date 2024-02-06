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

  @agendarCitaUsuarioJuridico
  Esquema del escenario: Agendar cita para un usuario juridico
    Dado que el usuario se encuentra en la pagina web
    Cuando agenda una cita con <tipoDeDocumento> y <numeroDeDocumento> para el <tipoDeServicio>
    Entonces debe ver que la cita fue agendada de forma exitosa

    Ejemplos:
      | tipoDeDocumento   | numeroDeDocumento | tipoDeServicio                |
      | CEDULA CIUDADANIA | 1017224110        | Cambio de matricula           |
      | NIT               | 1017224120        | Lavado de carro               |
      | RUT               | 1017204548        | Traspaso de vehículo blindado |


  @agendarCitaMultiTramite
  Escenario: Agendar cita multitramite
    Dado que el usuario se encuentra en la pagina web
    Cuando agenda una cita para realizar varios tramites
    Entonces debe ver que la cita fue agendada de forma exitosa


