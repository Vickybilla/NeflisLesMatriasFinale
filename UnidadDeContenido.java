package NeflisLesMatrias;

public class UnidadDeContenido implements Contenido {

    public String genero;

    public boolean vistoCompleto(Usuario unUsuario) {
        return unUsuario.estoEstaEnTuBolsa(this);

    }
    private Integer duracion;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer cuantoDura() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
}
