package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.interfaces.Accion;
import ar.edu.utn.frba.dds.models.prenda.Sugerencia;
import ar.edu.utn.frba.dds.models.proveedores.ProveedorDeClima;
import ar.edu.utn.frba.dds.models.proveedores.ProveedorDeMotor;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private int edad;
  private List<Guardarropas> guardarropas = new ArrayList<>();
  private ProveedorDeMotor proveedorMotor;
  private ProveedorDeClima proveedorClima;
  private Sugerencia sugerenciaDiaria;
  private List<Accion> acciones = new ArrayList<>();

  public Usuario(int edad, ProveedorDeMotor proveedorMotor, ProveedorDeClima proveedorClima) {
    this.edad = edad;
    this.proveedorMotor = proveedorMotor;
    this.proveedorClima = proveedorClima;
  }

  /*
  public void notificarAlertas(List<AlertaClimatica> alertas) {
    alertas.forEach(alerta -> {
      acciones.forEach(accion -> {
        accion.realizar(alerta);
      });
    });
  }
  */

  public void generarSugerenciaDiaria() {
    sugerenciaDiaria = this.proveedorMotor.getMotor().generarSugerencia(this, guardarropas.get(0));
  }

  public List<Sugerencia> generarSugerencias(Guardarropas guardarropas) {
    return this.proveedorMotor.getMotor().generarSugerencias(this, guardarropas);
  }

  public int getEdad() {
    return edad;
  }

  public void agregarGuardarropas(Guardarropas guardarropas) {
    this.guardarropas.add(guardarropas);
  }

  public void quitarGuardarropas(Guardarropas guardarropas) {
    this.guardarropas.remove(guardarropas);
  }

  public CondicionesClimaticas obtenerCondicionesDelDia() {

    return proveedorClima.getMotor().obtenerCondicionesClimaticas();
  }
}
