public class Gerente extends Funcionario implements Trabalhavel {

    private double bonusAnual;
    private String equipeNome;

    public Gerente(String nome, int matricula, double bonusAnual, String equipeNome) {

        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipeNome = equipeNome;

    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeNome() {
        return equipeNome;
    }

    public void setEquipeNome(String equipeNome) {
        this.equipeNome = equipeNome;
    }

    @Override
    public String toString() {

        return super.toString() + "Bônus anual: " + bonusAnual + "Nome da equipe sob gerência: " + equipeNome;
    }

    @Override
    public double calcularSalario() {

        return 0;
    }

    @Override
    public String relatarProgresso() {
        return null;
    }

    @Override
    public String trabalhar() {
        return null;
    }

}
