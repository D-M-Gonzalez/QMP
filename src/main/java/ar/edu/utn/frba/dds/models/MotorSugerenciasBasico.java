package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.interfaces.ImotorSugerencias;
import com.google.common.collect.Lists;
import java.util.List;

class MotorSugerenciasBasico implements ImotorSugerencias {
  public List<Sugerencia> generarSugerencias(Usuario usuario) {
    List<Prenda> prendasSuperiores = usuario.getPrendas().stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.SUPERIOR).toList();
    List<Prenda> prendasInferiores = usuario.getPrendas().stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.INFERIOR).toList();
    List<Prenda> calzados = usuario.getPrendas().stream()
        .filter(p -> p.getTipo().getCategoria() == Categoria.CALZADO).toList();

    //Uso una biblioteca como Guava para el producto cartesiano
    List<List<Prenda>> combinaciones =
        Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2))).toList();
  }

}
