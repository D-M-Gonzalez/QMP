package ar.edu.utn.frba.dds.models.prenda.colores;

public class Colores {
  private Color colorPrimario;
  private Color colorSecundario;

  public Colores(Color colorPrimario, Color colorSecundario) {
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }
}
