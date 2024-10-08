/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montserratperez_sop_1;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Etol
 */
public class ProductorFuente extends Thread{
    
    int numeroDeProductores = 1;
    int sueldo = 16;
    int montoPorPagar = 0;
    String nombre;
    JTextField textField;
    
    public ProductorFuente(int numeroDeProductores, String nombre, int duracionDiaEnSegundos){
        this.numeroDeProductores = numeroDeProductores;
        this.nombre = nombre;
        this.duracionDiaEnSegundos = duracionDiaEnSegundos;
    }
    
    @Override
    public void run(){
        try{
             while (cantidadDeDiasEntreEnsamblado > 0){
                //se esta ensamblando
                sleep(duracionDiaEnSegundos * 1000/ numeroDeProductores * 4);
                //se revisa buffer
                xnombre.acquire();
                //debe estar solo
                xnombre2.acquire();
                //Interfaz
            
                sfag.release();
                 //item
                nsjan.release();
                textField.setText(Integer.toString(nsjan.availablePermits()));
                montoPorPagar = montoPorPagar + sueldo*24;
            }
        }catch(InterruptedException ex){
            Logger.getLogger(ProductorRAM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setTextField(JTextField textField) {
        this.textField = textField;
    }
    
      public void setNumeroDeProductores(int numeroDeProductores) {
        this.numeroDeProductores = numeroDeProductores;
    }
       public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoPorPagar() {
        return montoPorPagar;
    }

    public void setMontoPorPagar(int montoPorPagar) {
        this.montoPorPagar = montoPorPagar;
    }
}
