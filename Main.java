public class Main {
    public static void main(String[] args) {
        Time time1 = new Time ("Brazil",1 );
        Time time2 = new Time ("Argentina", 2);

        Partida partida1 = new Partida ("22/8",time1,time2,2,0);
        System.out.println(partida1);
        
    }

}
