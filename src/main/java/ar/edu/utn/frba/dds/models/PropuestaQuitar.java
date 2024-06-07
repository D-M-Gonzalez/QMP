package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.models.prenda.Prenda;

public class PropuestaQuitar extends Propuesta {

  public PropuestaQuitar(Prenda prenda, Guardarropas guardarropas) {
    this.guardarropas = guardarropas;
    this.prenda = prenda;

    guardarropas.proponer(this);
  }

  protected void realizarAceptacion() {
    guardarropas.quitarPrenda(prenda);
  }

  protected void realizarDeshacer() {
    guardarropas.agregarPrenda(prenda);
  }
}
