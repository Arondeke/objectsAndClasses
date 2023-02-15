package HW_objectsAndClasses;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Author authorOfBookPushKing = new Author("ПушКинг", "Александр");
        Book pushKingBook = new Book("How i learn JAVA", authorOfBookPushKing, 2000);
        System.out.println("книга:" + pushKingBook.getName() + " год:" + pushKingBook.getYear() + " Автор:" + authorOfBookPushKing.getFirstName() + " "
                + authorOfBookPushKing.getLasttName());

        System.out.println(authorOfBookPushKing);

        Author authorOfBookMayakOnnsky = new Author("МаякОННский", "Владимир");
        Book mayakOnnskyBook = new Book("Джава как знамя пролетариата", authorOfBookMayakOnnsky, 3000);
        System.out.println("книга:" + mayakOnnskyBook.getName() + " год:" + mayakOnnskyBook.getYear() + " Автор:" + authorOfBookMayakOnnsky.getFirstName() + " "
                + authorOfBookMayakOnnsky.getLasttName());

        System.out.println(authorOfBookMayakOnnsky);

    }

}