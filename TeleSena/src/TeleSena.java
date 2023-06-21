import java.util.ArrayList;

public class TeleSena {
	private double valorVenda = 10.00;//valor constante da Tele Sena 
    //Array List dos conjuntos de números que as pessoas recebem para jogar
    ArrayList<Integer> conjunto1;
    ArrayList<Integer> conjunto2; 

    public TeleSena(){//método construtor da classe Tele Sena para os atributos acima
        this.valorVenda = valorVenda;
        this.conjunto1 = new ArrayList<>();
        this.conjunto2 = new ArrayList<>();
    }

    //métodos get para os atributos

    public double getValorVenda() {
        return this.valorVenda;
    }

    public ArrayList<Integer> getConjunto1() {
        return this.conjunto1;
    }

    public ArrayList<Integer> getConjunto2() {
        return this.conjunto2;
    }
}
