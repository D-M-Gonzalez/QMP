package ar.edu.utn.frba.dds.models.prenda;

import ar.edu.utn.frba.dds.enums.Alerta;
import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Formalidad;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;
import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;
import ar.edu.utn.frba.dds.models.prenda.clima.Temperaturas;
import ar.edu.utn.frba.dds.models.prenda.colores.Color;
import ar.edu.utn.frba.dds.models.prenda.colores.Colores;
import ar.edu.utn.frba.dds.models.prenda.materiales.Materiales;

import java.util.List;

public class Prenda {
  private ItipoPrenda tipo;
  private Materiales materiales;
  private Colores colores;
  private Temperaturas temperaturas;
  private Formalidad formalidad;
  private List<Alerta> climas;

  public Prenda(
      ItipoPrenda tipo,
      Colores colores,
      Materiales materiales,
      Formalidad formalidad,
      List<Alerta> climas) {
    this.tipo = tipo;
    this.colores = colores;
    this.materiales = materiales;
    this.formalidad = formalidad;
    this.climas = climas;
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

  public boolean isUsable(Alerta clima) {
    return climas.contains(clima);
  }

  public boolean isInformal() {
    return formalidad == Formalidad.INFORMAL;
  }
}
