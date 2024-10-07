/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montserratperez_sop_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Etol
 */
public class ProductorPlaca extends Thread {
    
    int numeroDeProductores = 1;
    int sueldo = 20;
    int montoPorPagar = 0;
    int duracionDiaEnSegundos ;
    JTextField textfield;
    
    String nombre;
    
    public ProductorPlaca(int numeroProductores, String nombre, int duracionDia){
     this.numeroDeProductores = numeroProductores;
     this.nombre = nombre;
     this.duracionDiaEnSegundos = duracionDiaEnSegundos;
    }
    
    @Override
    public void run(){
        try {
            //cantidadDiasEntreLanzamiento es de la interfaz
            while (cantidadDiasEntreEnsamble > 0){
                //se esta ensamblando la placa
                sleep(duracionDiaEnSegundos * 1000 / numeroDeProductores);
                // se revisa si hay espacio
                xnombresema.acquire();
                //debe estar solo
                xnombresema2.acquire();
                //Interfaz
                
                //sale
                xnombresema2.release();
                //item consumible
                nnombre.release();
                textField.setText(Integer.toString(nnombre.availablePermits()));
                montoPorPagar = montoPorpagar + sueldo *24;
            
            }
        
        }catch(InterruptedException ex){
            Logger.getLogger(ProductorPlaca.class.getName()).log(Level.SEVERE,null,ex);
        
        }
    }
    
    public void setTextField(JTextField textField){
        this.textField = textField;
    }
    
    public void setNumeroDeProductores(int numeroDeProductores){
        this.numeroDeProductores = numeroDeProductores;
    }
    
    public int getSueldo(){
        return sueldo;
    }
}
