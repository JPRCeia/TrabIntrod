public class Partida {
    private String data;
    private int cod1,cod2;
    private String score;
    private Time time;
    private int pontT1,pontT2;

    Partida( String data,Time time1, Time time2,int pontT1, int pontT2){
        this.cod1 = time1.getCod();
        this.cod2 = time2.getCod();
        this.data = data;
        this.pontT1 = pontT1;
        this.pontT2 = pontT2;
        this.score = time1.getPais() + " " + pontT1 + "X" + pontT2 + "" + time2.getPais();
    }
    public String toString(){
        String msg = "Partida da data:" + data + " Resultado = " + score;
        return msg;
    }
    public int  getCod1(){
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
}   
