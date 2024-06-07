package ar.edu.utn.frba.dds.models.comunicacion;

import ar.edu.utn.frba.dds.interfaces.SdkNotificacion;

public class EnviarEmail implements SdkNotificacion {
    private final String email;

    public EnviarEmail(String email) {
        this.email = email;
    }

    public void enviar(String contenido) {

    }
}
