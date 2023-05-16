package POOIntroducao;

public class App {
    public static void main(String[] args) {
        
        
            //criar 3 objetos ResgistraAluno
            RegistraAluno ana = new RegistraAluno();
            RegistraAluno beto = new RegistraAluno();
            RegistraAluno carlos = new RegistraAluno();

            ana.setNome("Ana Machado");
            ana.setEndereco("Rua das Flores, 123");
            ana.setIdade("18");

            beto.setNome("Roberto da Silva");
            beto.setEndereco("Rua das Almas, 245");
            beto.setIdade("19");

            carlos.setNome("Carlos Alberto");
            carlos.setEndereco("Rua das nuvens, 378");
            carlos.setIdade("26");

            System.out.println(ana.getNome());
            System.out.println("Contador: "
            +RegistraAluno.getQauntidadeAlunos());
            }
            }

    

