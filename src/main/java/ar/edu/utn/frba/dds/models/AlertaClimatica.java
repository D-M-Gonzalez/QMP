package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Alerta;

import java.util.Date;

public class AlertaClimatica {
  private final Alerta alerta;
  private final Date fecha;

  public AlertaClimatica(Alerta alerta, Date fecha) {
    this.alerta = alerta;
    this.fecha = fecha;
  }

  public Alerta getAlerta() {
    return alerta;
  }

  public Date getFecha() {
    return fecha;
  }
}
