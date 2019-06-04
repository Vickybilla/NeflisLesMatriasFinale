package NeflisLesMatrias;

import java.util.ArrayList;
import java.util.List;

public class Serie implements Contenido {
    private String nombreDeSerie;
    private List<String> actoresFijosDeLaSerie = new ArrayList<>();
    private List<Temporada> temporadas2 = new ArrayList<>();
    public String genero;
    private Temporada unaTemporada;

    public Serie(String nombreDeSerie, String genero){
        this.nombreDeSerie=nombreDeSerie;
        this.genero=genero;
    }

    public void setActoresFijosDeLaSerie (String unActor){
        this.actoresFijosDeLaSerie.add(unActor);
    }

    public void agregarTemporada(Temporada unaTemporada) {
        this.temporadas2.add(unaTemporada);
    }

    public Integer cuantasTemporadasTenes() {
        return this.temporadas2.size();
    }

    public boolean vistoCompleto(Usuario unUsuario) {
        return this.temporadas2.stream()
                .allMatch(temporada -> temporada.vistoCompleto(unUsuario));

    }

    public Integer cuantoDura(){
        return duracionDeTodaLaSerieEnMinutos();
    }

    public Integer duracionDeTodaLaSerieEnMinutos() {
        return temporadas2.stream()
                .mapToInt(unaTemporada -> unaTemporada.cuantosMinutosDuraLatemporadaCompleta())
                .sum();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}




