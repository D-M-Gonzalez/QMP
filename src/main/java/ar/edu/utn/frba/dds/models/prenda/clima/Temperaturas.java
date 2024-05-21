package ar.edu.utn.frba.dds.models.prenda.clima;

public class Temperaturas {
  private int temperaturaMin;
  private int temperaturaMax;

  public Temperaturas(int temperaturaMin, int temperaturaMax) {
    this.temperaturaMin = temperaturaMin;
    this.temperaturaMax = temperaturaMax;
  }

  public int getTemperaturaMin() {
    return temperaturaMin;
  }

  public int getTemperaturaMax() {
    return temperaturaMax;
  }
}
