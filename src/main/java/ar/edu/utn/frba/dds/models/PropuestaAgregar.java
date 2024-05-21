package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.models.prenda.Prenda;

public class PropuestaAgregar extends Propuesta {
  public PropuestaAgregar(Prenda prenda, Guardarropas guardarropas) {
    this.guardarropas = guardarropas;
    this.prenda = prenda;

    guardarropas.agregarPropuesta(this);
  }

  protected void realizarAceptacion() {
    guardarropas.agregarPrenda(prenda);
  }

  protected void realizarDeshacer() {
    guardarropas.quitarPrenda(prenda);
  }
}
