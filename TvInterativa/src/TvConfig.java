
public class TvConfig {
     
    boolean ligarDesligar = true;
    int canal = 0;
    int volume = 0;
 
    public void ligar() {
        ligarDesligar = !ligarDesligar;
    }

    public void aumentarCanal(){
       canal++;
    }
    public void diminuirCanal(){
        canal--;
     }
     public void aumentarVolume(){
        volume++;
     }
     public void diminuirVolume(){
         volume--;
      }
}
