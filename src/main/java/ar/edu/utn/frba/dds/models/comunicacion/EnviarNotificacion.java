package ar.edu.utn.frba.dds.models.comunicacion;

import ar.edu.utn.frba.dds.interfaces.SdkNotificacion;

public class EnviarNotificacion implements SdkNotificacion {
    private final String telefono;

    public EnviarNotificacion(String telefono) {
        this.telefono = telefono;
    }

    public void enviar(String contenido) {

    }
}
