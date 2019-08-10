
package mundopc;

/**
 *
 * @author Marcelo
 */
public class MundoPC {

  
    public static void main(String[] args) {
        Monitor monitorlg= new Monitor("LG",18);
        Teclado teclado1= new Teclado("bluetooth","toshiba");
        Raton raton1= new Raton("bluetooth","toshiba");
        Computadora computadoraToshiba = new Computadora ("computadoraToshiba",monitorlg,teclado1,raton1);
        
        Monitor hp=new Monitor("HP",21);
        Teclado teclado2=new Teclado("WIFI","HP");
        Raton raton2= new Raton ("WIFI","HP");
        Computadora computadorahp=new Computadora ("computadoraHP",hp,teclado2,raton2);
        
        Computadora pcArmada = new Computadora ("PC armada",hp,teclado1,raton1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadorahp);
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(pcArmada);
        
        orden1.mostrarOrden();
        
        Orden orden2=new Orden();
        orden2.agregarComputadora(pcArmada);
        orden2.agregarComputadora(computadorahp);
        orden2.agregarComputadora(computadoraToshiba);
        System.out.println();
        
        orden2.mostrarOrden();
        
        
    }
    
}
