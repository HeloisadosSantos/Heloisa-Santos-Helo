package POOintroducao.PooINtroducao;

/**
 * App
 */
public class App {

    public class AppRegistraAluno {
        public static void main(String[] args) {

            //criar 3 objetos ResgistraAluno
            RegistraAluno ana = new RegistraAluno();
            RegistraAluno beto = new RegistraAluno();
            RegistraAluno carlos = new RegistraAluno();

           //altera as informações com set
            ana.setNome("Ana Machado");
            ana.setEndereco("Rua das Flores,123");
            ana.setIdade(29);
            ana.setNotaCiencias(9.5);
            ana.setNotaMatematica(8.3);
            ana.setNotaPortugues(7.5);


            beto.setNome("Roberto da Silva");
            carlos.setNome("Carlos Alberto");

            //printa com as informações com o get(acessa as informações)
            System.out.println(ana.getNome());
            System.out.println(ana.getEndereco());
            System.out.println(ana.getIdade());   
            System.out.println(ana.getMedia());
            System.out.println("========================");
            System.out.println("Contador: "
                    + RegistraAluno.getQuantidadeAlunos());
                   
        }
        System.out.println("++++++++++++++++++++++");
        Alunos Alunos1 = new Alunos();
        Alunos1.setNome("Alberto");
        System.out.println(Alunos1.getNome());
    }
}