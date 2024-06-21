package org.example;

/**
 * Основний клас програми.
 */
public class Main {

    /**
     * Приватний конструктор, щоб запобігти створенню екземпляра утилітного класу.
     */
    private Main() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Основний метод програми.
     *
     * @param args аргументи командного рядка
     */
    public static void main(final String[] args) {
        System.out.println("Hello world!");
    }
}
