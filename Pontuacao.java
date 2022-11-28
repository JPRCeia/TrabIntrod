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
    public int getJogos(Time time){
        return tabela[time.getCod()][2];
    }
    public int getNumVitoria(Time time){
        return tabela[time.getCod()][3];
    }
    public int getNumEmpates(Time time){
        return tabela[time.getCod()][4];
    }
    public int getNumDerrotas(Time time){
        return tabela[time.getCod()][5];
    }
    public int getGolsFeitos(Time time){
        return tabela[time.getCod()][6];
    }
    public int getGolsSofridos(Time time){
        return tabela[time.getCod()][7];
    }
    public int getSaldoGols(Time time){
        return tabela[time.getCod()][8];
    }
    public int getAproveitamento(Time time){
        return tabela[time.getCod()][9];
    }
}