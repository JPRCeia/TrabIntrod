public class Pontuacao {
    private int[][] tabela = new int[6][10];
    private Time time;
    //aqui o bixo pega, tenho que termina ainda, basicamente eu to pegando partida por partida e colocando as info delas na matrix

    // aqui poga o vencedor de x partida e soma a vitoria na matrix 
    public void alterarVitorias(Partida partida){
        int codTime = partida.vencedor();
        if (codTime != -1){
            for(int i=0; i<tabela.length; i++){
                if(tabela[i][0] == partida.getCod1() || tabela[i][0] == partida.getCod2()){                  
                    tabela[i][3]++;
                }

            }
         }   
     }
     // mesma coisa que accima mas com o perdedor
     public void alteraDerrotas(Partida partida){
        int codTime = partida.perdedor();
        if (codTime != -1){
            for(int i=0; i<tabela.length; i++){
                if(tabela[i][0] == partida.getCod1() || tabela[i][0] == partida.getCod2()){           
                    tabela[i][6]++;
                }
            }
        }
    }
    // mesma coisa so que com empate
    public void alterarEmpate(Partida partida){
        int codTime = partida.vencedor();
        if(codTime == -1){
            for(int i =0; i<tabela.length;i++){
                if(tabela[i][0] == partida.getCod1() || tabela[i][0] == partida.getCod2()){
                    tabela[i][4]++;
                }
            }
        }
    }
    // getters basico
    public int getNumVitoria(int i){
        return tabela[i][3];
    }
    public int getNumDerrotas(int i){
        return tabela[i][5];
    }
    public int getNumEmpates(int i){
        return tabela[i][4];
    }
    // muda a pontuacao conforme as vitorias,empates,derrotas
    public void alterarPontos(){
        int codTime = time.getCod();
        for(int i=0; i<tabela.length; i++){
            if(tabela[i][0] == codTime){
               tabela[i][1] = (getNumEmpates(i) * 1) + ( getNumVitoria(i) * 3);   
            }
        }
    }
    // conta as partidas que participo
    public void alteraJogos(Partida partida) {
        int codTime1 = partida.getCod1();
        int codTime2 = partida.getCod2();
        for (int i = 0; i < tabela.length; i++) {
            if (codTime1 == tabela[i][0] || codTime2 == tabela[i][0]) {
                tabela[i][2] += 1;
            }
        }
    }
}