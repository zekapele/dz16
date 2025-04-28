import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
     
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int sum = addition.operate(5, 7);
        System.out.println("Сума 5 + 7 = " + sum);

        StringManipulator toUpperCase = (String s) -> s.toUpperCase();
        String upper = toUpperCase.manipulate("hello world");
        System.out.println("У верхньому регістрі: " + upper);

        Function<String, Integer> countUppercaseFunction = StringListProcessor::countUppercase;
        int uppercaseCount = countUppercaseFunction.apply("Hello World!");
        System.out.println("Кількість великих літер: " + uppercaseCount);

        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        int randomNum = randomSupplier.get();
        System.out.println("Випадкове число від 1 до 100: " + randomNum);
    }
}
