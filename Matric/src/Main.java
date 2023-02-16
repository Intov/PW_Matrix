import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double matricFirst[][];
        double matricSecond[][];
        Matric objectFirst = new Matric(3,3, matricFirst = new double[][]{{12,42,1}, {15,74,5}, {58,12,0}},matricSecond = new double[][]{{124,472,412}, {63,8,9}, {0,7,1}} );
        double [][]MatricFinally;
        objectFirst.print(MatricFinally = objectFirst.Summ());
        objectFirst.print(MatricFinally = objectFirst.multyple(5));
        objectFirst.print(MatricFinally = objectFirst.multypleXMutric());
    }
}