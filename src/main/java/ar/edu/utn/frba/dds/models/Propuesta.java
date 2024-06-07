package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.EstadoPropuesta;
import ar.edu.utn.frba.dds.models.prenda.Prenda;

//Ver de pasarlo a interface
public abstract class Propuesta {
  //los atributos son parte de cada propuesta especìfica y no de la clase abstracta
  //podrìas luego tener una propuesta de atuendos
  protected Prenda prenda;
  protected Guardarropas guardarropas;
  private EstadoPropuesta estadoPropuesta = EstadoPropuesta.PENDIENTE;

  //revisar los nombres, no es convieniente que lleve propuesta
  public void aceptarPropuesta() {
    this.estadoPropuesta = EstadoPropuesta.ACEPTADA;
    this.realizarAceptacion();
  }

  public void deshacerPropuesta() {
    this.estadoPropuesta = EstadoPropuesta.PENDIENTE;
    this.realizarDeshacer();
  }
  //Si no hace nada esto no hace falta, se podrìa eliminar directo
  public void rechazarPropuesta() {
    this.estadoPropuesta = EstadoPropuesta.RECHAZADA;
  }

  public EstadoPropuesta getEstado() {
    return estadoPropuesta;
  }

  protected abstract void realizarAceptacion();

  protected abstract void realizarDeshacer();
}
