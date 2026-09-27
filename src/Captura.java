import java.util.Scanner;
import java.util.ArrayList;

public class Captura {

    Scanner teclado = new Scanner(System.in);
    private ArrayList<Aluno> aluno = new ArrayList<>();
    int contador = 0;

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void Cadastrar() {

        System.out.print("Deseja cadastrar quantos alunos: ");
        int qtd = teclado.nextInt();
        System.out.println("");
        teclado.nextLine();

        while (contador < qtd) {

            System.out.println("Cadastre o Aluno Numero " + (contador + 1));

            System.out.print("Nome do Aluno: ");
            String nome = teclado.nextLine();

            System.out.print("RA do Aluno: ");
            int ra = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Idade do Aluno: ");
            int idade = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Sexo do Aluno: ");
            String sexo = teclado.nextLine();

            System.out.print("Média do Aluno: ");
            double media = teclado.nextDouble();
            teclado.nextLine();

            System.out.println("");
            
            Aluno novo = new Aluno(nome, ra, idade, sexo, media);
            aluno.add(novo);

            contador++;
        }

         System.out.println("===========>CADASTRO FEITO COM SUCESSO!<===========\n");
    }
}
