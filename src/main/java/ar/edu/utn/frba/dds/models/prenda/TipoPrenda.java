package ar.edu.utn.frba.dds.models.prenda;

import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;
import java.util.ArrayList;

public class TipoPrenda {
  private ItipoPrenda tipo;
  private ArrayList<Material> materialesPosibles = new ArrayList<>();

  public TipoPrenda(ItipoPrenda tipo, ArrayList<Material> materialesPosibles) {
    this.tipo = tipo;
    this.materialesPosibles = materialesPosibles;
  }

  public ItipoPrenda getTipo() {
    return tipo;
  }

  public boolean validarMaterial(Material material) {
    return materialesPosibles.contains(material);
  }
}
