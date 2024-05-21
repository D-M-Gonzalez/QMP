package ar.edu.utn.frba.dds.models.prenda.materiales;

import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;

public class Materiales {
  private Material material;
  private Trama trama;

  public Materiales(Material material, Trama trama) {
    this.material = material;
    this.trama = trama;
  }

  public Material getMaterial() {
    return material;
  }

  public Trama getTrama() {
    return trama;
  }
}
