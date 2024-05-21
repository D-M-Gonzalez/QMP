package ar.edu.utn.frba.dds.models.proveedores;

import ar.edu.utn.frba.dds.interfaces.IservicioClima;

public class ProveedorDeClima {
  static ProveedorDeClima INSTANCE;
  private IservicioClima motor;

  static ProveedorDeClima getInstance() {
    return INSTANCE;
  }

  public IservicioClima getMotor() {
    return motor;
  }

  public void setMotor(IservicioClima motor) {
    this.motor = motor;
  }
}
