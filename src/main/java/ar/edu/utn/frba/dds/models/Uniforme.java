package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.interfaces.Iuniforme;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda prendaCalzado;

  public Uniforme (Iuniforme sastre) {
    prendaSuperior = sastre.fabricarPrendaSuperior();
    prendaInferior = sastre.fabricarPrendaInferior();
    prendaCalzado = sastre.fabricarPrendaCalzado();
  }
}
