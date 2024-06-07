import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;

public class GerenciarContatos implements Serializable {

    public static void main(String[] args) {

        ArrayList<Contatos> ListaContatos = new ArrayList<>();
        Serializador serializador = new Serializador();
        boolean agenda = true;

        while (agenda) {

            System.out.println("Olá, qual ação gostaria de realizar?");
            System.out.println("1 - Criar novo contato");
            System.out.println("2 - Exibir contatos cadastrados");
            System.out.println("3 - Deletar contato");
            System.out.println("4 - Sair do programa");
            System.out.println(" ");

            Scanner opcao = new Scanner(System.in);
            int action = opcao.nextInt();

            if (action > 0 && action < 5) {
                switch (action) {
                    case 1:
                        Contatos contato = new Contatos();
                        contato = contato.criarContatos();
                        ListaContatos.add(contato);
                        System.out.println("A agenda agora possui " + ListaContatos.size() + " contatos.");
                        break;

                    case 2:
                        if (ListaContatos.isEmpty()) {
                            System.out.println("A lista está vazia!");
                            System.out.println(" ");
                        } else {
                            System.out.println("Contatos cadastrados:");
                            for (int i = 0; i < ListaContatos.size(); i++) {
                                System.out
                                        .println(ListaContatos.get(i).getFirstName()
                                                + ListaContatos.get(i).getLastName());
                            }
                        }

                        break;

                    case 3:
                        System.out.println("Qual o nome do contato que gostaria de deletar?");
                        Scanner input = new Scanner(System.in);
                        String nome = input.nextLine();
                        for (int i = 0; nome == ListaContatos.get(i).getFullName(); i++) {
                            System.out
                                    .println(ListaContatos.get(i).getFirstName() + ListaContatos.get(i).getLastName());
                            ListaContatos.remove(i);
                        }

                        System.out.println("A agenda agora possui " + ListaContatos.size() + " contatos.");
                        break;

                    case 4:
                        serializador.gravar("agenda.dat", ListaContatos);
                        agenda = false;
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("Número inválido, favor inserir um número válido!");

                opcao.close();
            }

        }
    }
}
