import java.util.Arrays;

public class Matric {
    int numberOfString = 3;
    int numberOfCollumn = 3;
    double [][] matricFirst;
    double [][] matricSecond;
    public double[][] Summ(){
        double [][]SummMatric = new double[numberOfString][numberOfString];
        for(int i = 0; i < numberOfString; i++){
            for(int j = 0; j < numberOfCollumn; j++){
                SummMatric[i][j] = matricFirst[i][j] + matricSecond[i][j];
            }
        }
        return SummMatric;
    }
    public Matric(int numberOfString, int numberOfCollumn,double [][] matricFirst, double[][] matricSecond){
        this.numberOfString = numberOfString;
        this.numberOfCollumn = numberOfCollumn;
        this.matricFirst = matricFirst;
        this.matricSecond = matricSecond;
    }
    public void print(double[][] MatricFinally){
        int a = 1;
        for(int i = 0; i < numberOfString; i++){
            for(int j = 0; j < numberOfCollumn; j++){
                if (a % 3 == 0){
                    System.out.println(MatricFinally[i][j] + "\n");
                    a++;
                }
                else{
                    System.out.println(MatricFinally[i][j]);
                    a++;
                }
            }
        }
    }
    public double[][] multyple(double x){
        double [][]multypleMatric = new double[numberOfString][numberOfString];
        for(int i = 0; i < numberOfString; i++){
            for(int j = 0; j < numberOfCollumn; j++){
                multypleMatric[i][j] = matricFirst[i][j] * x;
            }
        }
        return multypleMatric;
    }
    public double[][] multypleXMutric(){
        double [][]multypleXMatric = new double[numberOfString][numberOfString];
        for(int i = 0; i < numberOfString; i++){
            for(int j = 0; j < numberOfCollumn; j++){
                for (int g = 0; g < 3; g++){
                    multypleXMatric[j][i] = multypleXMatric[j][i] + matricFirst[i][g]*matricSecond[g][j];
                }
            }
        }
        return multypleXMatric;
    }
}
