package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.EstadoPropuesta;
import ar.edu.utn.frba.dds.models.prenda.Prenda;
import java.util.ArrayList;
import java.util.List;

//ojo, el que propone tambien puede aceptar y rechazar
//agregar el dueño al guardarropas
public class Guardarropas {
  private List<Prenda> prendas = new ArrayList<>();
  private List<Propuesta> propuestas = new ArrayList<>();

  public List<Propuesta> propuestasPendientes() {
    return propuestas.stream()
        .filter(propuesta -> propuesta.getEstado() == EstadoPropuesta.PENDIENTE).toList();
  }

  public void proponer(PropuestaAgregar propuesta) {
    propuestas.add(propuesta);
  }
  public void proponer(PropuestaQuitar propuesta) {
    propuestas.remove(propuesta);
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }
}
