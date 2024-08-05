package ru.netology;

public class JvmComprehension {  // Загрузка класса JvmComprehension через ClassLoader и некоторых системных классов в область памяти Metaspace

    public static void main(String[] args) { //Создание фрейма main в Stack Memory
        int i = 1;                      //  Инициализация примитивной переменной i, присвоение значения - 1, добавляется во фрейм main
        Object o = new Object();    // Создание объекта типа Object, хранение в куче, создание ссылки "o" в стеке фрейм main, если объект не будет использоваться (на него не будут ссылаться либо будет недостижим при обходе графов) то он может быть удален сборщиком мусора из память heap
        Integer ii = 2;                 // Загрузка класса Integer через ClassLoader, добавление в Metaspace, создание переменной int ii в стеке во фрейме main, присвоение значения - 2
        printAll(o, i, ii);             // Создание нового фрейма в Stack Memory и передача ссылки на Object o, инициализация примитивной переменной int i, примитивной переменной int ii
        System.out.println("finished"); // Cоздание фрейма sout в Stack Memory, создание объекта типа String в куче, создание ссылки в стеке фрейма sout, вывод строки("finished") на экран
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // Загрузка класса Integer через ClassLoader, создание примитивной переменной int uselessVar в стеке во фрейме printAll, присвоение значения - 700
        System.out.println(o.toString() + i + ii);  // Cоздание фрейма sout в Stack Memory, ссылка во фрейме sout на объект String в куче, вызов метода toString, вывод на экран новой строки (стринговое значение Object o + значения i, ii)
    }
}