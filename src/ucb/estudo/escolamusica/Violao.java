package ucb.estudo.escolamusica;

public class Violao extends InstrumentoMusical {
    private int numerodecordas;

    public Violao(String nome, String material,int numerodecordas) {
        super(nome, material);
        this.numerodecordas = numerodecordas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando notas no" + nome + "com" + numerodecordas + "cordas");
        System.out.println("Dedilhando uma melodia romantica");
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das" + numerodecordas + "cordas");
    }
    @Override
    public void mostrarinformacoes(){
        super.mostrarinformacoes();
        System.out.println("Numero de Cordas" + numerodecordas);
    }

    public int getNumerodecordas(){
        return numerodecordas;
    }

}
