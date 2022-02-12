package Modelo;
public class BeanEstudante extends Pessoa{
    private int dataNascimento;
    private String turma;
    private String turmaString;
    private int classe;
    private String curso;
    private double propina;
    private int ano_matricula;

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    public String pegaTurma(){
        return this.turmaString;
    }
    
    public void confTurma(String t){
        this.turmaString = t;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public int getAno_matricula() {
        return ano_matricula;
    }

    public void setAno_matricula(int ano_matricula) {
        this.ano_matricula = ano_matricula;
    }
    
    
}
