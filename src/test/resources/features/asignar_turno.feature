# language:es

Característica: Asignar Turnos por medio de la pagina web
  Yo como usuario del sistema
  Quiero poder asignar turnos
  Para gestionar servicios

  Antecedentes: Dado que el usuario se encuentra en la pagina web de Shopping GA

  @AsignarTurno
  Escenario: Asignar turno exitoso
    Cuando asigna un turno
    Entonces debe ver que el turno fue asignado de forma exitosa

  Escenario: Asignar turno con preferencia
    Cuando asigna un turno preferencial
    Entonces debe ver que el turno fue asignado de forma exitosa

  Escenario: Asignación con datos incompletos
    Cuando asigna un turno con informacion incompleta
    Entonces el sistema deberia mostrar un mensaje "Ingresa los campos obligatorios".

  Escenario: Asignar Múltiples Turnos
    Cuando asigna varios turnos en una sesion
    Entonces deberia ver que todos los turnos fueron asignados de forma exitosa

  Escenario: Intento de Asignación sin Seleccionar Servicio
    Cuando intenta asignar un turno sin seleccionar un servicio
    Entonces el sistema deberia mostrar un mensaje "La taquilla no tiene servicios configurados"

  Escenario: Intento de asignación sin elegir taquilla
    Cuando intenta asignar un turno sin seleccionar una taquilla
    Entonces el sistema deberia mostrar un mensaje indicando que debe elegir una taquilla

  Escenario: Asignar turno en horario no disponible
    Cuando intenta asignar un turno fuera del horario de atencion
    Entonces el sistema deberia mostrar un mensaje indicando que no es posible asignar un turno en ese horario

















