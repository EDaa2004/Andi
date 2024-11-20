
package ec.edu.espoch.pilascuatro;

import Clases.EditorTexto;

/**
 *
 * @author Efren Andi
 */

        
public class PilasCuatro {

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        editor.escribir("Mama");
        editor.escribir("Lego");
        editor.desHacer();
        editor.rehacer();
        editor.escribir("a casa");
    }
}
