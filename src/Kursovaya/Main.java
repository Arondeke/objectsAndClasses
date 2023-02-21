package Kursovaya;

public class Main {

    static Employee[] baseEmployee = new Employee[10];

    private static float countTotalSalary(Employee[] baseEmployee) {
        float totalSalary = 0;
        for (int i = 0; i < baseEmployee.length; i++) {
            totalSalary = totalSalary + baseEmployee[i].getSalary();
        }
        return totalSalary;
    }

    private static float countAverageSalary(float totalSalary) {
        float salaryAverage = 0;
        salaryAverage = totalSalary / baseEmployee.length;
        return salaryAverage;
    }

    private static float countMinSalary(Employee[] baseEmployee) {
        float minimumSalary = 100_000;
        for (int i = 0; i < baseEmployee.length; i++) {
            minimumSalary = Math.min(baseEmployee[i].getSalary(), minimumSalary);
        }
        return minimumSalary;
    }

    private static float countMaxSalary(Employee[] baseEmployee) {
        float maximumSalary = 0;
        for (int i = 0; i < baseEmployee.length; i++) {
            maximumSalary = Math.max(baseEmployee[i].getSalary(), maximumSalary);
        }
        return maximumSalary;
    }

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

        float totalSalary = countTotalSalary(baseEmployee);
        System.out.println("Сумма ЗП: " + totalSalary);

        float salaryAverage = countAverageSalary(totalSalary);
        System.out.println("Средняя ЗП: " + salaryAverage);

        float minimumSalary = countMinSalary(baseEmployee);
        System.out.println("Минимальная ЗП: " + minimumSalary);

        float maximumSalary = countMaxSalary(baseEmployee);
        System.out.println("Максимальная ЗП: " + maximumSalary);
    }
}