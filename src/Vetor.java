public class Vetor {
    Aluno[] aluno = new Aluno[1000];
    private int contador;

    public Vetor() {

    }

    public boolean adicionar(Aluno addAluno) {
        if (contador < aluno.length) {
            aluno[contador] = addAluno;
            contador++;
            return true;
        }
        return false;
    }

    public boolean buscar(int posicao) {
        if (posicao >= 0 && posicao <= contador) {
            System.out.println(aluno[posicao].getNome());
            System.out.println(aluno[posicao].getNota());
            return true;
        } else {
            System.out.println("O a posição informada esta vazia.");
        }
        return false;
    }

    public void remover(int posicao) {
        int countTemp;
        if (posicao >= 0 && posicao <= aluno.length) {
            aluno[posicao] = null;
            
            for (countTemp = posicao; countTemp < (contador - 1); countTemp++) {
                aluno[posicao] = aluno[countTemp + 1];
                if (aluno[posicao] == aluno[posicao + 1]){ 
                    System.out.println("Igual");
                }
            }
            contador--;
        }
    }

    public void getLista() {
        int count = 0;
        for (count = 0; count < contador; count++) {
            if (aluno[count] != null) {
                System.out.println(aluno[count].getNome());
                System.out.println(aluno[count].getNota());
            }   
        }
    }

    public int sizeContador() {
        return this.contador;
    }
}
