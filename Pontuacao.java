public class Pontuacao {
    private int[][] tabela = new int[6][10];
    private ListaPartida listaPartida;
    private Partida partida;
    public void alterarVitorias(Time time){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            if(time.getCod() == partida.vencedor()){
                aux++;
            }
        }
        tabela[time.getCod()][3] = aux;
    }
    public void alterarDerrotas(Time time){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            if(time.getCod() == partida.vencedor()){
                aux++;
            }
        }
        tabela[time.getCod()][5]= aux;
    }
    public void alterarEmpates(Time time){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            if(time.getCod() == partida.empate()){  
                aux++;    
            }
        }
        tabela[time.getCod()][4]=aux;
    }
    public void alterarJogos(Time time){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            if(time.getCod() == partida.getCod1() || time.getCod() == partida.getCod2()){
                aux++;
            }
        }
        tabela[time.getCod()][2] = aux;
    }
    public void alterarPontos(Time time){  
        tabela[time.getCod()][1] = (getNumEmpates(time) * 1) + ( getNumVitoria(time) * 3);      
    }
    public void golsFeitos(Time time){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            if(time.getCod() == partida.getCod1()){
                 aux = aux + partida.getPontT1();
            }
            if(time.getCod() == partida.getCod2()){
                aux = aux + partida.getPontT2();
            }
            tabela[time.getCod()][6] = aux;
        }
    }
    public void golsSofridos(Time time){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            if(time.getCod() == partida.getCod1()){
                 aux = aux + partida.getPontT2();
            }
            if(time.getCod() == partida.getCod2()){
                aux = aux + partida.getPontT1();
            }
            tabela[time.getCod()][7] = aux;
        }
    }
    public void saldoDeGols(Time time){
        tabela[time.getCod()][8] = getGolsFeitos(time) - getGolsSofridos(time);
    }
    public void aproveitamento(Time time){
        tabela[time.getCod()][9] = (getJogos(time) / getNumVitoria(time)) * 100;
    }

    // getters basico
    public int getNumVitoria(Time time){
        return tabela[time.getCod()][3];
    }
    public int getNumDerrotas(Time time){
        return tabela[time.getCod()][5];
        }
    public int getNumEmpates(Time time){
        return tabela[time.getCod()][4];
    }
    public int getGolsSofridos(Time time){
        return tabela[time.getCod()][7];
    }
    public int getGolsFeitos(Time time){
        return tabela[time.getCod()][6];
    }
    public int getJogos(Time time){
        return tabela[time.getCod()][2];
    }
    public int getAproveitamento(Time time){
        return tabela[time.getCod()][9];
    }


    //aqui o bixo pega, tenho que termina ainda, basicamente eu to pegando partida por partida e colocando as info delas na matrix
/* 
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
    }*/
}