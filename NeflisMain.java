package NeflisLesMatrias;

public class NeflisMain {
    public static void main(String[] args) {
        Usuario fran = new Usuario();
        Usuario manu = new Usuario();
        Usuario vicky = new Usuario();
        Usuario flor = new Usuario();

        Serie serieSense8 = new Serie("Sense8", "Ciencia Ficcion");
        Temporada sense1 = new Temporada();
        Capitulo sensecap1 = new Capitulo(1, 40, "Ciencia Ficcion");
        Capitulo sensecap2 = new Capitulo(2, 46, "Ciencia Ficcion");
        serieSense8.agregarTemporada(sense1);
        sense1.setNumeroDeTemporada(1);
        sense1.agregarCapitulo(sensecap1);
        sense1.agregarCapitulo(sensecap2);
        Temporada sense2 = new Temporada();
        Capitulo sensecap3 = new Capitulo(3, 52, "Ciencia Ficcion");
        Capitulo sensecap4 = new Capitulo(4, 92, "Ciencia Ficcion");
        Capitulo sensecap5 = new Capitulo(5, 48, "Ciencia Ficcion");
        serieSense8.agregarTemporada(sense2);
        sense2.agregarCapitulo(sensecap3);
        sense2.agregarCapitulo(sensecap4);
        sense2.agregarCapitulo(sensecap5);

        Serie serieSherlock = new Serie("Sherlock", "Policial");

        Temporada sherlockTemp1 = new Temporada();
        Temporada sherlockTemp2 = new Temporada();
        Temporada sherlockTemp3 = new Temporada();

        serieSherlock.setActoresFijosDeLaSerie("Benedict Cumberbatch");
        serieSherlock.setActoresFijosDeLaSerie("Martin Freeman");

        serieSherlock.agregarTemporada(sherlockTemp1);
        sherlockTemp1.setNumeroDeTemporada(1);
        serieSherlock.agregarTemporada(sherlockTemp2);
        sherlockTemp2.setNumeroDeTemporada(2);
        serieSherlock.agregarTemporada(sherlockTemp3);
        sherlockTemp3.setNumeroDeTemporada(3);

        Capitulo sherlockcap1 = new Capitulo(1, 56, "Policial");
        Capitulo sherlockcap2 = new Capitulo(2, 67, "Policial");
        Capitulo sherlockcap3 = new Capitulo(3, 78, "Policial");
        Capitulo sherlockcap4 = new Capitulo(4, 60, "Policial");
        Capitulo sherlockcap5 = new Capitulo(5, 50, "Policial");
        Capitulo sherlockcap6 = new Capitulo(6, 48, "Policial");
        Capitulo sherlockcap7 = new Capitulo(7, 68, "Policial");
        Capitulo sherlockcap8 = new Capitulo(8, 58, "Policial");
        Capitulo sherlockcap9 = new Capitulo(9, 70, "Policial");
        Capitulo sherlockcap10 = new Capitulo(10, 98, "Policial");

        sherlockcap1.setActoresInvitados("Mark Gatiss");
        sherlockcap2.setActoresInvitados("Rupert Graves");
        sherlockcap3.setActoresInvitados("Louise Brealey");
        sherlockcap4.setActoresInvitados("Andrew Scott");
        sherlockcap5.setActoresInvitados("Amanda Abbington");
        sherlockcap6.setActoresInvitados("Lars Mikkelsen");
        sherlockcap7.setActoresInvitados("Keanu Reeves");
        sherlockcap8.setActoresInvitados("Tilda Swinton");
        sherlockcap9.setActoresInvitados("Rachel Weisz");
        sherlockcap10.setActoresInvitados("Charlize Theron");


        sherlockTemp1.agregarCapitulo(sherlockcap1);
        sherlockTemp1.agregarCapitulo(sherlockcap2);
        sherlockTemp1.agregarCapitulo(sherlockcap3);
        sherlockTemp2.agregarCapitulo(sherlockcap4);
        sherlockTemp2.agregarCapitulo(sherlockcap5);
        sherlockTemp2.agregarCapitulo(sherlockcap6);
        sherlockTemp3.agregarCapitulo(sherlockcap7);
        sherlockTemp3.agregarCapitulo(sherlockcap8);
        sherlockTemp3.agregarCapitulo(sherlockcap9);
        sherlockTemp3.agregarCapitulo(sherlockcap10);


        serieSense8.setActoresFijosDeLaSerie("Jamie Clayton");
        serieSense8.setActoresFijosDeLaSerie("Miguel Angel Silvestre");
        serieSense8.setActoresFijosDeLaSerie("Max Riemelt");

        sensecap1.setActoresInvitados("Tina Desai");
        sensecap2.setActoresInvitados("Alfonso Herrera");
        sensecap3.setActoresInvitados("Eréndira Ibarra");
        sensecap3.setActoresInvitados("Freema Agyeman");
        sensecap4.setActoresInvitados("Sukku Son");
        sensecap5.setActoresInvitados("Terrence Mann");

        Pelicula constantine = new Pelicula();
        constantine.setNombreDePelicula("Constantine");
        constantine.setDuracionDePelicula(120);
        constantine.setGenero("Fantasia");
        constantine.setActoresDePeliculas("Keanu Reeves");
        constantine.setActoresDePeliculas("Rachel Weisz");
        constantine.setActoresDePeliculas("Tilda Swinton");

        Pelicula elAbogadoDelDiablo = new Pelicula();
        elAbogadoDelDiablo.setNombreDePelicula("El Abogado Del Diablo");
        elAbogadoDelDiablo.setDuracionDePelicula(121);
        elAbogadoDelDiablo.setActoresDePeliculas("Al Pacino");
        elAbogadoDelDiablo.setActoresDePeliculas("Keanu Reeves");
        elAbogadoDelDiablo.setGenero("Terror");

        Pelicula drStrage = new Pelicula();
        drStrage.setNombreDePelicula("Dr. Strange Hechicero Supremo");
        drStrage.setGenero("Fantasia");
        drStrage.setDuracionDePelicula(149);
        drStrage.setActoresDePeliculas("Benedict Cumberbatch");
        drStrage.setActoresDePeliculas("Tilda Swinton");


        vicky.yaLoViste(drStrage);
        vicky.yaLoViste(sherlockcap1);
        vicky.yaLoViste(sherlockcap2);
        vicky.yaLoViste(sherlockcap3);
        vicky.yaLoViste(sherlockcap4);
        vicky.yaLoViste(sherlockcap5);
        vicky.yaLoViste(sherlockcap6);
        vicky.yaLoViste(sherlockcap7);
        vicky.yaLoViste(sherlockcap8);
        vicky.yaLoViste(sherlockcap9);
        vicky.yaLoViste(sherlockcap10);
        vicky.yaLoViste(constantine);


        manu.yaLoViste(constantine);
        manu.yaLoViste(sensecap1);
        manu.yaLoViste(sensecap2);

        serieSense8.cuantoDura();
        constantine.cuantoDura();


        manu.cuantasUnidadesDeContenidoViste();

        manu.visteCompletoEsto(serieSense8);

        sense1.cuantosMinutosDuraLatemporadaCompleta();

        Serie seriestrangerthings = new Serie("Stranger Things", "Ciencia Ficcion");
        Temporada stranger1 = new Temporada();
        stranger1.setNumeroDeTemporada(1);
        Capitulo strangercapitulo1 = new Capitulo(1, 58, "Ciencia Ficcion");
        Capitulo strangercapitulo2 = new Capitulo(2, 46, "Ciencia Ficcion");
        Capitulo strangercapitulo3 = new Capitulo(3, 52, "Ciencia Ficcion");
        Capitulo strangercapitulo4 = new Capitulo(4, 50, "Ciencia Ficcion");
        Temporada stranger2 = new Temporada();
        stranger2.setNumeroDeTemporada(2);
        Capitulo stranger2capitulo5 = new Capitulo(5, 42, "Ciencia Ficcion");
        Capitulo stranger2capitulo6 = new Capitulo(6, 44, "Ciencia Ficcion");
        Capitulo stranger2capitulo7 = new Capitulo(7, 48, "Ciencia Ficcion");
        Temporada stranger3 = new Temporada();
        stranger3.setNumeroDeTemporada(3);
        Capitulo strangercapitulo8 = new Capitulo(8, 40, "Ciencia Ficcion");
        Capitulo strangercapitulo9 = new Capitulo(9, 54, "Ciencia Ficcion");

        seriestrangerthings.agregarTemporada(stranger1);
        stranger1.agregarCapitulo(strangercapitulo1);
        stranger1.agregarCapitulo(strangercapitulo2);
        stranger1.agregarCapitulo(strangercapitulo3);
        stranger1.agregarCapitulo(strangercapitulo4);
        seriestrangerthings.agregarTemporada(stranger2);
        stranger2.agregarCapitulo(stranger2capitulo5);
        stranger2.agregarCapitulo(stranger2capitulo6);
        stranger2.agregarCapitulo(stranger2capitulo6);
        stranger2.agregarCapitulo(stranger2capitulo7);
        seriestrangerthings.agregarTemporada(stranger3);
        stranger3.agregarCapitulo(strangercapitulo8);
        stranger3.agregarCapitulo(strangercapitulo9);


        seriestrangerthings.setActoresFijosDeLaSerie("Winona Ryder");
        seriestrangerthings.setActoresFijosDeLaSerie("David Harbour");
        seriestrangerthings.setActoresFijosDeLaSerie("Finn Wolfhard");
        seriestrangerthings.setActoresFijosDeLaSerie("Millie Bobby Brown");

        strangercapitulo1.setActoresInvitados("Brat Pitt");
        strangercapitulo2.setActoresInvitados("Angelina Jolie");
        strangercapitulo3.setActoresInvitados("Ellen Page");
        strangercapitulo4.setActoresInvitados("Will Smith");
        stranger2capitulo5.setActoresInvitados("Erika Linder");
        stranger2capitulo6.setActoresInvitados("Adam Sandler");
        stranger2capitulo7.setActoresInvitados("Ruby Rose");
        strangercapitulo8.setActoresInvitados("Tom Cruise");
        strangercapitulo9.setActoresInvitados("Sandra Bullock");

        Pelicula redsocial = new Pelicula();
        redsocial.setNombreDePelicula("La Red Social");
        redsocial.setDuracionDePelicula(121);
        redsocial.setGenero("Drama");
        redsocial.setActoresDePeliculas("Jeese Elsenberg");
        redsocial.setActoresDePeliculas("Justin Timberlake");
        redsocial.setActoresDePeliculas("Andrew Garfield");


        fran.yaLoViste(strangercapitulo1);
        fran.yaLoViste(strangercapitulo2);
        fran.yaLoViste(strangercapitulo3);
        fran.yaLoViste(strangercapitulo4);
        fran.yaLoViste(stranger2capitulo5);
        fran.yaLoViste(stranger2capitulo6);
        fran.yaLoViste(redsocial);

        seriestrangerthings.cuantoDura();
        redsocial.cuantoDura();

        fran.cuantasUnidadesDeContenidoViste();
        fran.visteCompletoEsto(seriestrangerthings);
        stranger1.cuantosMinutosDuraLatemporadaCompleta();


        Serie seriebreakingbad = new Serie("Breaking Bad", "Drama");
        Temporada breakingbad1 = new Temporada();
        breakingbad1.setNumeroDeTemporada(1);
        Capitulo bbcapitulo1 = new Capitulo(1, 50, "Drama");
        Capitulo bbcapitulo2 = new Capitulo(2, 52, "Drama");
        Capitulo bbcapitulo3 = new Capitulo(3, 54, "Drama");
        Temporada breakingbad2 = new Temporada();
        breakingbad2.setNumeroDeTemporada(2);
        Capitulo bbcapitulo4 = new Capitulo(4, 44, "Drama");
        Capitulo bbcapitulo5 = new Capitulo(5, 60, "Drama");
        Capitulo bbcapitulo6 = new Capitulo(6, 42, "Drama");
        Capitulo bbcapitulo7 = new Capitulo(7, 48, "Drama");
        Temporada breakingbad3 = new Temporada();
        breakingbad3.setNumeroDeTemporada(3);
        Capitulo bbcapitulo8 = new Capitulo(8, 50, "Drama");

        seriebreakingbad.agregarTemporada(breakingbad1);
        breakingbad1.agregarCapitulo(bbcapitulo1);
        breakingbad1.agregarCapitulo(bbcapitulo2);
        breakingbad1.agregarCapitulo(bbcapitulo3);
        seriebreakingbad.agregarTemporada(breakingbad2);
        breakingbad2.agregarCapitulo(bbcapitulo4);
        breakingbad2.agregarCapitulo(bbcapitulo5);
        breakingbad2.agregarCapitulo(bbcapitulo6);
        breakingbad2.agregarCapitulo(bbcapitulo7);
        seriebreakingbad.agregarTemporada(breakingbad3);
        breakingbad3.agregarCapitulo(bbcapitulo8);

        seriebreakingbad.setActoresFijosDeLaSerie("Bryan Cranston");
        seriebreakingbad.setActoresFijosDeLaSerie("Aaron Paul");

        bbcapitulo1.setActoresInvitados("Harry Potter");
        bbcapitulo2.setActoresInvitados("Hermione Granger");
        bbcapitulo3.setActoresInvitados("Ron Weasley");
        bbcapitulo4.setActoresInvitados("Draco Malfoy");
        bbcapitulo5.setActoresInvitados("Albus Dumbledore");

        Pelicula elorigen = new Pelicula();
        elorigen.setNombreDePelicula("El Origen");
        elorigen.setDuracionDePelicula(148);
        elorigen.setGenero("Ficcion");
        elorigen.setActoresDePeliculas("Leonardo DiCaprio");
        elorigen.setActoresDePeliculas("Ellen Page");
        elorigen.setActoresDePeliculas("Joseph Gordon-Levitt");

        flor.yaLoViste(elorigen);
        flor.yaLoViste(bbcapitulo1);
        flor.yaLoViste(bbcapitulo2);
        flor.yaLoViste(bbcapitulo3);
        flor.yaLoViste(bbcapitulo4);
        flor.yaLoViste(bbcapitulo5);

        elorigen.cuantoDura();
        seriebreakingbad.cuantoDura();

        flor.cuantasUnidadesDeContenidoViste();
        flor.visteCompletoEsto(seriebreakingbad);
        breakingbad1.cuantosMinutosDuraLatemporadaCompleta();
        breakingbad2.cuantosMinutosDuraLatemporadaCompleta();

        System.out.println(fran.cuantasUnidadesDeContenidoViste());
        System.out.println(fran.visteCompletoEsto(seriestrangerthings));
        System.out.println(stranger3.cantidadDeCapitulosEnTemporada());
        System.out.println(fran.visteCompletoEsto(seriestrangerthings));
        System.out.println(seriestrangerthings.cuantoDura());
        System.out.println(stranger1.cuantosMinutosDuraLatemporadaCompleta());

        System.out.println(flor.cuantasUnidadesDeContenidoViste());
        System.out.println(flor.visteCompletoEsto(seriebreakingbad));
        System.out.println(breakingbad2.cantidadDeCapitulosEnTemporada());
        System.out.println(flor.visteCompletoEsto(seriebreakingbad));
        System.out.println(seriebreakingbad.cuantoDura());
        System.out.println(breakingbad1.cuantosMinutosDuraLatemporadaCompleta());

        System.out.println(manu.cuantasUnidadesDeContenidoViste());
        System.out.println(manu.visteCompletoEsto(constantine));
        System.out.println(sense1.cantidadDeCapitulosEnTemporada());
        System.out.println(manu.visteCompletoEsto(serieSense8));
        System.out.println(sense1.cuantosMinutosDuraLatemporadaCompleta());
        System.out.println(serieSense8.cuantoDura());
        System.out.println(sense1.ultimoCapituloDisponible());

        System.out.println(vicky.cuantasUnidadesDeContenidoViste());
        System.out.println(vicky.visteCompletoEsto(serieSherlock));
        System.out.println(sherlockTemp3.cantidadDeCapitulosEnTemporada());
        System.out.println(vicky.visteCompletoEsto(serieSense8));
        System.out.println(serieSherlock.cuantoDura());
        System.out.println(sherlockTemp1.cuantosMinutosDuraLatemporadaCompleta());
        System.out.println(sherlockTemp2.ultimoCapituloDisponible().getNumeroDeCapitulo());
        System.out.println(vicky.generosVistosPorUsuario());

        System.out.println(fran.generoPreferido());
        System.out.println(manu.generoPreferido());
        System.out.println(flor.generoPreferido());
        System.out.println(vicky.generoPreferido());

    }
}
