package Kursovaya;

public class Main {

    public static void main(String[] args) {

        Employee secretary = new Employee("Ирина", "Ивановна", "Кофеева", 25000);
        Employee financier = new Employee("Дарья", "Николаевна", "Подпорина", 26000);
        Employee engineer = new Employee("Павел", "Антонович", "Хороших", 25000);
        Employee cleaner = new Employee("Зухра", "Алиевна", "Чистолюбова", 19000);
        Employee director = new Employee("Афанасий", "Григорьевич", "Баринов", 25000);
        Employee security = new Employee("Клавдия", "Егоровна", "Злыдина", 25000);
        Employee courier = new Employee("Петр", "Васильевич", "Скороход", 25000);
        Employee masterIT = new Employee("Роман", "Юрьевич", "Багодел", 25000);
        Employee manager = new Employee("Михаил", "Алексеевич", "Балаболов", 25000);
        Employee operator = new Employee("Даниил", "Петрович", "Хочуспатов", 25000);

//делаю много человек в мало отделов (не знаю как сделать гармоничней если 100 человек в 4 отделах например)
        int i = 0;
        byte[] arrID = new byte[5];
        for (; i <= arrID.length; ) {
            secretary.setID(i);
            System.out.println(secretary.getID());
            i++;

            financier.setID(i);
            System.out.println(financier.getID());
            i++;

            engineer.setID(i);
            System.out.println(engineer.getID());
            i++;

            cleaner.setID(i);
            System.out.println(cleaner.getID());
            i++;

            director.setID(i);
            System.out.println(director.getID());
            i++;

            security.setID(i);
            System.out.println(security.getID());
            i--;

            courier.setID(i);
            System.out.println(courier.getID());
            i--;

            masterIT.setID(i);
            System.out.println(masterIT.getID());
            i--;

            manager.setID(i);
            System.out.println(manager.getID());
            i--;

            operator.setID(i);
            System.out.println(operator.getID());
            i--;
            break;
        }


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

        for (int j = 0; j < baseEmployee.length; ) {
            System.out.println(baseEmployee[j]);
            j++;
        }
    }
}

