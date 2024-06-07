import java.util.Scanner;

public class Contatos {

    // Primeiro declarar quais os atributos dessa classe
    private int idContato;
    private String fullName;
    private String firstName;
    private String lastName;
    private String numTelefone;
    private String cidade;
    private static int NumIdContato = 0;

    // Criar o construtor, com a sintaxe public e o mesmo nome da classe

    // Construtor sem parâmtros
    public Contatos() {

    }

    // Construtor parametrizado
    public Contatos(int NumIdContato,
            String firstName,
            String lastName,
            String numTelefone,
            String cidade) {
        this.idContato = NumIdContato++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + this.lastName;
        this.numTelefone = numTelefone;
        this.cidade = cidade;
    }

    // caso necessário, adicionar algum método, com a sintaxe public (tipo da
    // função) (nome da função) () {}

    // Criar contatos
    public Contatos criarContatos() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do contato:");
        String firstName = input.next();

        System.out.println("Digite o sobrenome do contato");
        String lastName = input.next();

        System.out.println("Digite o número do telefone, sem espaços ou traços:");
        String numTelefone = input.next();

        System.out.println("Digite a cidade que " + firstName + " trabalha:");
        String cidade = input.next();

        Contatos contato = new Contatos(NumIdContato, firstName, lastName, numTelefone, cidade);

        System.out.println("Contato criado!");
        System.out.println(" ");

        input.close();

        return contato;
    }

    // Deletar contatos

    // Getters e Setters

    // Getters
    public String getCidade() {
        return cidade;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getIdContato() {
        return idContato;
    }

    public String getFullName() {
        return fullName;
    }

    // Setters
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
