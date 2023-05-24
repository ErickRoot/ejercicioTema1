package EjercicioTema2;

public class Main {
    public static void main(String[] args) {
        // Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con IVA incluido.
        preConIva(50);// precio recibido
    }
     public static void preConIva(double precio){
            double suma = precio + (16*precio/100);// En México el IVA es del 16%
        System.out.println(suma); // Se muestra el precio mas el IVA
    }
}
