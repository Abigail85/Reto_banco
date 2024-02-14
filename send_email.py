# -*- coding: utf-8 -*-
import os
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

def send_email(subject, message):
    sender_email = os.getenv("SENDER_EMAIL")
    receiver_email = os.getenv("RECIPIENT_EMAIL")
    smtp_server = os.getenv("SMTP_SERVER")
    smtp_port = int(os.getenv("SMTP_PORT"))  # Convertir a entero
    smtp_username = os.getenv("SMTP_USERNAME")
    smtp_password = os.getenv("SMTP_PASSWORD")
    
    # Create message container.
    msg = MIMEMultipart()
    msg['Subject'] = subject
    msg['From'] = sender_email
    msg['To'] = receiver_email

    # Attach message to container.
    part = MIMEText(message, 'plain')
    msg.attach(part)

    try:
        # Send the message via SMTP server.
        with smtplib.SMTP(smtp_server, smtp_port) as servidor_smtp:
            servidor_smtp.starttls()
            servidor_smtp.login(smtp_username, smtp_password)
            servidor_smtp.sendmail(sender_email, receiver_email, msg.as_string())
            servidor_smtp.quit()  # Cerrar manualmente la conexión SMTP
        print("Correo enviado correctamente.")
    except Exception as e:
        print("Error al enviar correo:", str(e))

if __name__ == "__main__":
    # Obtener los argumentos desde la línea de comandos
    import sys
    if len(sys.argv) != 3:
        print("Uso: python send_email.py <asunto> <mensaje>")
        sys.exit(1)
    subject = sys.argv[1]
    message = sys.argv[2]

    # Llamar a la función send_email con los argumentos proporcionados
    send_email(subject, message)
