package ucb.estudo.escolamusica;

public class Bateria extends InstrumentoMusical{
    private int numeropecas;

    public Bateria(String nome, String material,int numeropecas) {
        super(nome, material);
        this.numeropecas = numeropecas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando um metal pesado na"+ nome + "com" + numeropecas + "peças");
        System.out.println("Boom!! Ta!! Boom!");
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das peles");
    }
    @Override
    public void mostrarinformacoes(){
        super.mostrarinformacoes();
        System.out.println("Numero de peças"+ getNumeroPecas());
    }

    public int getNumeroPecas(){
        return numeropecas;
    }
}
