public class Aluno {
    private String nomeCompleto;
    private String dataNascimento;
    private int numeroMatricula;
    private String email;
    private String telefone;
    private String endereco;

    public Aluno(String nomeCompleto, String dataNascimento, int numeroMatricula, String email, String telefone, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
}