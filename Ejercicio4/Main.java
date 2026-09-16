import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double edjuan, edalber, edana, edmama;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos años tiene Juan? ");
        edjuan = scanner.nextDouble();

        edalber = Edades.calcular_edalber(edjuan);
        edana = Edades.calcular_edana(edjuan);
        edmama = Edades.calcular_edmama(edjuan, edalber, edana);

        System.out.println("la edad de la mama es: " + edmama);
        System.out.println("la edad de juan es: " + edjuan);
        System.out.println("la edad de albert es: " + edalber);
        System.out.println("la edad de ana es: " + edana);
    }
}
