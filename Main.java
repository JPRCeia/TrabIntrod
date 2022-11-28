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
        pontuacao.alterarJogos(time2);
        pontuacao.alterarJogos(time1);
        pontuacao.alterarVitorias(time2);
        pontuacao.alterarVitorias(time1);
        pontuacao.alterarDerrotas(time2);
        pontuacao.alterarDerrotas(time1);
        pontuacao.alterarEmpates(time2);
        pontuacao.alterarEmpates(time1);
        pontuacao.aproveitamento(time2);
        pontuacao.aproveitamento(time1);
        pontuacao.alterarPontos(time2);
        pontuacao.alterarPontos(time2);
        System.out.println(pontuacao.getJogos(time2));
        System.out.println(pontuacao.getAproveitamento(time2));
        System.out.println(pontuacao.getGolsFeitos(time2));
        System.out.println(pontuacao.getGolsSofridos(time2));
        System.out.println(pontuacao.getPontos(time2));
        

    }

}
