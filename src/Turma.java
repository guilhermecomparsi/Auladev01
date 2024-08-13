import java.util.ArrayList;
import java.util.List;

public class Turma implements Gerenciamento
 {
    List<Aluno> alunos;

  public Turma() {
        this.alunos = new ArrayList<>();
    }
@Override
    public void adicionarAluno(Aluno aluno) {
      alunos.add(aluno);
}
@Override
    public void removerAluno(String matricula) {
      alunos.removeIf(aluno -> aluno.Matricula().equals(matricula));
}
@Override
    public List<Aluno> listarAlunos(){
      return alunos;
}
@Override
    public double calcularMedia(){
    double soma = 0;
    for (Aluno aluno : alunos) {
        soma += aluno.Nota();
    }
    return soma / alunos.size();
}
}
