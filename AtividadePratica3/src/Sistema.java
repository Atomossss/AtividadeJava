public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Registrar Estagiário");
        System.out.println("2) Registrar Gerente");
        System.out.println("3) Registrar Desenvolvedor");
        System.out.println("4) Exibir funcionários cadastrados");
        System.out.println("5) Excluir um funciónario");
        System.out.println("0) Sair");
        System.out.print("Selecione uma das opcões: ");

    }


    private static void verificarOpcao(int op) {

        String nome;
        int matricula;
        String horasTrabalho;
        String superVisor;
        String tecnologiaDominada;
        double bonusAnual;
        String equipeNome;

        switch (op) {
            case 1:

            System.out.println("\nAdicione o nome do estagiário ");
            System.out.print("Nome: ");
            nome = Console.lerString();

            System.out.println("\nAdicione a matrícula do estagiário ");
            System.out.print("Matrícula:  ");
            matricula = Console.lerInt();

            System.out.println("\nAdicione as horas trabalhadas: ");
            System.out.print("Horas:  ");
            horasTrabalho = Console.lerString();

            System.out.println("\nAdicione o nome do supervisor:");
            System.out.print("Nome supervisor:  ");
            superVisor = Console.lerString();

            Estagiario e = new Estagiario(nome, matricula,horasTrabalho,superVisor);
           

            Cadastro.cadastrarFuncionarios(e);
           
            System.out.println("Estagiário cadastrado");

            break;

            case 2:

            System.out.println("\nAdicione o nome do gerente ");
            System.out.print("Nome: ");
            nome = Console.lerString();

            System.out.println("\nAdicione a matrícula do gerente ");
            System.out.print("Matrícula:  ");
            matricula = Console.lerInt();

            System.out.println("\nAdicione o bônus Anual das horas trabalhadas: ");
            System.out.print("Bônus salário:  ");
            bonusAnual = Console.lerDouble();

            System.out.println("\nAdicione o nome da equipe gerenciada:");
            System.out.print("Nome equipe:  ");
            equipeNome= Console.lerString();

            Gerente g = new Gerente(nome, matricula,bonusAnual,equipeNome);
           

            Cadastro.cadastrarFuncionarios(g);
           
            System.out.println("Gerente cadastrado");

            break;

            case 3:

            System.out.println("\nAdicione o nome do desenvolvedor ");
            System.out.print("Nome: ");
            nome = Console.lerString();

            System.out.println("\nAdicione a matrícula do desenvolvedor ");
            System.out.print("Matrícula:  ");
            matricula = Console.lerInt();

            System.out.println("\nAdicione a tecnologia dominada: ");
            System.out.print("Tecnologia:  ");
            tecnologiaDominada = Console.lerString();

        

            Desenvolvedor d = new Desenvolvedor(nome, matricula,tecnologiaDominada);
           

            Cadastro.cadastrarFuncionarios(g);
           
            System.out.println("Gerente cadastrado");

            break;

            case 4:

            System.out.println("\nListar Filmes Cadastrados");

                

            if (Cadastro.listarFuncionarios().size() == 0) {

                System.out.println("\nSem Funciónarios cadastrados");
                return; 

            }

            for (Funcionario funTemp : Cadastro.listarFuncionarios()) {

                System.out.println(funTemp.toString());

            }

            break;

            case 5:

            System.out.println("\nDigite a nome para excluir um funcinário: ");
            nome = Console.lerString();

            System.out.println("\nDigite a mátricula para excluir um funcinário: ");
            matricula = Console.lerInt();
                     
            Cadastro.deletar();



        }
    }
}
