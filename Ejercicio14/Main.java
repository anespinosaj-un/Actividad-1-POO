public class Main {

    public static void main(String[] args) {
        double numero, cubo, cuadrado;

        System.out.println("Calculo cuadrado y cubo de un numero");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        numero = scanner.nextDouble();

        cuadrado = Operaciones.calcular_cuadrado(numero);
        cubo = Operaciones.calcular_cubo(numero);

        System.out.println("Numero: " + numero);
        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Cubo: " + cubo);
        
        scanner.close();
    }
}
