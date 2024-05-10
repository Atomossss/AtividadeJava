public class Estagiario extends Funcionario implements Trabalhavel {

    private String horasTrabalho;
    private String supervisor;

    public Estagiario(String nome, int matricula, String horasTrabalho, String supervisor) {
        super(nome, matricula);
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
    }

    public String getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(String horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Carga horária: " + horasTrabalho + " Supervisor: " + supervisor;
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
