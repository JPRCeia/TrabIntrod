public class ListaTime {
    private Time[] lista;
    //lista time, constructor
    public ListaTime(){
        lista = new Time[6];
    }
    // inclui time, como o usuario vai informa o codigo ele so confirma se não tem nada no lugar e coloca o time no array
    public void incluiTime(Time time){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                lista[i] = new Time(time.getPais(), time.getCod()) ;
                break;
            }
        }
    }
    // busca time só pega a posicão/codigo que quer olhar
    public Time buscaTime(int i ){
        if(i < 0 || i > lista.length)return null;
        return lista[i];
    }
    // exclui : pega a posicao e setta ela como null
    public Time exluiTime(int i){
        return lista[i] = null;
    }
}
