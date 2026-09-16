import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radio, longitud, area;

        System.out.println("Calculo longitud y area");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();

        longitud = Operaciones.calcular_longitud_circunferencia(radio);
        area = Operaciones.calcular_area_circulo(radio);

        System.out.println("Radio: " + radio);
        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
