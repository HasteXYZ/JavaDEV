package POOIntroducao;

    public class RegistraAluno {
        //declaração dos atributos do objeto
        private String nome;
        private String endereco;
        private String idade;
        private double notaMatematica;
        private double notaPortugues;
        private double notaCiencias;

        //atributo da classe
private static int contadorEstudante;
//

//metodos
//4 metodos de acesso - get

// define ou altera o nome do estudante
//criação de metodos
//retorna o nome do estudante
public String getNome(){
    return nome;
    }
    //retorna o endereço do estudante
    public String getEndereco(){
    return endereco;
    }
    // retorna idade do estudante
    public String getIdadee(){
    return idade;
    }
    //retorna a média do estudante
    public double getMedia(){
    double resultado = 0;
    resultado = (notaMatematica
    + notaPortugues
    + notaCiencias) / 3;
    
    return resultado;
    }
    // retorna a quantidade de estudantes cadastrados
    public static int getQauntidadeAlunos(){
    return contadorEstudante;
    }
    
    // define ou altera o nome do estudante
public void setNome(String temp){
    nome = temp;
    }
    // define ou altera o endereço do estudante
    public void setEndereco(String temp){
    endereco = temp;
    }
    // define ou altera o endereço do estudante
    public void setIdade(String string){
    idade = string;
    }
    // define ou altera o endereço do estudante
    public void setNotaMatematica(double temp){
    notaMatematica = temp;
    }
    // define ou altera o endereço do estudante
    public void setNotaPortugues(double temp){
    notaPortugues = temp;
    }
    // define ou altera o endereço do estudante
    public void setNotaCiencias(double temp){
    notaCiencias = temp;
    }

}
