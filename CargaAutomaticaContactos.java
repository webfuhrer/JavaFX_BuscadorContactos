/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaautomaticacontactos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author luis
 */
public class CargaAutomaticaContactos extends Application{
TextField texto_busqueda=null;
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        VBox v=new VBox(20);
        Label lbl_resultado=new Label();
         texto_busqueda=new TextField();
         ProgressBar barra=new ProgressBar(); 
        barra.setProgress(0);
        String nombre="Pepe";
        String nombre_buscado="pE";
    //    if (nombre.toUpperCase().contains(nombre_buscado.toUpperCase()))
         EventHandler<KeyEvent> oyente_teclas=new EventHandler<KeyEvent>(){
           public void handle(KeyEvent t)
            {
//                
//                //1-vER QUÉ PONE EN EL CAMPO
//               // ArrayList<Contacto> contactos=AccesoDatos.devolverContactos(texto_busqueda.getText());
//               MiTarea m=new MiTarea(50);
//               
//               Thread hilo=new Thread(m);
//               hilo.setDaemon(true);
//               hilo.start();
//               lbl_resultado.textProperty().bind(m.messageProperty());
//               barra.progressProperty().bind(m.progressProperty());
//               m.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
//               
//                    public void handle(WorkerStateEvent evento)
//                    {
//                            System.out.println("La tarea me devuelve: "+m.getValue());
//                    }
//               });
//                //2-Se lo paso a una tarea
            }
        };
        
        texto_busqueda.setOnKeyReleased(oyente_teclas);
        
        v.getChildren().addAll(texto_busqueda, lbl_resultado, barra);
        Scene scene=new Scene(v, 200, 200);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
