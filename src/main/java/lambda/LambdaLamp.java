package lambda;

public class LambdaLamp implements LambdaInterface {

    @Override
    public void someAction(String s) {
        System.out.println("LambdaLamp + " + s);
    }
}
