public class ListaTime {
    private Time[] lista;
    private int index=0;
    private Time time;
    public ListaTime(){
        lista = new Time[6];
    }
    public boolean incluiTime(Time time){
        if(index == lista.length) return false;
        lista[index] = time;
        index++;
        return true;
    }
    public Time buscaTime(int index ){
        if(index < 0 || index > lista.length)return null;
        return lista[index];
    }
    public Time exluiTime(int index){
        return lista[index] = null;
    }





}
