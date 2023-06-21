
public class Pessoa {
	private String nome;//atributo de nome da pessoa
    private Pessoa [] numPessoas;//array de numero de pessoas
    private TeleSena[] jogos; //array que são as Tele Senas que a pessoa possui para concorrer

    public Pessoa (String nome, int qntdJogos) {//método construtor para a classe Pessoa contendo os atributos
        this.nome = nome;
        this.jogos = new TeleSena[qntdJogos];
    }
    
    //métodos get e set com os atributos

    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public TeleSena[] getJogos () {
        return this.jogos;
    }    

    public void setJogos(TeleSena[] jogos) {
        this.jogos = jogos;
    }

    
    //ToString
    public String toString () {
        return "Dados: " + "\nNome: "+ nome + "\nNúmeros da Tele Sena: " + jogos.length;
    }
}
