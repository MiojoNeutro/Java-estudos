
public class SmartTv {
/*Esse algoritimo tem como finalidade
 *Representar uma televisão onde é
 *possível aumentar e diminuir o volume
 *mudar de canal e ligar e desligar a tv.
 *Não é possível mudar isso com o programa rodando.
 */
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
       ligada=true;
       //liga a tv.
    }
    public void desligar(){
        ligada=false;
        //desliga a tv.
    }
    public void aumentarVolume(){
        volume++;
        //aumenta o volume.
    }
    public void diminuirVolume(){
        volume--;
        //diminui o volume.
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
}