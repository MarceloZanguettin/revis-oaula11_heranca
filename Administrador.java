public class Administrador extends Empregado{

    private double ajudaCusto;

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    public double calcularSalario(double ajudaCusto){
        double salarioLiquido;
        salarioLiquido=calcularSalario()+ajudaCusto;
        return salarioLiquido;
    }
    
}
