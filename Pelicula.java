package NeflisLesMatrias;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends UnidadDeContenido {

    private String nombreDePelicula;

    private Integer duracionDePelicula;

    private List<String> actoresDePeliculas = new ArrayList<>();

    public void setActoresDePeliculas(String unActortrizDePelicula) {
        this.actoresDePeliculas.add(unActortrizDePelicula);

    }

    public Integer cuantoDura() {
        return getDuracionDePelicula();
    }

    public void setDuracionDePelicula(Integer duracionDePelicula) {
        this.duracionDePelicula = duracionDePelicula;
    }


//prueba numero mil para dar por vista una pelicula.
// se entiende que una peli esta vista cuando esta agregada a la colleccion del usuario
    // ese metodo se hizo en el usuario pero esta mal. aplicaria misma solucion a capitulo


    public boolean vistoCompleto(Usuario unUsuario) {
        return unUsuario.estoEstaEnTuBolsa(this);
}


    public String getNombreDePelicula() {
        return nombreDePelicula;
    }

    public void setNombreDePelicula(String nombreDePelicula) {
        this.nombreDePelicula = nombreDePelicula;
    }

    public Integer getDuracionDePelicula() {
        return duracionDePelicula;
    }
}
