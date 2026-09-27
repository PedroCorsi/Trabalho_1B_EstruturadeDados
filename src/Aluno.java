public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int ra;
    private int idade;
    private String sexo;
    private double media;
    private String resultado;

    public Aluno(String nome, int ra, int idade, String sexo, double media) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;
        this.resultado = aprovar();
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public double getMedia() {
        return media;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String aprovar() {
        if (this.media >= 6) {
            this.resultado = "Aprovado!";
            return this.resultado;
        } else {
            this.resultado = "Reprovado!";
            return this.resultado;
        }
    }

    public int compareTo(Aluno outro) {

        return this.nome.compareToIgnoreCase(outro.nome);
    }

}