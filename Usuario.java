package NeflisLesMatrias;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Usuario {

    public Contenido contenido;


    //contenidosVistosPorUsuario incluye TODOS los contenidos que vio que pueden NO ser completos.
    // p/e 2 capitulos de 1 temporada que no implican la serie completa

    private List<Contenido> contenidosVistosPorUsuario = new ArrayList<>();

    // metodo que  SOLO agrega cosas a la bolsa del usuario


    public void yaLoViste(Contenido unContenido) {
        this.contenidosVistosPorUsuario.add(unContenido);
    }

    // de toda la bolsa de contenido visto vamos a filtrar aquellos que se vieron completos
    // y a  crear una nueva bolsa con ellos

    public Boolean visteCompletoEsto(Contenido unContenido) {
        return unContenido.vistoCompleto(this);
    }

   /* public Boolean visteEstoCompleto(Contenido unContenido) {
        return contenidosVistosPorUsuario.contains(this);

    }*/

    public Integer cuantasUnidadesDeContenidoViste() {
        return this.contenidosVistosPorUsuario.size();
    }


    public Boolean estoEstaEnTuBolsa(Contenido unContenido) {
        return this.contenidosVistosPorUsuario.contains(unContenido);
    }

    //se pide una coleccion sin repetir de strings que son los generos
    // ( previo map(=transformacion) por ser atributos del contenido)

    public Set<String> generosVistosPorUsuario() {
        return contenidosVistosPorUsuario.stream()
                .map(contenido -> contenido.getGenero())
                .distinct()
                .collect(Collectors.toSet());
    }

    public List<Contenido> contenidosPorGenero(String ungenero) {
        return contenidosVistosPorUsuario.stream()
                .filter(contenido1 -> contenido1.getGenero().equals(ungenero))
                .collect(Collectors.toList());

    }

    public Integer minutosVistosporGenero(String unGenero) {
        return contenidosVistosPorUsuario.stream()
                .mapToInt(contenido -> contenido.cuantoDura())
                .sum();


    }


    public String generoPreferido() {
        return this.generosVistosPorUsuario().stream()
                .max(Comparator.comparing(genero -> this.minutosVistosporGenero(genero)))
                        .get();
    }
}









