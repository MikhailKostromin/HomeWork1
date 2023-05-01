/*
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
как-то оповестить пользователя.
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение,
которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */


public class Main {
    public static void main(String[] args) {
        //Task1
        //Method1
        //printLength(null);
        //Method2
//        int[] array = {1, 2, 3, 4, 3, 2, 33};
//        getIndex(array, 7);
        //Method3
//        divide(10, 0);
//        Task2
        int[] array1 = {1, 2, 3, 4, 3, 2, 33};
        int[] array2 = {1, 2, 3, 1, 0, 2, 33};
//        difArrays(array1, array2);
        //Task3
        divArrays(array1, array2);
    }


    //---------------Task1-------------------

    /**
     * Метод, выбрасывающий исключение, если
     * переданный ему параметр имеет значение null
     *
     * @param str в качестве аргумента принимает строку
     */
    public static void printLength(String str) {
        if (str == null) {
            throw new NullPointerException("Строка null");
        }
        System.out.println("Длина строки:" + str.length());
    }

    /**
     * Метод, выбрасывающий исключение,
     * если индекс, передаваемый в качестве параметра,
     * не находится в диапазоне допустимых значений массива
     *
     * @param array в качестве аргумента принимает массив целых чисел
     * @param index в качестве аргумента принимает целое число
     */
    public static void getIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс не в диапазоне массива");
        }
        System.out.println("Элемент с индексом " + index + " : " + array[index]);
    }

    /**
     * Метод, выбрасывающий исключение,
     * если происходит деление на 0
     *
     * @param x целое число
     * @param y целое число
     */
    public static void divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Ошибка деления на 0");
        }
        System.out.println(x + " / " + y + " = " + (x / y));
    }

    //---------------Task2-------------------

    public static int[] difArrays(int[] array1, int[] array2) {
        if (array2.length != array1.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] difArr = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            difArr[i] = array1[i] - array2[i];
        }
        return difArr;
    }

    //---------------Task3-------------------
    public static int[] divArrays(int[] array1, int[] array2) {
        if (array2.length != array1.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] divArr = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new ArithmeticException("Ошибка деления на 0");
            }
            divArr[i] = array1[i] / array2[i];
        }
        return divArr;

    }

}