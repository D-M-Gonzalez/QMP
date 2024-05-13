package ar.edu.utn.frba.dds.enums;

import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;

public enum TipoCalzado implements ItipoPrenda {
  BOTAS,
  CROCS,
  ZAPATILLAS,
  ZAPATOS;

  public Categoria getCategoria() {
    return Categoria.CALZADO;
  }
}
