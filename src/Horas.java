public class Horas {
    int horasTrab;
    double valorHora;
    double salaBruto;
    double retencion;
    double salaNeto;
    public void setHoras(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    public void setValor(double valorHora) {
        this.valorHora = valorHora;
    }
    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }
    public int getHoras() {
        return horasTrab;
    }
    public double getValor() {
        return valorHora;
    }
    public double getRetencion() {
        return retencion;
    }
    public double calcularBruto() {
        salaBruto = horasTrab * valorHora;
        return salaBruto;
    }
    public double calcularNeto() {
        salaNeto = salaBruto - salaBruto * retencion;
        return salaNeto;
    }
}
