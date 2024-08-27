import java.util.ArrayList;
import java.util.List;

public class CadastroEscolar {
    private List<Aluno> alunos;

    public CadastroEscolar() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void atualizarAluno(int index, Aluno aluno) {
        this.alunos.set(index, aluno);
    }

    public void excluirAluno(int index) {
        this.alunos.remove(index);
    }
}