package Kursovaya;

public class Main {

    public static void main(String[] args) {

        Employee secretary = new Employee("Ирина", "Ивановна", "Кофеева", 1, 21_000);
        Employee financier = new Employee("Дарья", "Николаевна", "Подпорина", 1, 22_000);
        Employee engineer = new Employee("Павел", "Антонович", "Хороших", 2, 23_000);
        Employee cleaner = new Employee("Зухра", "Алиевна", "Чистолюбова", 2, 24_000);
        Employee director = new Employee("Афанасий", "Григорьевич", "Баринов", 3, 25_000);
        Employee security = new Employee("Клавдия", "Егоровна", "Злыдина", 3, 26_000);
        Employee courier = new Employee("Петр", "Васильевич", "Скороход", 4, 27_000);
        Employee masterIT = new Employee("Роман", "Юрьевич", "Багодел", 4, 28_000);
        Employee manager = new Employee("Михаил", "Алексеевич", "Балаболов", 5, 29_000);
        Employee operator = new Employee("Даниил", "Петрович", "Хочуспатов", 5, 30_000);

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

        float totalSalary = 0;
        float totalSalaryAverage = 0;
        float maximumSalary = 0;
        float minimuSalary = 100000;

        for (
                int j = 0; j < baseEmployee.length; ) {
            System.out.println(baseEmployee[j]);
            totalSalary = totalSalary + baseEmployee[j].getSalary();
            totalSalaryAverage = totalSalary / baseEmployee.length;
//максимальную нашёл таким способом
            if (baseEmployee[j].getSalary() > maximumSalary) {
                maximumSalary = baseEmployee[j].getSalary();
            }
//минимальную нашёл таким способом
            minimuSalary = Math.min(baseEmployee[j].getSalary(), minimuSalary);
            //if (baseEmployee[j].getSalary() < minimuSalary) {
            //    minimuSalary = baseEmployee[j].getSalary();
            // }
            System.out.println(baseEmployee[j].getFirstName() + " " + baseEmployee[j].getMiddleName() + " " + baseEmployee[j].getLastName());
            j++;

        }
        System.out.println();

        System.out.println("Затраты на ЗП: " + totalSalary);
        System.out.println("Средняя ЗП: " + totalSalaryAverage);
        System.out.println("Максимальная ЗП: " + maximumSalary);
        System.out.println("Минимальная ЗП: " + minimuSalary);
    }
}