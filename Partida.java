public class Partida {
    private String data;
    private int cod1;
    private int cod2;
    private String score;
    private int pontT1;
    private int pontT2;

    Partida(String data, Time time1, Time time2, int pontT1, int pontT2){
        this.data = data;
        this.cod1 = time1.getCod();
        this.cod2 = time2.getCod();
        this.pontT1 = pontT1;
        this.pontT2 = pontT2;
        this.score = time1.getPais() + " " + pontT1 + "X" + pontT2 + " " + time2.getPais();
    }

    public int vencedor(){
        if(getPontT1() > getPontT2()) return getCod1();
        if(getPontT2() > getPontT1()) return getCod2();
        else{
            return -1;
        }
    }
    public int perdedor(){
        if(getPontT1() < getPontT2()) return getCod1();
        if(getPontT2() < getPontT1()) return getCod2();
        else{
            return -1;
        }
    }

    public String toString(){
        return "Partida da data:" + data + " Resultado = " + score;
    }

    public int getCod1(){
        return this.cod1;
    }
    public int getCod2(){
        return this.cod2;
    }
    public int getPontT1(){
        return this.pontT1;
    }
    public int getPontT2(){
        return this.pontT2;
    }
    public void setPontT1(int pontT1) {
        this.pontT1 = pontT1;
    }
    public void setPontT2(int pontT2) {
        this.pontT2 = pontT2;
    }
}
