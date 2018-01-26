package lambdas;

public class LambdaCalculator{

    static public int useLambda(int x, int y, MyLambdaInterface operator){

        return operator.useLambda(x, y);

    }
}
