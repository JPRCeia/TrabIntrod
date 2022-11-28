public class ListaPartida {
    private Partida[] lista;
    // mesma coisa do lista time
    public ListaPartida(){
        lista = new Partida[36];
    }
    public void incluiPartida(Partida partida){
        for(int i = 0; i < lista.length;i++){
            if(lista[i] == null){
                lista[i] = partida;
            }
        }  
    }
    public Partida buscaPartida(int i ){
        if(i < 0 || i > lista.length)return null;
        return lista[i];
    }
    public Partida exluiPartida(int i){
        return lista[i] = null;
    }
}
