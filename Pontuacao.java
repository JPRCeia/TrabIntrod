public class Pontuacao {
    private int[][] tabela = new int[6][10];
    private Time time;
    private Partida partida;


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
    public int getNumVitoria(int i){
        return tabela[i][3];
    }
    public int getNumDerrotas(int i){
        return tabela[i][5];
    }
    public int getNumEmpates(int i){
        return tabela[i][4];
    }
    public void alterarPontos(){
        int codTime = time.getCod();
        for(int i=0; i<tabela.length; i++){
            if(tabela[i][0] == codTime){
               tabela[i][1] = (getNumEmpates(i) * 1) + ( getNumVitoria(i) * 3);   
            }
        }
    }
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