/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaautomaticacontactos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;

/**
 *
 * @author luis
 */
public class MiTarea extends Task<String>{
 private int hasta;
private String nombre;
    public MiTarea(String nombre) {
        this.nombre = nombre;
    }
 
    @Override
    protected String call() throws Exception {
       
       //ArrayList<Contacto> lista=AccesoDatos.recuperarContactos(nombre); 
       
       /* //Message, Progress
        for (int i=0; i<hasta; i++)
                {
                    try {
                        //Multithreading / Hyperthreading
                        Thread.sleep(20);
                        updateMessage("Voy por el "+i);
                        updateProgress(i, hasta);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CargaAutomaticaContactos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Voy por "+i);
                }
        return "Terminado";*/
    }
    
    
}
