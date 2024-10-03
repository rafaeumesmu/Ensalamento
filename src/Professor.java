class Professor extends Pessoa{
    private Disciplina dis;

    public Professor( String nome, Disciplina displi){
        super.nome = nome;
        this.dis = displi;
    }

    public Disciplina getDisplina(){
        return dis;
    }

    public void setDisplina(Disciplina D){
        this.dis = D;
    }
}