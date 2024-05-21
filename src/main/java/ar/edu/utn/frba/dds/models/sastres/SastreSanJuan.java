package ar.edu.utn.frba.dds.models.sastres;

import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.TipoCalzado;
import ar.edu.utn.frba.dds.enums.TipoInferior;
import ar.edu.utn.frba.dds.enums.TipoSuperior;
import ar.edu.utn.frba.dds.interfaces.Iuniforme;
import ar.edu.utn.frba.dds.models.prenda.Borrador;
import ar.edu.utn.frba.dds.models.prenda.colores.Color;
import ar.edu.utn.frba.dds.models.prenda.Prenda;
import ar.edu.utn.frba.dds.models.prenda.TipoPrenda;
import java.util.ArrayList;

public class SastreSanJuan implements Iuniforme {
  private ArrayList<Material> materialesSuperior = new ArrayList<>() {
    {
      add(Material.PIQUE);
    }
  };
  private ArrayList<Material> materialesInferior = new ArrayList<>() {
    {
      add(Material.ACETATO);
    }
  };
  private ArrayList<Material> materialesCalzado = new ArrayList<>() {
    {
      add(Material.CUERO);
    }
  };

  private TipoPrenda tipoChomba = new TipoPrenda(TipoSuperior.CHOMBA, materialesSuperior);
  private TipoPrenda tipoPantalon = new TipoPrenda(TipoInferior.PANTALON, materialesInferior);
  private TipoPrenda tipoZapato = new TipoPrenda(TipoCalzado.ZAPATOS, materialesCalzado);
  private Color colorVerde = new Color(20,100,20);
  private Color colorGris = new Color(20,20,20);
  private Color colorMarron = new Color(100,50,50);

  public Prenda fabricarPrendaSuperior() {
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoChomba);
    borrador.construirPrenda(colorVerde, null);
    borrador.construirPrenda(Material.PIQUE, null);

    return borrador.generarPrenda();
  }

  public Prenda fabricarPrendaInferior() {
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoPantalon);
    borrador.construirPrenda(colorGris, null);
    borrador.construirPrenda(Material.ACETATO, null);

    return borrador.generarPrenda();
  }

  public Prenda fabricarPrendaCalzado() {
    Borrador borrador = new Borrador();
    borrador.construirPrenda(tipoZapato);
    borrador.construirPrenda(colorMarron, null);
    borrador.construirPrenda(Material.CUERO, null);

    return borrador.generarPrenda();
  }
}
