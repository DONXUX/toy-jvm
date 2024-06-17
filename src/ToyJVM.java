import java.io.IOException;

public class ToyJVM {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ToyJVM <class file>");
            return;
        }

        String classFilePath = args[0];

        try {
            ClassFileLoader loader = new ClassFileLoader();
            byte[] classData = loader.loadClassFile(classFilePath);

            BytecodeInterpreter interpreter = new BytecodeInterpreter(classData);
            interpreter.interpret();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
