import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

    public static void cadastrarFuncionarios(Funcionario funcionario) {
        listaFuncionario.add(funcionario);
    }

    public static void excluir(Funcionario funcionario) {

        
        listaFuncionario.remove(funcionario);
    }

    public static ArrayList<Funcionario> listarFuncionarios() {
        return listaFuncionario;
    }

    // Verefica se esta vazio a lista
    public static boolean verificarListaVazia() {
        return listaFuncionario.isEmpty();
    }

    public static void deletar(Funcionario funcionario){

        
            listaFuncionario.remove(funcionario);   
    
        return;
    }    

}