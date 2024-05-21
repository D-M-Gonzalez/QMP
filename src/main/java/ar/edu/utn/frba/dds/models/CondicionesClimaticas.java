package ar.edu.utn.frba.dds.models;

public class CondicionesClimaticas {
  private int temperatura;
  private float chancePrecipitaciones;

  public CondicionesClimaticas(int temperatura, float chancePrecipitaciones) {
    this.temperatura = temperatura;
    this.chancePrecipitaciones = chancePrecipitaciones;
  }

  public int getTemperatura() {
    return temperatura;
  }

  public boolean getLlueve() {
    return chancePrecipitaciones > 0.5;
  }
}
