package ar.edu.utn.frba.dds.models.prenda;

import ar.edu.utn.frba.dds.enums.Formalidad;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;
import ar.edu.utn.frba.dds.models.prenda.colores.Color;
import ar.edu.utn.frba.dds.models.prenda.colores.Colores;
import ar.edu.utn.frba.dds.models.prenda.materiales.Materiales;

public class Borrador {
  public TipoPrenda tipoPrenda;
  public Color colorPrimario;
  public Color colorSecundario;
  public Trama trama;
  public Material material;
  public Formalidad formalidad;

  public void construirPrenda(TipoPrenda tipoPrenda) {
    if (tipoPrenda == null) {
      throw new RuntimeException("No se puede añadir al borrador un tipo nulo");
    }

    this.tipoPrenda = tipoPrenda;
  }

  public void construirPrenda(Color colorPrimario, Color colorSecundario) {
    if (tipoPrenda == null) {
      throw new RuntimeException("Antes de construir las características debe asignar un tipo");
    }

    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public void construirPrenda(Material material, Trama trama) {
    if (tipoPrenda == null) {
      throw new RuntimeException("Antes de construir las características debe asignar un tipo");
    }

    if (!tipoPrenda.validarMaterial(material)) {
      throw new RuntimeException("El material elegido no es compatible con el tipo");
    }

    this.material = material;
    this.trama = trama != null ? trama : Trama.LISA;
  }

  public void construirPrenda(Formalidad formalidad) {
    if (tipoPrenda == null) {
      throw new RuntimeException("Antes de construir las características debe asignar un tipo");
    }

    this.formalidad = formalidad;
  }

  public Prenda generarPrenda() {
    if (tipoPrenda == null) {
      throw new RuntimeException("No se puede crear una prenda sin tipo");
    }

    if (colorPrimario == null) {
      throw new RuntimeException("No se puede crear una prenda sin color primario");
    }

    if (material == null) {
      throw new RuntimeException("No se puede crear una prenda sin material");
    }

    Colores colores = new Colores(colorPrimario, colorSecundario);
    Materiales materiales = new Materiales(material, trama);

    return new Prenda(tipoPrenda.getTipo(), colores, materiales, formalidad);
  }
}
