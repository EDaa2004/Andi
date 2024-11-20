
package Clases;

import java.util.Stack;

/**
 *
 * @author Eferen Andi
 * 
 */
public class EditorTexto {
    private Stack<String> pilaDeshacer;
    private Stack<String> pilaRehacer;
    private String contenido;

    public EditorTexto() {
        pilaDeshacer = new Stack<>();
        pilaRehacer = new Stack<>();
        contenido = "";
    }
    public void escribir(String texto){
        pilaDeshacer.push(contenido);
        contenido = contenido + texto;
        pilaRehacer.clear();
        System.out.println("Contenido Actual: "+ contenido );
    }
    public void desHacer (){
        if(!pilaDeshacer.isEmpty()){
            pilaRehacer.push(contenido);
            contenido = pilaDeshacer.pop();
            System.out.println("Deshacer: " + contenido);
            
        }else{
            System.out.println("No hay acciones para deahacer");
        }
    }
    public void rehacer(){
        if(!pilaRehacer.isEmpty()){
            pilaDeshacer.push(contenido);
            contenido = pilaRehacer.pop();
            System.out.println("Rehacer : "+ contenido);
        }else{
   System.out.println("no hay q hacer");
        }
    }
    
    
    
}
  