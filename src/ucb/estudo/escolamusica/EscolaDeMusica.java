package ucb.estudo.escolamusica;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EscolaDeMusica {

    public static void main(String[] args){
       System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
       System.out.println("Iniciando a Orquestra");

        InstrumentoMusical [] banda = new InstrumentoMusical[4];

        banda[0] = new  Violao("Violão Classico","Madeira",6);
        banda[1] = new Piano("Piano de cauda","madeira e metal",5);
        banda[2] = new Bateria("Bateria Acustica","Madeira e metal", 5);
        banda[3] = new Saxofone("Saxofone","Latão","Alto");

        EscolaDeMusica em = new EscolaDeMusica();
        em.apresentar(banda);
    }

    public void apresentar(InstrumentoMusical[] instrumentos){
        System.out.println("Orquestra vai começar");

        System.out.println("Afinando");
        for (InstrumentoMusical instrumento : instrumentos){
            instrumento.afinar();
        }

        System.out.println("Instrumentos começaram a tocar");
        for(InstrumentoMusical instrumento : instrumentos){
            instrumento.tocar();
        }

        for (int i = 0; i<instrumentos.length; i++){
            System.out.println("Instrumento Musical" +(i + 1)+ ":");
            instrumentos[i].mostrarinformacoes();
            instrumentos[i].tocar();
            System.out.println(); //w
        }
    }
}

