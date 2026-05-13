public class DisciplinaService {
    private Disciplina[] disciplinas;
    private int qtdDisciplinas;
    
    public DisciplinaService() {
        this.disciplinas = new Disciplina[50];
        this.qtdDisciplinas = 0;
    }
    
    public void cadastrar(Disciplina disciplina) {
        if (qtdDisciplinas < disciplinas.length) {
            disciplinas[qtdDisciplinas] = disciplina;
            qtdDisciplinas++;
        }
    }
    
    public void matricularEstudante(int i, Estudantes estudante) {
        if (i >= 0 && i < qtdDisciplinas) {
            disciplinas[i].inserirEstudante(estudante);
        }
    }
    
    public void editar(int indice, String nome, String professor, int carga) {
        if (indice >= 0 && indice < qtdDisciplinas) {
            disciplinas[indice].editarDisciplina(nome, professor, carga);
        }
    }
    
    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
    
    public int getQtdDisciplinas() {
        return qtdDisciplinas;
    }
}