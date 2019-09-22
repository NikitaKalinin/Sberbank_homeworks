import java.awt.*;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<String> list = new ArrayList<String>();

    public static void main(String[] args) throws Exception{

        //1 Задание
        TestSerializable inSerializable = new TestSerializable(234234, "sfsdfsdf");
        System.out.println(inSerializable.toString());
        // Сериализация
        FileOutputStream outputStream = new FileOutputStream("./file");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(inSerializable);
        objectOutputStream.close();
        // Десериализация
        FileInputStream inputStream = new FileInputStream("./file");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        TestSerializable outSerializble = (TestSerializable) objectInputStream.readObject();
        objectOutputStream.close();

        System.out.println(outSerializble.toString());
        // Сравнение на == и equals
        System.out.println(inSerializable == outSerializble);
        System.out.println(inSerializable.equals(outSerializble));

        // 2 Задание
        // Unchecked Exception
        // Получаю числа фиббоначи через рекурсию
        // если глубина больше 10, то выбрасываю исключение
        // тут все норм
        Fibbonachi fib = new Fibbonachi();
        System.out.println(fib.getFibNumber(5));
        // тут вылетает ошибка
        try {
            System.out.println(fib.getFibNumber(10));
        } catch (RecursiveException e){
            System.out.println(e.getMessage());
        }
        // Checked Exception
        // Если число заканчивается на 8, то выбрасываю исключение
        try {
            fib.getFibNumberLastNot8(6);
        } catch (LastNot8 e){
            System.out.println(e.getMessage());
        }

        // 3 Задание
        Field field = Main.class.getDeclaredField("list");
        ParameterizedType listType = (ParameterizedType) field.getGenericType();
        Class<?> listClass = (Class<?>) listType.getActualTypeArguments()[0];
        System.out.println(listClass); // class java.lang.String.
















    }
}
