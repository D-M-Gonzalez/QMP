package ar.edu.utn.frba.dds.models.acciones;

import ar.edu.utn.frba.dds.interfaces.Accion;
import ar.edu.utn.frba.dds.interfaces.SdkNotificacion;
import ar.edu.utn.frba.dds.models.AlertaClimatica;

public class AvisoAlerta implements Accion {
    private final SdkNotificacion medio;

    public AvisoAlerta(SdkNotificacion medio) {
        this.medio = medio;
    }

    public void realizar(AlertaClimatica alerta) {
        medio.enviar("Se recibio el alerta: " + alerta.getAlerta().toString());
    }
}
