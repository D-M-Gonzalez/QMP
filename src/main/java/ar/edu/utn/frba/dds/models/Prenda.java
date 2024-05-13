package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Formalidad;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;
import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;

public class Prenda {
  private ItipoPrenda tipo;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Trama trama;
  private Formalidad formalidad;

  public Prenda(
      ItipoPrenda tipo,
      Color colorPrimario,
      Color colorSecundario,
      Material material,
      Trama trama) {
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.trama = trama;
  }

  public Categoria getCategoria() {
    return tipo.getCategoria();
  }

  public ItipoPrenda getTipo() {
    return tipo;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Material getMaterial() {
    return material;
  }

  public Trama getTrama() {
    return trama;
  }

  public boolean isInformal() {
    return formalidad == Formalidad.INFORMAL;
  }
}
