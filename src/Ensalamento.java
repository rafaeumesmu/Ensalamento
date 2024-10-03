class Ensalamento {
    public void realizarEnsalamento() {

        Disciplina poo = new Disciplina("POO");
        Disciplina ed = new Disciplina("Estrutura de Dados");
        Disciplina bi = new Disciplina("BI");

        Curso ti = new Curso("TI");
        ti.addDisciplina(poo);
        ti.addDisciplina(ed);

        Curso adm = new Curso("ADM");
        adm.addDisciplina(new Disciplina("BI"));

        Aluno[] alunos = {
                new Aluno("Alfredo", ti),
                new Aluno("Amélia", ti),
                new Aluno("Ana", adm),
                new Aluno("Bruno", ti),
                new Aluno("Bentinho", adm),
                new Aluno("Capitú", ti),
                new Aluno("Debra", ti),
                new Aluno("Ian", adm),
                new Aluno("Iracema", ti),
                new Aluno("Joelmir", adm),
                new Aluno("Julieta", ti),
                new Aluno("Luana", adm),
                new Aluno("Luciana", ti),
                new Aluno("Majô", adm),
                new Aluno("Maria", adm),
                new Aluno("Norberto", ti),
                new Aluno("Paulo", adm),
                new Aluno("Romeu", adm),
                new Aluno("Wendel", ti),
                new Aluno("Zoey", ti),
        };

        Professor[] professores = {
                new Professor("Mia", poo),
                new Professor("Saulo", ed),
                new Professor("Paula", bi),
        };

        // Alocação de alunos
        Turma turmaPOO = new Turma(professores[0], ti.getDisciplinas().get(0));
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals(ti)) {
                turmaPOO.adicionarAluno(aluno);
            }
        }

        Turma turmaED = new Turma(professores[1], ti.getDisciplinas().get(1));
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals(ti)) {
                turmaED.adicionarAluno(aluno);
            }
        }

        Turma turmaBI = new Turma(professores[2], adm.getDisciplinas().get(0));
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals(adm)) {
                turmaBI.adicionarAluno(aluno);
            }
        }

        turmaPOO.mostrarTurma();
        turmaED.mostrarTurma();
        turmaBI.mostrarTurma();
    }
}