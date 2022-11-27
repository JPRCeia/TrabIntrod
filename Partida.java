public class Partida {
    private String data;
    private int cod1,cod2;
    private String score;
    private Time time;

    Partida( String data,Time cod1, Time cod2,int pontT1, int pontT2){
        this.cod1 = cod1.getCod();
        this.cod2 = cod2.getCod();
        this.data = data;
        this.score = cod1.getPais() + " " + pontT1 + "X" + pontT2 + " " + cod2.getPais();
    }
    public String toString(){
        String msg = "Partida da data:" + data + " Resultado = " + score;
        return msg;
    }
}