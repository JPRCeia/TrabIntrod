public class Time {
    private String pais;
    private int cod;
    Time(String pais, int cod){
        this.pais = pais;
        this.cod = cod;
    }
    public String getPais(){
        return pais; 
    }
    public int getCod (){
        return cod;
    }
    public String toString(){
        String msg = "Pais:" + pais + "Codigo:" + cod;
        return msg;
    }
}
