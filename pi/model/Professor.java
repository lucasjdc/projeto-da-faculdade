package model;

public class Professor {

    private String nomeDoProfessor;
    private String Cpf;
    private String email;
    private String disciplina;

    public String getNome() {
        return nomeDoProfessor;
    }
    public void setNome(String nome) {
        this.nomeDoProfessor = nome;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
