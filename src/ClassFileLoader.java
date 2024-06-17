import java.io.FileInputStream;
import java.io.IOException;

public class ClassFileLoader {
    public byte[] loadClassFile(String filePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        byte[] classData = inputStream.readAllBytes();
        inputStream.close();
        return classData;
    }
}
