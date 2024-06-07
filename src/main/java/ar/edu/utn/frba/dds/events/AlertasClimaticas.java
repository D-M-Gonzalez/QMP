package ar.edu.utn.frba.dds.events;

import ar.edu.utn.frba.dds.interfaces.IservicioClima;
import ar.edu.utn.frba.dds.interfaces.SubscriptoresAlertas;
import ar.edu.utn.frba.dds.models.AlertaClimatica;
import java.util.ArrayList;
import java.util.List;

public class AlertasClimaticas {
  private List<SubscriptoresAlertas> subscriptores = new ArrayList<>();
  private List<AlertaClimatica> alertas = new ArrayList<>();
  private final IservicioClima servicioClima;

  public AlertasClimaticas(IservicioClima servicioClima) {
    this.servicioClima = servicioClima;
  }

  public void agregarAlertas() {
    List<AlertaClimatica> nuevasAlertas = servicioClima.obtenerAlertasClimaticas();
  }

  public void publicarAlertas() {
    subscriptores.forEach(subscriptor -> subscriptor.notificarAlertas(alertas));
  }
}
