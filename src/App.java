public class App {
    public static void main(String[] args) throws Exception {
        //<Nome da Classe> nomeObjeto;
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Cachorro cachorro3;

        cachorro1.nome = "Sofi";
        cachorro1.raca = "SRD";
        cachorro1.idade = 0.6f;
        cachorro1.peso = 6.0f;
        cachorro1.porte = 'P';
        cachorro1.sexo = 'F';
        cachorro1.tipoFocinho = "curto";
        cachorro1.tipoOrelha = "meia bomba";
        cachorro1.tipoPelo = "curto";
        cachorro1.corPelo = "branco com preto";
        cachorro1.velocidade = 4;


        cachorro2.nome = "Acelora";
        cachorro2.raca = "SRD";
        cachorro2.idade = 1;
        cachorro2.peso = 5.0f;
        cachorro2.porte = 'M';
        cachorro2.corPelo = "Branco com Preto";
        cachorro2.sexo = 'F';
        cachorro2.tipoFocinho = "comprido";
        cachorro2.tipoOrelha = "pequena e caida";
        cachorro2.tipoPelo = "curto";
        cachorro2.velocidade = 7;

        cachorro3 = cachorro2;

        //System.out.println(cachorro2.nome);
        //System.out.println(cachorro3.nome);

        cachorro3 = new Cachorro();

        cachorro3.nome = "Bilico";
        cachorro3.velocidade = 12;
        //System.out.println(cachorro2.nome);
        //System.out.println(cachorro3.nome);
        cachorro1.latir();
        /*cachorro2.latir();
        cachorro3.latir();
        cachorro1.correr();
        cachorro2.correr();
        cachorro3.correr();
        cachorro3.rosnar("gggrrrrr ...... ggggrrrr .... Au Au Au");*/
        float peso = cachorro1.pegaPeso();
        System.out.format("O cachorro %s tem peso de %.2f kg\n", cachorro1.nome, peso);
        System.out.println(cachorro1.abanarRabo(true, false));
        System.out.println(cachorro2.abanarRabo(true, false));
        System.out.println(cachorro3.abanarRabo(true, true));
        System.out.println(cachorro3.abanarRabo(false, true));

    }
}
