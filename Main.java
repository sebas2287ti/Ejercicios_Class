import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TextFileWritter writer = new TextFileWritter("Prueba.txt");

        try {
            writer.OpenFile();
            writer.WriteToFile("Hola, mundo!\n");
            writer.WriteToFile("Este es un archivo de texto plano creado en Java y POO.");
            System.out.println("Creado exitosamente");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo" + e.getMessage());
    } finally {
            try {
                writer.CloseFile();
            } catch (IOException e) {
                System.err.println("Error al cerrar el archivo" + e.getMessage());
            }
        }
        }
}