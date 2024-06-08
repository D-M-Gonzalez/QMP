package ar.edu.utn.frba.dds.events;

import ar.edu.utn.frba.dds.interfaces.Accion;
import ar.edu.utn.frba.dds.interfaces.IservicioClima;
import ar.edu.utn.frba.dds.models.AlertaClimatica;
import java.util.ArrayList;
import java.util.List;

public class AlertasClimaticas {
  //private List<SubscriptoresAlertas> subscriptores = new ArrayList<>();
  private List<Accion> acciones = new ArrayList<>();
  private List<AlertaClimatica> alertas = new ArrayList<>();
  private final IservicioClima servicioClima;

  public AlertasClimaticas(IservicioClima servicioClima) {
    this.servicioClima = servicioClima;
  }

  public void actualizarAlertas() {
    List<AlertaClimatica> nuevasAlertas = servicioClima.obtenerAlertasClimaticas();
  }

  /*
  public void publicarAlertas() {
    subscriptores.forEach(subscriptor -> subscriptor.notificarAlertas(alertas));
  }
   */

  public void realizarAcciones() {
    acciones.forEach(accion -> {
      alertas.forEach(accion::realizar);
    });
  }

  public void onAlerta(Accion accion) {
    this.acciones.add(accion);
  }
}


/*

Observer

Hay un objeto observable ( cualquier cosa de la cual me interesa recibir notificaciones )

Tiene que tener un mensaje para registrar observadores
onAlerta(Accion accion)

nombre del mensaje: on + evento ( observador )


 */