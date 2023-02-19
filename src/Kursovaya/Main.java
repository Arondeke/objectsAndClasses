package Kursovaya;

public class Main {

    public static void main(String[] args) {

        Employee secretary = new Employee("Ирина", "Ивановна", "Кофеева", 1, 2000);
        Employee financier = new Employee("Дарья", "Николаевна", "Подпорина", 1, 23000);
        Employee engineer = new Employee("Павел", "Антонович", "Хороших", 2, 20000);
        Employee cleaner = new Employee("Зухра", "Алиевна", "Чистолюбова", 2, 20000);
        Employee director = new Employee("Афанасий", "Григорьевич", "Баринов", 3, 20000);
        Employee security = new Employee("Клавдия", "Егоровна", "Злыдина", 3, 23666);
        Employee courier = new Employee("Петр", "Васильевич", "Скороход", 4, 1800);
        Employee masterIT = new Employee("Роман", "Юрьевич", "Багодел", 4, 30000);
        Employee manager = new Employee("Михаил", "Алексеевич", "Балаболов", 5, 23000);
        Employee operator = new Employee("Даниил", "Петрович", "Хочуспатов", 5, 22000);

//делаю много человек в мало отделов (не знаю как сделать гармоничней если 100 человек в 4 отделах например)

        Employee[] baseEmployee = new Employee[10];

        baseEmployee[0] = secretary;
        baseEmployee[1] = financier;
        baseEmployee[2] = engineer;
        baseEmployee[3] = cleaner;
        baseEmployee[4] = director;
        baseEmployee[5] = security;
        baseEmployee[6] = courier;
        baseEmployee[7] = masterIT;
        baseEmployee[8] = manager;
        baseEmployee[9] = operator;


        for (
                int j = 0;
                j < baseEmployee.length; ) {
            System.out.println(baseEmployee[j]);
            j++;
        }
    }
}

