import requests
import json

def enviar_notificacion(mensaje, api_key, artifact_url):
    url = "https://chat.googleapis.com/v1/spaces/AAAA2XR_Dic/messages?key=" + api_key
    headers = {"Content-Type": "application/json"}
    mensaje = mensaje + artifact_url
    print("mensaje:", mensaje)
    data = {"text": mensaje}
    response = requests.post(url, headers=headers, data=json.dumps(data))
    
    if response.status_code == 200:
        print("Notificación enviada exitosamente.")
    else:
        print("Error al enviar la notificación:", response.text)

# Ejemplo de uso
if __name__ == "__main__":

    # Obtener los argumentos desde la línea de comandos
    import sys

    mensaje = sys.argv[1]
    api_key = sys.argv[2]
    artifact_url =  sys.argv[3]

    enviar_notificacion(mensaje, api_key, artifact_url)
