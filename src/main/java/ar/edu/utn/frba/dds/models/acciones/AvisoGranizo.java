package ar.edu.utn.frba.dds.models.acciones;

import ar.edu.utn.frba.dds.enums.Alerta;
import ar.edu.utn.frba.dds.interfaces.Accion;
import ar.edu.utn.frba.dds.interfaces.SdkNotificacion;
import ar.edu.utn.frba.dds.models.AlertaClimatica;

public class AvisoGranizo implements Accion {
    private final SdkNotificacion medio;
    private final Alerta alerta = Alerta.GRANIZO;

    public AvisoGranizo(SdkNotificacion medio) {
        this.medio = medio;
    }

    public void realizar(AlertaClimatica alerta) {
        if(this.alerta == alerta.getAlerta())
            medio.enviar("No salgas con el auto, hay alerta de granizo");
    }
}
