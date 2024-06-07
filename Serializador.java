import java.io.FileWriter;
import java.io.IOException;

public class Serializador {
    private String caminho;

    // Construtor
    public Serializador() {

    }

    // Métodos
    public void gravar(String caminho, Object lista) {
        try {
            FileWriter myWriter = new FileWriter(caminho);
            myWriter.write("data.dat", lista);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Getters & Setters

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

}
