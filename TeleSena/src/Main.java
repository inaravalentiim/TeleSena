import java.util.ArrayList;

public class Main {
	public static void main (String [] args) {
        TeleSena teleSena = new TeleSena();//novo objeto do tipo telesena
        ControleTeleSena controleTS = new ControleTeleSena();//novo objeto do tipo ControleTeleSena

        controleTS.sorteioNumeros(teleSena.getConjunto1());//chamada dos números sorteados que serão usados para comparação e saber quem ganhou
        controleTS.sorteioNumeros(teleSena.getConjunto2());

        System.out.println("Conjunto um: " + teleSena.getConjunto1());//printando na tela a informação do sorteio
        System.out.println("Conjunto dois: " + teleSena.getConjunto2());

        ArrayList<Pessoa> pessoas = new ArrayList<>();//ArrayList para pessoas
        pessoas.clear();//limpa o array
        String[] nomeSorteio = {"Inara", "Thiago", "Régis", "Mageli", "Vitor", "Gabriela", "Juliano", "Iolanda", "Eduardo", "Alice", "Márcio", "Claúdio", "Lorenzo", "Arthur", "Paulo", "Henrique", "Luiz" , "Laura", "Pietro", "Luizza"};//nomes aleatorios para sortear
        int i = 0;// variavel para posição
        Pessoa novaPessoa = new Pessoa(nomeSorteio[(int)(Math.random() * nomeSorteio.length + 1)],(int)(Math.random() * 15) + 1);// atribuindo a pessoa um sorteio de nomes
        pessoas.add(novaPessoa);//adicionando a pessoa

        while(pessoas.size() < 20){//metodo para fazer acontecer: adicionar nomes de pessoas no array de pessoas
            int nomeAT = (int)(Math.random() * nomeSorteio.length + 1);
            int qntdJogos = (int)(Math.random() * 15) + 1; // sorteia a quantidade de tele senas que cada uma dessas pessoas terá
            String nomeP;
            if(!pessoas.get(i).getNome().contains(nomeSorteio[nomeAT])){//adiciona a Pessoa os nomes e a quantidade de jogos
                nomeP = nomeSorteio[nomeAT];
                novaPessoa = new Pessoa(nomeP,qntdJogos);
                pessoas.add(novaPessoa);
                i++;
            }
        }

        for (int d = 0; d < pessoas.size(); d++){//printa as pessoas e sua quantidade de telesena
            System.out.println(pessoas.get(d).toString());
        }
    }
}
