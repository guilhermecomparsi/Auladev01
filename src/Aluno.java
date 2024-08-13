public class Aluno {

    String nome;
    String matricula;
    double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    public String Nome() {
        return nome;
    }
    public String Matricula() {
        return matricula;
    }
    public double Nota() {
        return nota;
    }
    public void mostrarInforma(){}

}