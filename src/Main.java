import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Turma turma = new Turma();

      Aluno a1 = new Aluno("Guilherme", "123456", 9);
      Aluno a2 = new Aluno("Cassio", "987654", 8);
      Aluno a3 = new Aluno("David", "987654", 7);
      Aluno a4 = new Aluno("Jose", "987654", 6);
      Aluno a5 = new Aluno("Jose", "987654", 5);

      turma.adicionarAluno(a1);
      turma.adicionarAluno(a2);
      turma.adicionarAluno(a3);
      turma.adicionarAluno(a4);
      turma.adicionarAluno(a5);

        System.out.println("Lista de alunos: ");
        for (Aluno aluno : turma.listarAlunos()) {
          System.out.println("Nome: " + aluno.nome);
          System.out.println("Matricula: " + aluno.matricula);
          System.out.println("Nota: " + aluno.nota);
        }

        double media = turma.calcularMedia();
        System.out.println("Média das Notas" + media);
    }
}