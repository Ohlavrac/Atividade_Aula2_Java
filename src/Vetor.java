public class Vetor {
    Aluno[] aluno = new Aluno[3];
    private int contador;

    public Vetor() {

    }

    public void adicionar(Aluno addAluno) {
        if (contador < aluno.length) {
            aluno[contador] = addAluno;
            contador++;
        }
    }

    public void buscar(int posicao) {
        if (posicao > 0 && posicao <= aluno.length) {
            System.out.println(aluno[posicao].getNome());
            System.out.println(aluno[posicao].getNota());
        }
    }

    public void remover(int posicao) {
        if (posicao > 0 && posicao <= aluno.length) {
            aluno[posicao] = null;
        }
    }

    public void getLista() {
        int contador = 0;
        for (contador = 0; contador < aluno.length; contador++) {
            if (aluno[contador] != null) {
                System.out.println(aluno[contador].getNome());
                System.out.println(aluno[contador].getNota());
            }   
        }
    }
}
