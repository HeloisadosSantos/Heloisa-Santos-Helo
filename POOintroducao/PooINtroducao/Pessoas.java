package POOintroducao.PooINtroducao;
public class Pessoas {

    //ESTÁ CLASSE PESSOAS (SUPERCLASSE),E A REGISTRA ALUNO É A HERDEIRA DESTA CLASSE (PESSOAS)

    protected String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    protected String endereco;

}
