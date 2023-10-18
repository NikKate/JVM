package org.example;


public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1. Локальной примитивной переменной присваивается 1 в Stack Memory  во фрейм main;
        Object o = new Object();        // 2. Создаем объект класса Object в heap, а ссылку о запоминаем в Stack Memory во фрейм main;
        Integer ii = 2;                 // 3. Создаем объект класса  Integer в heap и присваивается значение 2, а ссылку о запоминаем в Stack Memory во фрейм main;
        printAll(o, i, ii);             // 4. Создается новый фрейм на Stack printAll, создается новая ссылка на созданные ранее Object,Integer, также локальная переменная int;
        System.out.println("finished"); // 7.Создается новый объект класса String в heap и инициализируется finished. В Stack Memory создается новый фрейм println().
                                          // Ссылка на созданный объект помещается во фрейм println.
                                           // После выполнения метода println(), фрейм println удаляется из Stack Memory.
                                           // Фрейм main удаляется из Stack Memory.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5. Создается объкт класса Integer в heap и присваивается значение 700, а ссылку uselessVar замоминаем в tack Memory во фрейм printAll;
        System.out.println(o.toString() + i + ii);  // 6. Создается метод toString() для о, i, ii, также создается фрейм в Stack Memory , который удаляется поле выполнения метода.//
    }                                                //Создается новый объект класса String в heap в который заносится результат конкатенации строк.
                                                    // В Stack Memory создается новый фрейм println(). Ссылка на созданный объект помещается во фрейм println.
                                                    // После выполнения метода println() фрейм println удаляется из Stack Memory.После выполнение метода printAll() фрейм удаляется из Stack Memory.
}
