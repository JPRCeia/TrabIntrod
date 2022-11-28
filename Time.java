public class Time {
    private String pais;
    private int cod;
    // Classe time setter,getters e to.string
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
