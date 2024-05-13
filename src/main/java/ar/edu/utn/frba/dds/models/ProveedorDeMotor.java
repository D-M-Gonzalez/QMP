package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.interfaces.ImotorSugerencias;

public class ProveedorDeMotor {
  static ProveedorDeMotor INSTANCE;
  private ImotorSugerencias motor;

  static ProveedorDeMotor getInstance() {
    return INSTANCE;
  }

  public ImotorSugerencias getMotor() {
    return motor;
  }

  public void setMotor(ImotorSugerencias motor) {
    this.motor = motor;
  }
}
