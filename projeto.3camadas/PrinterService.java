public class PrinterService {
    
    public void mostrarMenu() {
        System.out.println("\n1 - Cadastrar Disciplina");
        System.out.println("2 - Cadastrar Estudante");
        System.out.println("3 - Inserir estudante na disciplina");
        System.out.println("4 - Listar");
        System.out.println("5 - Editar estudante");
        System.out.println("6 - Editar disciplina");
        System.out.println("7 - Sair");
    }
    
    public void listarEstudantes(Estudantes[] estudantes, int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.println(i + " - " + estudantes[i].getNomeAluno());
        }
    }
    
    public void listarDisciplinas(Disciplina[] disciplinas, int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.println("Disciplina: " + disciplinas[i].getNomeDisciplina());
            System.out.println("Professor: " + disciplinas[i].getNomeDoProfessor());
            
            disciplinas[i].listarEstudantes();
        }
    }
}