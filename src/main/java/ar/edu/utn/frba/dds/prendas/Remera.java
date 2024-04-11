package ar.edu.utn.frba.dds.prendas;

import ar.edu.utn.frba.dds.PrendaSuperior;
import ar.edu.utn.frba.dds.enums.categorias;
import ar.edu.utn.frba.dds.enums.colores;
import ar.edu.utn.frba.dds.enums.mangas;
import ar.edu.utn.frba.dds.enums.motivos;

public class Remera extends PrendaSuperior {
    public mangas manga;

    public void Prenda(){
        categoria = categorias.PARTE_SUPERIOR;
    }

    public void indicarManga(mangas nuevaManga){
        manga = nuevaManga;
    }
}
