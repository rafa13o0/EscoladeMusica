package ucb.estudo.escolamusica;

public class Piano extends InstrumentoMusical{
    private int numeroteclas;

    public Piano(String nome, String material, int numeroteclas) {
        super(nome, material);
        this.numeroteclas = numeroteclas;
    }

    @Override
    public void tocar() {
        System.out.println("Soando uma bela melodia no" + nome + "com" + numeroteclas + "teclas");
        System.out.println("Executando uma sonata classica");
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das cordas internas");
    }

    @Override
    public void mostrarinformacoes(){
        super.mostrarinformacoes();
        System.out.println("Numero de teclas" + numeroteclas);
    }
    public int getNumeroteclas(){
        return numeroteclas;
    }
}
