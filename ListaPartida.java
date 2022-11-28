public class ListaPartida {
    private Partida[] lista = new Partida[36];
    // mesma coisa do lista time
   

    public void incluiPartida(Partida partida){
        for(int i = 0; i < lista.length;i++){
            if(lista[i] == null){
                lista[i] = partida;
                break;
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
    // getter lista pra usar na pontuacao
    public Partida[] getListaPartida(){
        return lista;
    }

}
