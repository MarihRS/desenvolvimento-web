import java.util.Scanner;

public class ReaderService {
    private Scanner sc;

    public ReaderService(){
        this.sc = new Scanner(System.in);
    }

    public int lerOpcao(){
        int opcao = sc.nextInt();
        sc.nextLine(); 
        return opcao;
    }

    public String readLine() {
        return sc.nextLine();
    }

    public int readInt() {
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public Estudantes lerDadosEstudantes() {
        System.out.println("Id do estudante: ");
        int idAluno = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome do estudante: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Digite a idade do estudante: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Endereço: ");
        String endereco = sc.nextLine();
        
        System.out.println("Telefone: ");
        String telefone = sc.nextLine();
        
        System.out.println("Curso: ");
        String curso = sc.nextLine();
        
            return new Estudantes(idAluno, nomeAluno, idade, endereco, telefone, curso);
    }

    public Disciplina lerDadosDisciplina() {
        System.out.print("ID da disciplina: ");
        int idDisciplina = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nome: ");
        String nomeDisciplina = sc.nextLine();
        
        System.out.print("Professor: ");
        String professor = sc.nextLine();
        
        System.out.print("Carga horária: ");
        int carga = sc.nextInt();
        sc.nextLine();
        
        return new Disciplina(idDisciplina, nomeDisciplina, professor, carga);
    }
}