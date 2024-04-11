package ar.edu.utn.frba.dds;

public class Atuendo {
    public PrendaSuperior prendaParteSuperior;
    public PrendaInferior prendaParteInferior;
    public PrendaAccesorio prendaAccesorio;
    public PrendaCalzado prendaCalzado;

    public Atuendo(PrendaSuperior parteSuperior, PrendaInferior parteInferior, PrendaAccesorio accesorio, PrendaCalzado calzado){
        prendaParteSuperior = parteSuperior;
        prendaParteInferior = parteInferior;
        prendaCalzado = calzado;
        prendaAccesorio = accesorio;
    }
}
