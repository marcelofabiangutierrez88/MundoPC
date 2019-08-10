
package mundopc;

/**
 *
 * @author Marcelo
 */
public class Monitor extends Computadora {
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;
    
    Monitor(){
        this.idMonitor=++contadorMonitores;
    }
    Monitor(String marca, double tamaño){
        this();
        this.marca = marca;
        this.tamaño=tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", tamanio=" + tamaño + '}';
    }
    
    
    
}
