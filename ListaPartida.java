public class ListaPartida {
    private Partida[] lista;
    private int index = 0;
    private Partida partida;
    public ListaPartida(){
        lista = new Partida[36];
    }
    public boolean incluiTime(Partida partida){
        if(index == lista.length) return false;
        lista[index] = partida;
        index++;
        return true;
    }
    public Partida buscaTime(int index ){
        if(index < 0 || index > lista.length)return null;
        return lista[index];
    }
    public Partida exluiTime(int index){
        return lista[index] = null;
    }
}
