import java.io.PrintWriter;

class HelloWorld {
    public static void main(String args[]) {
        PrintWriter pen = new PrintWriter(System.out, true);
        pen.println("Hello, GitHub! Editted!");
        pen.flush();
    }
}
