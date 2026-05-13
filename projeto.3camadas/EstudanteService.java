public class EstudanteService {
    private Estudantes[] estudantes;
    private int qtdEstudantes;
    
    public EstudanteService() {
        this.estudantes = new Estudantes[100];
        this.qtdEstudantes = 0;
    }
    
    public void cadastrar(Estudantes estudante) {
        if (qtdEstudantes < estudantes.length) {
            estudantes[qtdEstudantes] = estudante;
            qtdEstudantes++;
        }
    }
    
    public void editar(int i, String nome, int idade, String endereco, String telefone, String curso) {
        if (i >= 0 && i < qtdEstudantes) {
            estudantes[i].editarAluno(nome, idade, endereco, telefone, curso);
        }
    }
    
    public Estudantes[] getEstudantes() {
        return estudantes;
    }
    
    public int getQtdEstudantes() {
        return qtdEstudantes;
    }
}