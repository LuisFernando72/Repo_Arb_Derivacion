package a_derivacion;

import java.util.ArrayList;

/**
 * @author Luis Fernando Paxel
 */
public class OperacionesIz {

    private ArrayList<String> myArray = new ArrayList<>();

    public OperacionesIz() {
    }

    public String BuscarMayus(String texto) {
        myArray.clear();
        String frase2 = texto.replaceAll("\\s+", "");
        char[] myChars = frase2.toCharArray();
        String resultado = "";

        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                resultado = String.valueOf(texto.charAt(i));
                myArray.add(resultado);
            }
        }
        return resultado;
    }

    public ArrayList<String> getMyArray() {
        return myArray;
    }

    public void setMyArray(ArrayList<String> myArray) {
        this.myArray = myArray;
    }
}
