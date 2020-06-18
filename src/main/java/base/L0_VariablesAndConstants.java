package base;

public class L0_VariablesAndConstants {

    // Константа
    public static final int CONSTANT = 777;

    public static void main(String[] args) {

        //  создаем константу с именем pi, типа double и присваиваем ей значение 3.141
        final double PI = 3.1415;
        // Попытка присвоения константе нового значения, приводит к ошибке уровня компиляции!
        // PI = 2.71828183;

        // Через запятую можно объявить сразу несколько переменных одного типа:
        int x, y;
        x = 10;
        y = 25;

        // Или
        int x2 = 8, y2 = 15;

        // Ключевое слово var
        // Начиная с Java 10 в язык было добавлено ключевое слово var, которое также позволяет определять переменную:
        // Слово var ставится вместо типа данных, а сам тип переменной выводится из того значения, которое ей присваивается.
        // Например, переменой x приваивается число 10, значит, переменная будет представлять тип int.
        // Но если переменная объявляется с помощью var, то мы обязательно должны инициализировать ее, то есть предоставить ей начальное значение, иначе мы получим ошибку,

        var vv = 10;

        // Присвоение со сложением.
        int variable2 = 0;
        variable2 = variable2 + 5;
        variable2 += 5;

        // Присвоение с вычитанием.
        int variable3 = 0;
        variable3 = variable3 - 5;
        variable3 -= 5;

        // Присвоение с умножением.
        long variable4 = 0;
        variable4 = variable4 * 5;
        variable4 *= 5;

        // Присвоение с делением.
        long variable5 = 0;
        variable5 = variable5 / 5;
        variable5 /= 5;

        // Присвоение остатка от деления.
        long variable6 = 0;
        variable6 = variable6 % 5;
        variable6 %= 5;

    }
}