public class ProduciDato extends Thread{

    Semaforo pieno;
    Semaforo vuoto;
    int tanti=11;
    final int attesa = 500;

    public ProduciDato(Semaforo s1,Semaforo s2){

        pieno=s1;
        vuoto=s2;
    }

    public void run(){

        for(int k=0;k<tanti;k++){

            vuoto.P();
            for(int i=1;i<Prod.buffer.length;i++){

                Prod.buffer[i]=k;

            }
            
            System.out.println("Scrittore dato scritto " + k);
            pieno.V();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        System.out.println("Scrittore termina scrittura dati");
        

    }

    
}
