public class Fibbonachi {
    private static String stringForReflection = "sdfsd";
    private static Integer integerForReflection = 2342432;
    public Fibbonachi() {}
    private Integer getFibNumber(int n, Integer deep) throws RecursiveException{
        if (deep > 5){
            throw new RecursiveException();
        }
        if (n < 2){
            return n;
        }
        else return getFibNumber(n-1, deep+1) + getFibNumber(n-2, deep+1);
    }
    public int getFibNumber(int n) throws RecursiveException{
        return getFibNumber(n, 0);
    }
    public int getFibNumberLastNot8(int n) throws LastNot8{
        int fibNumber = getFibNumber(n);
        if (fibNumber % 10 == 8) throw new LastNot8();
        return fibNumber;
    }
}
