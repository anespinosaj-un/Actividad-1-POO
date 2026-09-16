import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        double suma, x, y;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de x: ");
        x = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de suma: ");
        suma = scanner.nextDouble();
        
        suma = Operaciones.operacion1(suma, x);
        
        System.out.print("Ingrese el valor de y: ");
        y = scanner.nextDouble();
        
        x = Operaciones.operacion2(x, y);
        suma = Operaciones.operacion3(suma, x, y);
        
        System.out.println("El valor de la suma es: " + suma);
        
        scanner.close();
    }
}
