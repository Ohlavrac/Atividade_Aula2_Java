import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Vetor listaAlunos = new Vetor();
    public static void main(String args[]) {
        String alunoNome;
        double alunoNota;
        int contador;

        for (contador = 0; contador < listaAlunos.aluno.length; contador++) {
            System.out.print("Informe o nome do aluno: ");
            alunoNome = scan.next();
            System.out.print("Informe a nota do aluno: ");
            alunoNota = scan.nextDouble();
            Aluno alunos = new Aluno(alunoNome, alunoNota);
            listaAlunos.adicionar(alunos);
        }

        System.out.println("Lista antes de remover: ");
        listaAlunos.getLista();
        System.out.println("Aluno na posição 1: ");
        listaAlunos.buscar(1);
        System.out.println("Lista depois do remover o aluno da posiao 1: ");
        listaAlunos.remover(1);
        listaAlunos.getLista();
    }
}
