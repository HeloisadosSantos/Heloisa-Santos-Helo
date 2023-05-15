package POOintroducao.PooINtroducao;
public class Alunos extends Pessoas{
    private int nota;
//atributos
protected String nome;
protected String endereco;

//métodos
    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }
}
