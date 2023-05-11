import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;
        int suma = 0;

        do{
            System.out.println("ingrese un numero entero positivo");
            while(!leer.hasNextInt()){
                System.out.println("ingrese un numero entero positivo");
                leer.next();
            }
            numero = leer.nextInt();
        }while (numero<0);

        for (int i = 1;i<=numero;i++){
            suma = suma +i;
        }

        System.out.println("la suma de numeros enteros hasta el numero que ingreso es: "+suma);
    }
}
