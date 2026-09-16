public class Calculos {

    public static double calcular_salario_bruto(double horas_laboradas, double valor_hora) {
        double salario_bruto = horas_laboradas * valor_hora;
        return salario_bruto;
    }

    public static double calcular_retefuente(double horas_laboradas, double valor_hora, double pretencion) {
        double retefuente = (horas_laboradas * valor_hora) * pretencion;
        return retefuente;
    }

    public static double calcular_salario_neto(double salario_bruto, double retefuente) {
        double salario_neto = salario_bruto - retefuente;
        return salario_neto;
    }
}
