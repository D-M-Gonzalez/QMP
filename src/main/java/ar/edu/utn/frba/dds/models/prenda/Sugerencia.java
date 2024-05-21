package ar.edu.utn.frba.dds.models.prenda;

public class Sugerencia {
  private Prenda superior;
  private Prenda inferior;
  private Prenda calzado;

  public Sugerencia(Prenda superior, Prenda inferior, Prenda calzado) {
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
  }
}
