// Ставил extends Exception, но компилятор не хотел
// ругаться на необработанное исключение в main
// с Throwable все норм.
public class LastNot8Exception extends Throwable {
    public LastNot8Exception(){
        super("Последнее число 8");
    }
}
