package lambda;


import java.util.ArrayList;
import java.util.List;

public class LambdaMain {

    public static void main(String[] args) {

        LambdaSwitcher lambdaSwitcher = new LambdaSwitcher();
        LambdaLamp lambdaClass = new LambdaLamp();


        class InnerLambdaTest implements LambdaInterface{
            @Override
            public void someAction(String s) {
                System.out.println("InnerLambdaTest + " + s);
            }
        }
//        lambdaSwitcher.setLambdaInterface(new InnerLambdaTest());
//        lambdaSwitcher.switchLambda();

//        String massage = "before";
////        massage = "111";
//        class InnerLambdaTest2 implements LambdaInterface{
//            @Override
//            public void someAction(String s) {
//                System.out.println("InnerLambdaTest2 + " + s + " " + massage);
//            }
//        }

        lambdaSwitcher.setLambdaInterface(System.out::println
        //(s-> System.out.println("InnerLambdaTest2 + " + s.replace("a","2"))
        );
        lambdaSwitcher.switchLambda();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Person person = new Person();
        person.setName("Anna");
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.stream().forEach(person1 -> System.out.println(person1));

//        Person person = new Person();
//        person.setName("Anna");
//        List<Person> personList = new ArrayList<>();
//        personList.add(person);
//        personList.forEach(System.out::println);




    }

}
