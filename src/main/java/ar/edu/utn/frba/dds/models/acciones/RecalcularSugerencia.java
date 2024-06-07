package ar.edu.utn.frba.dds.models.acciones;

import ar.edu.utn.frba.dds.interfaces.Accion;
import ar.edu.utn.frba.dds.models.AlertaClimatica;
import ar.edu.utn.frba.dds.models.Usuario;

public class RecalcularSugerencia implements Accion {
    private Usuario usuario;

    public RecalcularSugerencia(Usuario usuario) {
        this.usuario = usuario;
    }

    public void realizar(AlertaClimatica alerta) {
        usuario.generarSugerenciaDiaria();
    }
}
