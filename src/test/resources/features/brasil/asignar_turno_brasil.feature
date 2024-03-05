# language:pt

Funcionalidade: Asignar Turnos por medio de la pagina web
  Yo como usuario del sistema
  Quiero poder asignar turnos
  Para gestionar servicios

  Contexto: Dado que el usuario se encuentra en la pagina web de Shopping GA

  @AsignarTurnoBrasil
  Cenario: Asignar turno exitoso
    Quando asigna un turno
    Entao debe ver que el turno fue asignado de forma exitosa

  @AsignarTurnoConPreferenciaBrasil
  Cenario: Asignar turno con preferencia
    Quando asigna un turno preferencial
    Entao debe ver que el turno fue asignado de forma exitosa

  @AsignarMultiplesTurnosBrasil
  Cenario: Asignar Múltiples Turnos
    Quando asigna varios turnos en una sesion
    Entao deberia ver que todos los turnos fueron asignados de forma exitosa


#  Cenario: Asignación con datos incompletos
#    Quando asigna un turno con informacion incompleta
#    Entao el sistema deberia mostrar un mensaje "Ingresa los campos obligatorios".
#
#  Cenario: Intento de Asignación sin Seleccionar Servicio
#    Quando intenta asignar un turno sin seleccionar un servicio
#    Entao el sistema deberia mostrar un mensaje "La taquilla no tiene servicios configurados"
#
#  Cenario: Intento de asignación sin elegir taquilla
#    Quando intenta asignar un turno sin seleccionar una taquilla
#    Entao el sistema deberia mostrar un mensaje indicando que debe elegir una taquilla
#
#  Cenario: Asignar turno en horario no disponible
#    Quando intenta asignar un turno fuera del horario de atencion
#    Entao el sistema deberia mostrar un mensaje indicando que no es posible asignar un turno en ese horario

















