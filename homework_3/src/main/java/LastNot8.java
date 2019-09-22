// Ставил extends Exception, но компилятор не хотел
// ругаться на необработанное исключение в main
// с Throwable все норм.
public class LastNot8 extends Throwable {
    public LastNot8(){
        super("Последнее число 8");
    }
}
