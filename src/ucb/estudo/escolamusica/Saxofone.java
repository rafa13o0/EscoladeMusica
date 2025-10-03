package ucb.estudo.escolamusica;

public class Saxofone extends InstrumentoMusical {
    private String tipo;

    public Saxofone(String nome, String material,String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando jazz no"+ nome + " "+ tipo);
        System.out.println("Forte melodia do" + nome);
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando as chaves do"+ nome);
    }

    @Override
    public void mostrarinformacoes(){
        super.mostrarinformacoes();
        System.out.println("O tipo do"+ nome + "é" + tipo);
    }

    public String getTipo(){
        return tipo;
    }
}
