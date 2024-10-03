import java.util.ArrayList;
import java.util.List;
class Curso {
    private String nome;
    private List<Disciplina> nomeDisciplina;

    public Curso(String nome) {
        this.nome = nome;
        this.nomeDisciplina = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addDisciplina(Disciplina disciplina) {
        nomeDisciplina.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return nomeDisciplina;
    }
}