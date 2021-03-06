package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 15};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int lambdaTotal = total;
            int num = number[i];
            total = add(
                    () -> lambdaTotal + num
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
