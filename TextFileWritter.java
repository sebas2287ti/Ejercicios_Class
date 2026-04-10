import java.io.FileWriter;
import java.io.IOException;

public class TextFileWritter {
    private String fileName;
    private FileWriter fileWriter;


    public TextFileWritter(String fileName) {
        this.fileName = fileName;
    }

    public void OpenFile() throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public void WriteToFile(String content) throws IOException {
        if  (fileWriter == null) {
            throw new IllegalStateException("No se puede escribir");
        }
        fileWriter.write(content);
    }


    public void CloseFile() throws IOException {
        if  (fileWriter != null) {
            fileWriter.close();
            }
        }
    }