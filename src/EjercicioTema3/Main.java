package EjercicioTema3;

public class Main {
    public static void main(String[] args) {
        //En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
        //
        //Tened en cuenta que los textos pueden venir de un array de tipo String

        String [] nomCompleto = {"Erick ", "Flores " , "Gomez "} ;
        String nombreCompleto= "";
        for (String dato : nomCompleto) {
            nombreCompleto += dato;
        }
        System.out.println(nombreCompleto);
    }
}
