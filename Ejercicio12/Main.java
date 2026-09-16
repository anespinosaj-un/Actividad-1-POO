public class Main {

    public static void main(String[] args) {
        double horas_laboradas, valor_hora, pretencion;
        double salario_bruto, salario_neto, retefuente;

        horas_laboradas = 48;
        valor_hora = 5000;
        pretencion = 12.5 / 100;

        salario_bruto = Calculos.calcular_salario_bruto(horas_laboradas, valor_hora);
        retefuente = Calculos.calcular_retefuente(horas_laboradas, valor_hora, pretencion);
        salario_neto = Calculos.calcular_salario_neto(salario_bruto, retefuente);

        System.out.println("El Salario Bruto es: " + salario_bruto);
        System.out.println("El valor de la retencion es: " + retefuente);
        System.out.println("El Salario Neto es: " + salario_neto);
    }
}
