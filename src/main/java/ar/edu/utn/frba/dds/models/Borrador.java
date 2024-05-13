package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;

public class Borrador {
  public TipoPrenda tipoPrenda;
  public Color colorPrimario;
  public Color colorSecundario;
  public Trama trama;
  public Material material;

  public void construirPrenda(TipoPrenda tipoPrenda) {
    if (tipoPrenda == null) {
      throw new RuntimeException("No se puede añadir al borrador un tipo nulo");
    }

    this.tipoPrenda = tipoPrenda;
  }

  public void construirPrenda(
      Color colorPrimario, Color colorSecundario, Material material, Trama trama) {
    if (tipoPrenda == null) {
      throw new RuntimeException("Antes de construir las características debe asignar un tipo");
    }

    if (!tipoPrenda.validarMaterial(material)) {
      throw new RuntimeException("El material elegido no es compatible con el tipo");
    }

    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.trama = trama != null ? trama : Trama.LISA;
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

    return new Prenda(tipoPrenda.getTipo(), colorPrimario, colorSecundario, material, trama);
  }
}
