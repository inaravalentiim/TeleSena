import java.util.ArrayList;

public class ControleTeleSena extends TeleSena{
	    private int quantidadeVendida;//quantidade de tele senas vendidas
	    private double premios;//premio da telesena
	    private double lucro;//lucro gerado com as vendas
	    private String ganhadores;//o/os ganhadores da tele sena
	    private String[]nomeA; // array para sorteio de nomes
	    private String nome;// atributo usado para os nomes
	    private int[] sorteio;// array para sorteio 

	     
	    public ControleTeleSena() { //construtor da classe  ControleTeleSena
	        this.quantidadeVendida = quantidadeVendida;
	        this.premios = premios;
	        this.lucro = lucro;
	    }
	    
	    //métodos get e set com os atributos
	    
	    public double getPremios () {
	        return this.premios;
	    }

	    public double getLucro () {
	        return this.lucro;
	    }
	    
	    //método para sorteio de números
	    
	    public void sorteioNumeros(ArrayList<Integer> numerosS){
	        while (numerosS.size() < 25){// enquanto o tamanho do array for menor que 25, ele preenche sem repetir números
	            int numeroSorteado = (int) (Math.random()* 60) + 1;
	            if (!numerosS.contains(numeroSorteado)){
	                numerosS.add(numeroSorteado);
	            }
	        }
	    }
}
