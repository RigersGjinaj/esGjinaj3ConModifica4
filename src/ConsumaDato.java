public class ConsumaDato extends Thread{

    Semaforo pieno;
    Semaforo vuoto;
    int dato;
    int quale=0;

    public ConsumaDato(Semaforo s1,Semaforo s2,int quale){
        pieno=s1;
        vuoto=s2;
        this.quale=quale;


    }

    public void run(){
        if(quale==0){
        setName("paperino");
        while(true){
            pieno.P();
            for(int i=Prod.buffer.length-1;i>=0;i--){

                if(Prod.buffer[i]!=-1) {
                    dato=Prod.buffer[i];
                }
            }
            
            System.out.println("Lettore dato letto " +dato);
            System.out.println("Questo consumatore è  " +getName());
            vuoto.V();

        }
    }

    if(quale==1){
        setName("topolino");
        while(true){
            pieno.P();
            for(int i=Prod.buffer.length-1;i>=0;i--){

                if(Prod.buffer[i]!=-1) {
                    dato=Prod.buffer[i--];
                }
            }
            
            System.out.println("Lettore dato letto " +dato);
            System.out.println("Questo consumatore è  " +getName());
            vuoto.V();

        }
    }

    if(quale==2){
        setName("pippo");
        while(true){
            pieno.P();
            for(int i=Prod.buffer.length-1;i>=0;i--){

                if(Prod.buffer[i]!=-1) {
                    dato=Prod.buffer[i-=2];
                }
            }
            
            System.out.println("Lettore dato letto " +dato);
            System.out.println("Questo consumatore è  " +getName());
            vuoto.V();

        }
    }

    }

    
}
