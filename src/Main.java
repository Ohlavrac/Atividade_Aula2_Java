import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Vetor listaAlunos = new Vetor();

    public static void menu() {
        System.out.println("Adicionar...      [1]");
        System.out.println("Buscar...         [2]");
        System.out.println("Remover...        [3]");
        System.out.println("Mostrar Lista...  [4]");
        System.out.println("Tamanho Lista...  [5]");
        System.out.println("Sair...           [0]");
    }

    public static void main(String args[]) {
        String alunoNome;
        double alunoNota;
        int numero = -1, posicao;


        while (numero != 0) {
            menu();
            System.out.print(">>>: ");
            numero = scan.nextInt();
            switch (numero) {
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    alunoNome = scan.next();
                    System.out.print("Informe a nota do aluno: ");
                    alunoNota = scan.nextDouble();
                    Aluno alunos = new Aluno(alunoNome, alunoNota);
                    listaAlunos.adicionar(alunos);
                    break;

                case 2:
                    System.out.println("Informe a posicao deseja: ");
                    posicao = scan.nextInt();
                    listaAlunos.buscar(posicao);
                    break;

                case 3:
                    System.out.println("Informe a posicao deseja: ");
                    posicao = scan.nextInt();
                    listaAlunos.remover(posicao);
                    break;

                case 4:
                    listaAlunos.getLista();
                    break;

                case 5:
                    System.out.println(listaAlunos.sizeContador());
                    break;

                case 0:
                    System.out.println("Obrigado por usar");
                    break;
            
                default:
                    System.out.println("A informação passada não é reconhecida no sistema");
                    break;
            }
        }   
    }
}
