
class Aluno extends Pessoa{
    private Curso cu;

    public Aluno( String nome,Curso curs){
        super.nome = nome;
        this.cu = curs;
    }

    public Curso getCurso() {
        return cu;
    }
    public void setCurso(Curso curs) {
        this.cu = curs;
    }

}