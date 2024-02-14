# -*- coding: utf-8 -*-
import os
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

def send_email(subject, message):
    sender_email = os.getenv("SENDER_EMAIL")
    receiver_email = os.getenv("RECIPIENT_EMAIL")
    smtp_server = os.getenv("SMTP_SERVER")
    smtp_port = os.getenv("SMTP_PORT")
    smtp_username = os.getenv("SMTP_USERNAME")
    smtp_password = os.getenv("SMTP_PASSWORD")

    # Print variables
    print("Sender Email:", sender_email)
    print("Receiver Email:", receiver_email)
    print("SMTP Server:", smtp_server)
    print("SMTP Port:", smtp_port)
    print("SMTP Username:", smtp_username)
    print("SMTP Password:", smtp_password)

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
        with smtplib.SMTP_SSL(smtp_server, smtp_port) as server:
            server.login(smtp_username, smtp_password)
            server.sendmail(sender_email, receiver_email, msg.as_string())
        print("Correo enviado correctamente.")
    except Exception as e:
        print("Error al enviar correo:", str(e))


if __name__ == "__main__":
    # Solo se ejecuta si se importa como módulo, no cuando se llama directamente desde la línea de comandos
    pass
