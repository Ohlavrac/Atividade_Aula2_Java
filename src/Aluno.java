public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        setNome(nome);
        setNota(nota);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return this.nota;
    }
}
