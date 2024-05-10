public class Desenvolvedor extends Funcionario implements Trabalhavel {

    private String tecnologiaDominada;

    public Desenvolvedor(String nome, int matricula, String tecnologiaDominada) {
        super(nome, matricula);
        this.tecnologiaDominada = tecnologiaDominada;
    }

    public String getTecnologiaDominada() {
        return tecnologiaDominada;
    }

    public void setTecnologiaDominada(String tecnologiaDominada) {
        this.tecnologiaDominada = tecnologiaDominada;
    }

    @Override
    public String toString() {
        return super.toString() + "Tecnologia que domina: " + tecnologiaDominada;
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
