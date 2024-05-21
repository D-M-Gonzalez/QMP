package ar.edu.utn.frba.dds.models.prenda;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Formalidad;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;
import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;
import ar.edu.utn.frba.dds.models.prenda.clima.Temperaturas;
import ar.edu.utn.frba.dds.models.prenda.colores.Color;
import ar.edu.utn.frba.dds.models.prenda.colores.Colores;
import ar.edu.utn.frba.dds.models.prenda.materiales.Materiales;

public class Prenda {
  private ItipoPrenda tipo;
  private Materiales materiales;
  private Colores colores;
  private Temperaturas temperaturas;
  private Formalidad formalidad;

  public Prenda(
      ItipoPrenda tipo,
      Colores colores,
      Materiales materiales,
      Formalidad formalidad) {
    this.tipo = tipo;
    this.colores = colores;
    this.materiales = materiales;
    this.formalidad = formalidad;
  }

  public Categoria getCategoria() {
    return tipo.getCategoria();
  }

  public ItipoPrenda getTipo() {
    return tipo;
  }

  public Color getColorPrimario() {
    return colores.getColorPrimario();
  }

  public Color getColorSecundario() {
    return colores.getColorSecundario();
  }

  public Material getMaterial() {
    return materiales.getMaterial();
  }

  public Trama getTrama() {
    return materiales.getTrama();
  }

  public int getTemperaturaMax() {
    return temperaturas.getTemperaturaMax();
  }

  public int getTempraturaMin() {
    return temperaturas.getTemperaturaMin();
  }

  public boolean isInformal() {
    return formalidad == Formalidad.INFORMAL;
  }
}
