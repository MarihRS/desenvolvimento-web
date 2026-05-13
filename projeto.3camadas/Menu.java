public class Menu {
    public static void main(String[] args) {
        // Cria os serviços
        ReaderService reader = new ReaderService();
        PrinterService printer = new PrinterService();
        EstudanteService estudanteService = new EstudanteService();
        DisciplinaService disciplinaService = new DisciplinaService();
        
        int opcao = 0;
        
        while (opcao != 7) {
            printer.mostrarMenu();  // Printer mostra o menu
            opcao = reader.lerOpcao();  // Reader lê a opção
            
            // OPÇÃO 1 - Cadastrar Disciplina
            if (opcao == 1) {
                Disciplina d = reader.lerDadosDisciplina();  // Reader lê os dados
                disciplinaService.cadastrar(d);  // Service salva
            }
            
            // OPÇÃO 2 - Cadastrar Estudante
            if (opcao == 2) {
                Estudantes e = reader.lerDadosEstudantes();  // Reader lê os dados
                estudanteService.cadastrar(e);  // Service salva
            }
            
            // OPÇÃO 3 - Matricular estudante em disciplina
            if (opcao == 3) {
                // Mostra estudantes disponíveis
                printer.listarEstudantes(estudanteService.getEstudantes(), 
                                        estudanteService.getQtdEstudantes());
                System.out.print("Escolha o ID do estudante: ");
                int e = reader.lerOpcao();
                
                // Mostra disciplinas disponíveis
                printer.listarDisciplinas(disciplinaService.getDisciplinas(), 
                                         disciplinaService.getQtdDisciplinas());
                System.out.print("Escolha o ID da disciplina: ");
                int d = reader.lerOpcao();
                
                // Matricula
                disciplinaService.matricularEstudante(d, estudanteService.getEstudantes()[e]);
            }
            
            // OPÇÃO 4 - Listar tudo
            if (opcao == 4) {
                printer.listarDisciplinas(disciplinaService.getDisciplinas(), 
                                         disciplinaService.getQtdDisciplinas());
                printer.listarEstudantes(estudanteService.getEstudantes(), 
                                        estudanteService.getQtdEstudantes());
            }
            
            // OPÇÃO 5 - Editar estudante
            if (opcao == 5) {
                printer.listarEstudantes(estudanteService.getEstudantes(), 
                                        estudanteService.getQtdEstudantes());
                System.out.print("Escolha o estudante: ");
                int i = reader.lerOpcao();
                
                // Lê os novos dados
                System.out.print("Novo nome: ");
                String nome = reader.readLine();
                System.out.print("Nova idade: ");
                int idade = reader.readInt();
                System.out.print("Novo endereço: ");
                String endereco = reader.readLine();
                System.out.print("Novo telefone: ");
                String telefone = reader.readLine();
                System.out.print("Novo curso: ");
                String curso = reader.readLine();
                
                estudanteService.editar(i, nome, idade, endereco, telefone, curso);
            }
            
            // OPÇÃO 6 - Editar disciplina
            if (opcao == 6) {
                printer.listarDisciplinas(disciplinaService.getDisciplinas(), 
                                         disciplinaService.getQtdDisciplinas());
                System.out.print("Escolha a disciplina: ");
                int i = reader.lerOpcao();
                
                System.out.print("Novo nome: ");
                String nome = reader.readLine();
                System.out.print("Novo professor: ");
                String professor = reader.readLine();
                System.out.print("Nova carga horária: ");
                int carga = reader.readInt();
                
                disciplinaService.editar(i, nome, professor, carga);
            }
            
            // OPÇÃO 7 - Sair
            if (opcao == 7) {
                System.out.println("Programa encerrado.");
            }
        }
    }
}