package ar.edu.utn.frba.dds.models.motores;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.interfaces.IfiltroSugerencia;
import ar.edu.utn.frba.dds.interfaces.ImotorSugerencias;
import ar.edu.utn.frba.dds.models.Guardarropas;
import ar.edu.utn.frba.dds.models.Usuario;
import ar.edu.utn.frba.dds.models.prenda.Prenda;
import ar.edu.utn.frba.dds.models.prenda.Sugerencia;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

class MotorSugerencias implements ImotorSugerencias {
  private ArrayList<IfiltroSugerencia> filtros = new ArrayList<>();

  private List<Prenda> filtrarPrendas(Usuario usuario, Guardarropas guardarropas) {
    List<Prenda> prendas = guardarropas.getPrendas();

    filtros.forEach(filtro -> filtro.getPrendasValidas(usuario, prendas));
    return prendas;
  }

  public List<Sugerencia> generarSugerencias(Usuario usuario, Guardarropas guardarropas) {
    List<Prenda> prendasSuperiores = this.filtrarPrendas(usuario, guardarropas).stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.SUPERIOR).toList();
    List<Prenda> prendasInferiores = this.filtrarPrendas(usuario, guardarropas).stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.INFERIOR).toList();
    List<Prenda> calzados = this.filtrarPrendas(usuario, guardarropas).stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.CALZADO).toList();

    List<List<Prenda>> combinaciones =
        Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2))).toList();
  }

  public Sugerencia generarSugerencia(Usuario usuario, Guardarropas guardarropas) {
    List<Prenda> prendasSuperiores = this.filtrarPrendas(usuario, guardarropas).stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.SUPERIOR).toList();
    List<Prenda> prendasInferiores = this.filtrarPrendas(usuario, guardarropas).stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.INFERIOR).toList();
    List<Prenda> calzados = this.filtrarPrendas(usuario, guardarropas).stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.CALZADO).toList();

    return new Sugerencia(prendasSuperiores.get(0), prendasInferiores.get(0), calzados.get(0));
  }

}
