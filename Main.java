public class Main {
    public static void main(String[] args) {
        Time time1 = new Time ("Brazil",0 );
        Time time2 = new Time ("Argentina", 1);

        Partida partida1 = new Partida ("22/8",time1,time2,2,0);
        Partida partida2 = new Partida ("2/12",time1,time2,2,3);
        Partida partida3 = new Partida ("15/2",time1,time2,0,0);
        ListaTime listaTime = new ListaTime();
        listaTime.incluiTime(time1);
        listaTime.incluiTime(time2);
        System.out.println(listaTime.buscaTime(0));
        System.out.println(listaTime.buscaTime(1));
        ListaPartida listaPartida = new ListaPartida();
        listaPartida.incluiPartida(partida3);
        listaPartida.incluiPartida(partida2);
        listaPartida.incluiPartida(partida1);
        System.out.println(listaPartida.buscaPartida(0));
        System.out.println(listaPartida.buscaPartida(1));
        System.out.println(listaPartida.buscaPartida(2));
        Pontuacao pontuacao = new Pontuacao();
        pontuacao.alterarJogos(time2, listaPartida);
        pontuacao.alterarJogos(time1, listaPartida);
        pontuacao.alterarVitorias(time2, listaPartida);
        pontuacao.alterarVitorias(time1, listaPartida);
        pontuacao.alterarDerrotas(time2, listaPartida);
        pontuacao.alterarDerrotas(time1, listaPartida);
        pontuacao.alterarEmpates(time2, listaPartida);
        pontuacao.alterarEmpates(time1, listaPartida);
        pontuacao.aproveitamento(time2);
        pontuacao.aproveitamento(time1);
        pontuacao.alterarPontos(time2, listaPartida);
        pontuacao.alterarPontos(time2, listaPartida);
        pontuacao.golsSofridos(time2, listaPartida);
        pontuacao.golsFeitos(time2, listaPartida);
        pontuacao.aproveitamento(time2);
        System.out.println(pontuacao.getJogos(time2));
        System.out.println(pontuacao.getAproveitamento(time2));
        System.out.println(pontuacao.getGolsFeitos(time2));
        System.out.println(pontuacao.getGolsSofridos(time2));
        System.out.println(pontuacao.getPontos(time2));
        

    }

}
