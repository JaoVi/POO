public class aluno extends Pessoa {
    private String matricula;
    private String curso;

    public aluno(String matricula, String curso,String nome, String telefone) {
        super(nome, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
