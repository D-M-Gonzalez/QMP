package ar.edu.utn.frba.dds.models.acciones;

import ar.edu.utn.frba.dds.enums.Alerta;
import ar.edu.utn.frba.dds.interfaces.Accion;
import ar.edu.utn.frba.dds.interfaces.SdkNotificacion;
import ar.edu.utn.frba.dds.models.AlertaClimatica;

public class AvisoParaguas implements Accion {
    private final SdkNotificacion medio;
    private final Alerta alerta = Alerta.TORMENTA;

    public AvisoParaguas(SdkNotificacion medio) {
        this.medio = medio;
    }

    public void realizar(AlertaClimatica alerta) {
        if(this.alerta == alerta.getAlerta())
            medio.enviar("Ojo que va a llover, lleva paraguas");
    }
}
