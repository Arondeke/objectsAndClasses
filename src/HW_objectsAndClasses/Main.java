package HW_objectsAndClasses;

import org.w3c.dom.ls.LSOutput;

public class Main {

    int test = 3;
    int test2 = 4;
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Author authorOfBookPushKing = new Author("ПушКинг", "Александр");
        Book pushKingBook = new Book("How i learn JAVA", authorOfBookPushKing, 2000);
        System.out.println("книга:" + pushKingBook.getName() + " год:" + pushKingBook.getYear() + " Автор:" + authorOfBookPushKing.getFirstName() + " "
                + authorOfBookPushKing.getLasttName());


        Author authorOfBookMayakOnnsky = new Author("МаякОННский", "Владимир");
        Book mayakOnnskyBook = new Book("Джава как знамя пролетариата", authorOfBookMayakOnnsky, 3000);
        System.out.println("книга:" + mayakOnnskyBook.getName() + " год:" + mayakOnnskyBook.getYear() + " Автор:" + authorOfBookMayakOnnsky.getFirstName() + " "
                + authorOfBookMayakOnnsky.getLasttName());
    }
}