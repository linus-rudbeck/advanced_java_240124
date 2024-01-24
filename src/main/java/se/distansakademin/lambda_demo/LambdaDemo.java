package se.distansakademin.lambda_demo;

import java.util.function.Function;

public class LambdaDemo {

    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = (String s) -> s.length();

        // Skapa en metod som heter "runRepeatedly" som tar emot 3 argument:
        // 1. En String <-- "strängen"
        // 2. En Function <-- "funktionen"
        // 3. En int <-- "x"
        // runRepeatedly ska köra funktionen på strängen x ggr

        runRepeatedly("Pannkakor", lengthFunction, 3);
    }

    private static void runRepeatedly(String s, Function<String, Integer> function, int x){
        for (int i = 0; i < x; i++) {
            var result = function.apply(s);
            System.out.println(result);
        }
    }

}
