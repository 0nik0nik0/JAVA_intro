/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания
 * и количества страниц. Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
package HW_3.task3;

import java.util.ArrayList;
import java.util.List;

import static HW_2.task1.task1.myPrime;

public class task3 {
    public static void main(String[] args) {
        List<Library> books = createList();
        //System.out.println(books);
        System.out.println("Titles of books with a simple number of pages,\n" +
                "the author's surname contains \"A\" and the year of publication after 2010, inclusive\n" + libraryFilter(books));
    }

    public static List<Library> libraryFilter(List<Library> books) {
        List<Library> suitableBooks = new ArrayList<>();
        for (Library book : books) {
            if (myPrime(book.getPages()) && book.getPublishYear() >= 2010 && book.getAuthor().contains("A"))
                suitableBooks.add(book);
        }
        return suitableBooks;
    }

    public static List<Library> createList() {
        List<Library> list = new ArrayList<>();
        list.add(new Library("book1", "Shakespeare", 213, 1578, 1000));
        list.add(new Library("book2", "Icke", 456, 2010, 610));
        list.add(new Library("book3", "Rowling", 789, 2005, 115));
        list.add(new Library("book4", "Tolkien", 741, 1998, 251));
        list.add(new Library("book5", "Austen", 852, 2011, 59));
        list.add(new Library("book6", "Christie", 963, 1992, 160));
        list.add(new Library("book7", "Orwell", 159, 2020, 79));
        list.add(new Library("book8", "Arthur", 951, 1992, 250));
        list.add(new Library("book9", "Bulgakov", 753, 2012, 181));
        return list;
    }
}

