package JeuVideo;


public class Jeu {
    PNJ[] Boss = {new PNJ("Margit", (short) 10, new Dague((short) 4), (short)400),
            new PNJ("Morgott", (short) 500, new Epee((short) 400), (short)5000),
            new PNJ("Malenia", (short) 4000, new Epee((short) 6000), (short)10000)};

    PNJ[] Hero = {new PNJ("Tarnished", (short) 10, new Arc((short) 12), (short) 750),
            new PNJ("Sellen", (short) 32, new Arbalete((short) 62), (short) 1500)};

    
}
