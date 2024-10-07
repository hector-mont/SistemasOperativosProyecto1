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
public class ProductorCPU extends Thread {
    
    int numeroDeProductores = 1;
    int sueldo = 26;
    int montoPorPagar = 0;
    int duracionDiaEnSegundos;
    String nombre;
    JTextField textField;
    
    public ProductorCPU (int numeroDeProductores, String nombre, int duracionDiaEnSegundos){
        this.numeroDeProductores = numeroDeProductores;
        this.nombre = nombre;
        this.duracionDiaEnSegundos = duracionDiaEnSegundos;
    
    }
    
    @Override
    
    public void run(){
        try {
            while(cantidadDeDiasEntreLanzamientos > 0){
                //se esta ensamblando
                sleep(duracionDiaEnSegundos * 1000 / numeroDeProductores);
                // se revisa el espacio, de nuevo lo mismo que en el de placa, hay que definir la interfaz
                xnombre.acquire();
                //revisar si esta solo, tiene que
                xnombre2.acquire();
                //Interfaz
                
                //sale
                sfag.release();
                //item
                nsjan.release();
                textField.setText(Integer.toString(nsjan.availablePermits()));
                montoPorPagar = montoPorPagar + sueldo*24;
                        
            }
        
        
        }catch (InterruptedException ex) {
            Logger.getLogger(ProductorCPU.class.getName()).log(Level.SEVERE, null, ex);
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
