
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Base del triangulo");
        double base = leer.nextDouble();
        System.out.println("Ingrese la Altura del triangulo");
        double altura = leer.nextDouble();

        double area = (base*altura)/2;

        BigDecimal bd = BigDecimal.valueOf(area);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double arearedondeada = bd.doubleValue();

        System.out.println("el area de triandulo de altura: "+ altura+" y base: "+base+" es: "+ arearedondeada);

    }
}