import java.util.ArrayList;

public class RelatorioNome {

    public void exibirCrescente(ArrayList<Aluno> aluno) {
        Aluno[] vetor = aluno.toArray(new Aluno[0]);

        bubbleSort(vetor);

        for (Aluno a : vetor) {
            System.out.print("Nome: " + a.getNome() + " - RA: " + a.getRa() + " - Idade: " + a.getIdade()
                    + " - Sexo: " + a.getSexo() + " - Média: " + a.getMedia() + " - Status: " + a.aprovar() + "\n\n");
        }
    }

    public void relatorioAprovados(ArrayList<Aluno> aluno) {
        Aluno[] vetor = aluno.toArray(new Aluno[0]);

        bubbleSort(vetor);

        for (Aluno r : vetor) {
            if (r.aprovar().equals("Aprovado!")) {
                System.out.print("Nome: " + r.getNome() + " - RA: " + r.getRa() + " - Idade: " + r.getIdade()
                        + " - Sexo: " + r.getSexo() + " - Média: " + r.getMedia() + " - Status: " + r.aprovar() + "\n\n");
            }
        }
    }

    public void exibirDecrescente(ArrayList<Aluno> aluno) {
        Aluno[] vetor = aluno.toArray(new Aluno[0]);

        selectionSort(vetor);

        for (Aluno a : vetor) {
            System.out.print("RA: " + a.getRa() + " - Nome: " + a.getNome() + " - Idade: " + a.getIdade()
                    + " - Sexo: " + a.getSexo() + " - Média: " + a.getMedia() + " - Status: " + a.aprovar() + "\n\n");
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] vetor) {

        boolean trocar;

        do {
            trocar = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i].compareTo(vetor[i + 1]) > 0) {
                    T temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocar = true;
                }
            }

        } while (trocar);
    }

    public static void selectionSort(Aluno[] vetor) {

        for (int posSel = 0; posSel < vetor.length - 1; posSel++) {

            int posMaior = posSel;
            for (int i = posSel + 1; i < vetor.length; i++) {
                if (vetor[i].getRa() > vetor[posMaior].getRa()) {
                    posMaior = i;
                }
            }

            if (posMaior != posSel) {
                Aluno temp = vetor[posSel];
                vetor[posSel] = vetor[posMaior];
                vetor[posMaior] = temp;
            }
        }
    }
}
