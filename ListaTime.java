public class ListaTime {
    private Time[] lista;
    
    public ListaTime(){
        lista = new Time[6];
    }
    public void incluiTime(Time time){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                lista[i] =  time;
            }
        }
    }
    public Time buscaTime(int i ){
        if(i < 0 || i > lista.length)return null;
        return lista[i];
    }
    public Time exluiTime(int i){
        return lista[i] = null;
    }
}
