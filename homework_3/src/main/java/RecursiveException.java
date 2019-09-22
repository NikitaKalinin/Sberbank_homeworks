public class RecursiveException extends RuntimeException {
    public RecursiveException(){
        super("Глубина рекурсии больше 10");
    }
}
