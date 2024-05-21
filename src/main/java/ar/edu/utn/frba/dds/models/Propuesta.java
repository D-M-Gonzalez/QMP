package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.EstadoPropuesta;
import ar.edu.utn.frba.dds.models.prenda.Prenda;

public abstract class Propuesta {
  protected Prenda prenda;
  protected Guardarropas guardarropas;
  private EstadoPropuesta estadoPropuesta = EstadoPropuesta.PENDIENTE;

  public void aceptarPropuesta() {
    this.estadoPropuesta = EstadoPropuesta.ACEPTADA;
    this.realizarAceptacion();
  }

  public void deshacerPropuesta() {
    this.estadoPropuesta = EstadoPropuesta.PENDIENTE;
    this.realizarDeshacer();
  }

  public void rechazarPropuesta() {
    this.estadoPropuesta = EstadoPropuesta.RECHAZADA;
  }

  public EstadoPropuesta getEstado() {
    return estadoPropuesta;
  }

  protected abstract void realizarAceptacion();

  protected abstract void realizarDeshacer();
}
