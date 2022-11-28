public class Pontuacao {
    private double[][] tabela = new double[6][10];
    private Partida partida;

    
    
    public void cod (Time time){
        tabela[time.getCod()][0] = time.getCod();
    }
    public void alterarVitorias(Time time, ListaPartida listaPartida){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            partida = listaPartida.getListaPartida()[i];
            if(partida != null){
                if(time.getCod() == partida.vencedor()){
                    aux++;
                }
            }

        }
        tabela[time.getCod()][3] = aux;
    }
    public void alterarDerrotas(Time time, ListaPartida listaPartida){
        int aux = 0;
        partida = listaPartida.getListaPartida()[time.getCod()];
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            if(time.getCod() == partida.vencedor()){
                aux++;
            }
        }
        tabela[time.getCod()][5]= aux;
    }
    public void alterarEmpates(Time time, ListaPartida listaPartida){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            partida = listaPartida.getListaPartida()[i];
            if(partida != null){
                if(partida.empate()){
                    aux++;
                }
            }
        }
        tabela[time.getCod()][4]=aux;
    }
    public void alterarJogos(Time time, ListaPartida listaPartida){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            partida = listaPartida.getListaPartida()[i];
            if(partida != null){
                if(time.getCod() == partida.getCod1() || time.getCod() == partida.getCod2()){
                    aux++;
                }
            }
        }
        tabela[time.getCod()][2] = aux;
    }

    public void alterarPontos(Time time, ListaPartida listaPartida){
        tabela[time.getCod()][1] = (getNumEmpates(time)) + (getNumVitoria(time) * 3);
    }

    public void golsFeitos(Time time, ListaPartida listaPartida){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            partida = listaPartida.getListaPartida()[i];
            if (partida != null) {
                if(time.getCod() == partida.getCod1()){
                    aux = aux + partida.getPontT1();
                }
                 else if(time.getCod() == partida.getCod2()){
                    aux = aux + partida.getPontT2();
                }
            }
        }
        tabela[time.getCod()][6] = aux;

    }
    public void golsSofridos(Time time, ListaPartida listaPartida){
        int aux = 0;
        for(int i = 0; i < listaPartida.getListaPartida().length; i++){
            partida = listaPartida.getListaPartida()[i];
            if(partida != null){
                if(time.getCod() == partida.getCod1()){
                    aux = aux + partida.getPontT2();
                }
                if(time.getCod() == partida.getCod2()){
                    aux = aux + partida.getPontT1();
                }
            }
        }
        tabela[time.getCod()][7] = aux;
    }
    public void saldoDeGols(Time time){
        tabela[time.getCod()][8] = getGolsFeitos(time) - getGolsSofridos(time);
    }
    public void aproveitamento(Time time){
        if(getNumVitoria(time) == 0){
            tabela[time.getCod()][9] = 0;
        }else{
            tabela[time.getCod()][9] = (getNumVitoria(time) / getJogos(time)) * 100;
        }
    }
    // getters basico
    public double getCod(Time time){
        return tabela[time.getCod()][0];
    }
    public double getPontos(Time time){
        return tabela[time.getCod()][1];
    }
    public double getJogos(Time time){
        return tabela[time.getCod()][2];
    }
    public double getNumVitoria(Time time){
        return tabela[time.getCod()][3];
    }
    public double getNumEmpates(Time time){
        return tabela[time.getCod()][4];
    }
    public double getNumDerrotas(Time time){
        return tabela[time.getCod()][5];
    }
    public double getGolsFeitos(Time time){
        return tabela[time.getCod()][6];
    }
    public double getGolsSofridos(Time time){
        return tabela[time.getCod()][7];
    }
    public double getSaldoGols(Time time){
        return tabela[time.getCod()][8];
    }
    public double getAproveitamento(Time time){
        return tabela[time.getCod()][9];
    }
}