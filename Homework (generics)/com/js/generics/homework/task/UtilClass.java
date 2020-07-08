package com.js.generics.homework.task;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <E> boolean  isBlank(List<E> list) {
        if (list == null || list.isEmpty()) return true;
        else return false;
    }

    /**
     * Получает последний элемент в коллекции
     * Если список пустой, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static <E> Object getLastElem(List<E> list) throws IllegalAccessException {
        if (isBlank(list)) throw new IllegalAccessException("Список пуст");
        return list.get(list.size() - 1);
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <E> Object findElem(List<E> list, Object elem) throws IllegalAccessException {
        if (list == null || elem == null) throw new IllegalAccessException("Список пуст");
        for (Object current : list){
            if (current == elem) return elem;
        }
        return null;
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы списка не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static <E> List union(List<E> list1, List<E> list2) throws IllegalAccessException {
        if (list1 == null || list2 == null) throw new IllegalAccessException("Список null");
        List res = new ArrayList();
        res.addAll(list1);
        res.addAll(list2);
        return res;
    }

    /**
     * Удаляет все элементы из списка list1 всех элементов, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы списка не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static <E> List removeAll(List<E> list1, List<E> list2) throws IllegalAccessException {
        List res = new ArrayList();
        for (Object i : list1) {
            if (i == null) throw new IllegalAccessException("Элемент не найден");
            boolean e = false;
            for (Object j : list2) {
                if (j == null) throw new IllegalAccessException("Элемент не найден");
                if (i.equals(j)) {
                    e = true;
                    break;
                }
            }
            if (!e) res.add(i);
        }
        return res;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы списка не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static <E> double sum(List<? extends Number> list1, List<? extends Number> list2) throws IllegalAccessException {
        if (list1 == null || list2 == null) throw new IllegalAccessException("Список null");
        double sum = 0;
        for (Number num : list1) sum += num.doubleValue();
        for (Number num : list2) sum += num.doubleValue();
        return sum;
    }
}
