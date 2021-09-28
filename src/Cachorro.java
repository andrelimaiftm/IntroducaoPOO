public class Cachorro {
    // Atributos: são as caracterisca do item(objeto) que queremos representar no
    // meio digital
    // <Tipo da variavel> nomeVariavel;
    String nome;// -> null
    String raca;
    char porte; // P -> pequeno, M -> Médio, G -> Grande -> ' '
    float idade;// -> 0.0
    String corPelo;
    String tipoFocinho;
    char sexo;
    int velocidade; // -> 0;
    float peso;
    String tipoPelo;
    String tipoOrelha;

    // Método -> são as ações que queremos representar de um objeto
    public void latir() {
        System.out.format("O cachorro %s está latindo: Au, Auuu, Auuu, Au\n", nome);
    }

    public void rosnar(String rosnado){
        System.out.format("O cachorro %s está rosnando: %s\n", nome, rosnado);
    }

    public void correr(){
        if(velocidade < 5){
            System.out.format("O cachorro %s está andando\n", nome);
        }else if(velocidade >= 5 && velocidade < 10){
            System.out.format("O cachorro %s está correndo\n", nome);
        }else{
            System.out.format("O cachorro %s está correndo muito\n", nome);
        }
    }

    public float pegaPeso(){
        return peso;
    }    

    public String abanarRabo(Boolean movimentoRabo, Boolean eRabico ){
        String resposta = "";
        if(movimentoRabo == true && eRabico == true){
            resposta = String.format("O cachorro %s está abanando a bunda", nome);
        }else if(movimentoRabo == true && eRabico == false){
            resposta = String.format("O cachorro %s está abanando o rabo", nome);
        }else if(movimentoRabo == false){
            resposta = String.format("O cachorro %s não está demonstrando reação", nome);
        }
        return resposta;
    }

}
