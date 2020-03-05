package lambda;

public class LambdaSwitcher {

    private LambdaInterface lambdaInterface;

    public LambdaInterface getLambdaInterface() {
        return lambdaInterface;
    }

    void setLambdaInterface(LambdaInterface lambdaInterface) {
        this.lambdaInterface = lambdaInterface;
    }

    void switchLambda(){
        if(lambdaInterface!=null){
            lambdaInterface.someAction("Hello LambdaSwitcher");
        }
    }
}
