import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        System.out.println("***********************************************************\n");
        System.out.println("¡BIENVENIDOS A SU APLICACIÓN DE CONVERSOR DE MONEDA!\n");
        System.out.println("""
                1) Peso colombiano => Dólar
                2) Dólar => Peso colombiano
                3) Peso colombiano => Peso mexicano
                4) Peso mexicano => Peso colombiano
                5) Peso colombiano => Peso argentino
                6) Peso argentino => Peso comobiano
                7) Salir\n
                Elija una opción válida:
               """);
        System.out.println("***********************************************************\n");

        double option = write.nextDouble();
        System.out.println("Ingresa el valor a convertir: ");
    }
}
