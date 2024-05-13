package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.TipoSuperior;
import ar.edu.utn.frba.dds.enums.Trama;
import ar.edu.utn.frba.dds.models.Borrador;
import ar.edu.utn.frba.dds.models.Color;
import ar.edu.utn.frba.dds.models.Prenda;
import ar.edu.utn.frba.dds.models.TipoPrenda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPrenda {
  private TipoPrenda tipoCamisa;
  private Color color1 = new Color(50,0,0);
  private Color color2 = new Color(100,0,0);

  @BeforeEach
  void init() {
    ArrayList<Material> materiales = new ArrayList<>(){
      {
        add(Material.ALGODON);
        add(Material.POLIESTER);
      }
    };

    tipoCamisa = new TipoPrenda(TipoSuperior.CAMISA, materiales);
  }

  @Test
  @DisplayName("Es posible crear una prenda con tipo")
  void CrearPrendaTipoOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,color2,Material.ALGODON, Trama.LUNARES);

    Prenda prenda = borrador.generarPrenda();

    assertEquals(TipoSuperior.CAMISA, prenda.getTipo());
  }

  @Test
  @DisplayName("Es posible crear una prenda con categoría")
  void CrearPrendaCategoriaOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,color2,Material.ALGODON, Trama.LUNARES);

    Prenda prenda = borrador.generarPrenda();

    assertEquals(Categoria.SUPERIOR, prenda.getCategoria());
  }

  @Test
  @DisplayName("Es posible crear una prenda con material")
  void CrearPrendaMaterialOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,color2,Material.ALGODON, Trama.LUNARES);

    Prenda prenda = borrador.generarPrenda();

    assertEquals(Material.ALGODON, prenda.getMaterial());
  }

  @Test
  @DisplayName("Es posible crear una prenda con color primario")
  void CrearPrendaColorPrimarioOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,color2,Material.ALGODON, Trama.LUNARES);

    Prenda prenda = borrador.generarPrenda();

    assertEquals(color1, prenda.getColorPrimario());
  }

  @Test
  @DisplayName("Es posible crear una prenda con color secundario")
  void CrearPrendaColorSecundarioOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,color2,Material.ALGODON, Trama.LUNARES);

    Prenda prenda = borrador.generarPrenda();

    assertEquals(color2, prenda.getColorSecundario());
  }

  @Test
  @DisplayName("Es posible crear una prenda con trama")
  void CrearPrendaTramaOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,color2,Material.ALGODON, Trama.LUNARES);

    Prenda prenda = borrador.generarPrenda();

    assertEquals(Trama.LUNARES, prenda.getTrama());
  }

  @Test
  @DisplayName("Es posible crear una prenda sin color secundario")
  void CrearPrendaSinColorSecundarioOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,null,Material.ALGODON, Trama.LUNARES);

    Prenda prenda = borrador.generarPrenda();

    assertNull(prenda.getColorSecundario());
  }

  @Test
  @DisplayName("Es posible crear una prenda sin trama y que sea LISA")
  void CrearPrendaSinTramaOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(color1,null,Material.ALGODON, null);

    Prenda prenda = borrador.generarPrenda();

    assertEquals(Trama.LISA, prenda.getTrama());
  }

  @Test
  @DisplayName("No es posible crear una prenda sin tipo")
  void CrearPrendaSinTipo(){
    Borrador borrador = new Borrador();

    RuntimeException thrown = assertThrows(
        RuntimeException.class,
        borrador::generarPrenda,
        "Se esperar excepción en la creación de Prenda"
    );

    assertTrue(thrown.getMessage().contains("No se puede crear una prenda sin tipo"));
  }

  @Test
  @DisplayName("No es posible crear una prenda sin color primario")
  void CrearPrendaSinColorPrimario(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);
    borrador.construirPrenda(null,null,Material.ALGODON, Trama.LUNARES);

    RuntimeException thrown = assertThrows(
        RuntimeException.class,
        borrador::generarPrenda,
        "Se esperar excepción en la creación de Prenda"
    );

    assertTrue(thrown.getMessage().contains("No se puede crear una prenda sin color primario"));
  }

  @Test
  @DisplayName("No es posible setear color en el borrador sin tipo primero")
  void SetearColorBorradorSinTipo(){
    Borrador borrador = new Borrador();

    RuntimeException thrown = assertThrows(
        RuntimeException.class,
        () -> borrador.construirPrenda(color1,null,Material.ALGODON, Trama.LUNARES),
        "Se esperar excepción en la creación de Prenda"
    );

    assertTrue(thrown.getMessage().contains("Antes de construir las características debe asignar un tipo"));
  }

  @Test
  @DisplayName("No es posible crear una prenda con un material incompatible")
  void CrearPrendaMaterialTipoNoOK(){
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoCamisa);

    RuntimeException thrown = assertThrows(
        RuntimeException.class,
        () -> borrador.construirPrenda(color1,null,Material.JEAN, Trama.LUNARES),
        "Se esperar excepción en la creación de Prenda"
    );

    assertTrue(thrown.getMessage().contains("El material elegido no es compatible con el tipo"));
  }
}
