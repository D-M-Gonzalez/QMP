package ar.edu.utn.frba.dds.enums;

import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;

public enum TipoSuperior implements ItipoPrenda {
  REMERA,
  BUZO,
  MUSCULOSA,
  CAMISA,
  CHOMBA;

  public Categoria getCategoria() {
    return Categoria.SUPERIOR;
  }
}
