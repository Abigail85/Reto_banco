# language:es

Característica: Asignar Turnos por medio de la pagina web
  Yo como usuario del sistema
  Quiero poder asignar turnos
  Para gestionar servicios

  Escenario: Asignar turno exitoso
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando asigna un turno para el servicio 'Lavado de carro'
    Entonces debe ver que el turno fue asignado de forma exitosa

  @AsignarTurnoConPreferenciaColombia
  Escenario: Asignar turno con preferencia
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando asigna un turno preferencial para el servicio 'Lavado de carro'
    Entonces debe ver que el turno fue asignado de forma exitosa

  @AsignarMultiplesTurnosColombia
  Escenario: Asignar Múltiples Turnos
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando asigna varios turnos en una sesion
    Entonces deberia ver que todos los turnos fueron asignados de forma exitosa

  Escenario: Asignación con datos incompletos
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando asigna un turno con informacion incompleta
    Entonces el sistema deberia mostrar un mensaje "Ingresa los campos obligatorios".

  Escenario: Intento de Asignación sin Seleccionar Servicio
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando intenta asignar un turno sin seleccionar un servicio
    Entonces el sistema deberia mostrar un mensaje "La taquilla no tiene servicios configurados"

  Escenario: Intento de asignación sin elegir taquilla
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando intenta asignar un turno sin seleccionar una taquilla
    Entonces el sistema deberia mostrar un mensaje indicando que debe elegir una taquilla

  Escenario: Asignar turno en horario no disponible
    Dado que el usuario se encuentra en la pagina web de Shopping GA
    Cuando intenta asignar un turno fuera del horario de atencion
    Entonces el sistema deberia mostrar un mensaje indicando que no es posible asignar un turno en ese horario