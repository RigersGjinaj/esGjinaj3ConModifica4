import java.lang.reflect.Array;

public class Prod {

    protected static int[] buffer={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public static void main(String[] args) {

        Semaforo pieno =new Semaforo(0);
        Semaforo vuoto =new Semaforo(1);
        
        ProduciDato prod=new ProduciDato(pieno, vuoto);
        ConsumaDato cons=new ConsumaDato(pieno, vuoto,0);
        ConsumaDato cons1=new ConsumaDato(pieno, vuoto,1);
        ConsumaDato cons2=new ConsumaDato(pieno, vuoto,2);
        

        prod.start();
        cons.start();
        cons1.start();
        cons2.start();

        System.out.println("Main termine avvio thread");

    }
    
}
