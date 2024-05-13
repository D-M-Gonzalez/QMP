package ar.edu.utn.frba.dds.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private int edad;
  private ArrayList<Prenda> prendas = new ArrayList<>();
  private ProveedorDeMotor proveedor;

  public Usuario(int edad, ProveedorDeMotor proveedor) {
    this.edad = edad;
    this.proveedor = proveedor;
  }

  public List<Sugerencia> generarSugerencias() {
    return this.proveedor.getMotor().generarSugerencias(this);
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public int getEdad() {
    return edad;
  }

  public ArrayList<Prenda> getPrendas() {
    return prendas;
  }
}
