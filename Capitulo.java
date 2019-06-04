package NeflisLesMatrias;

import java.util.ArrayList;
import java.util.List;

public class Capitulo extends UnidadDeContenido {
    private Integer numeroDeCapitulo;
    private List <String> actoresInvitados= new ArrayList<>();
    private Integer duracionDeCapitulo;

   public Capitulo(Integer numeroDeCapitulo, Integer duracionDeCapitulo, String genero){
       super();
        this.setGenero(genero);
        this.numeroDeCapitulo=numeroDeCapitulo;
        this.setDuracionDeCapitulo(duracionDeCapitulo);

    }

   public void setActoresInvitados ( String unActorInvitado){
       this.actoresInvitados.add(unActorInvitado);
   }



    public Integer cuantoDura() {
        return duracionDeCapitulo;
    }

    public void setDuracionDeCapitulo(Integer duracionDeCapitulo) {
        this.duracionDeCapitulo = duracionDeCapitulo;
    }
    public boolean vistoCompleto(Usuario unUsuario) {
        return unUsuario.estoEstaEnTuBolsa(this);
    }

    public Integer getNumeroDeCapitulo() {
        return numeroDeCapitulo;
    }

    public void setNumeroDeCapitulo(Integer numeroDeCapitulo) {
        this.numeroDeCapitulo = numeroDeCapitulo;
    }
}
