package factory;

import bean.Book;

public class BookFactory {

    private Book book;

    private Book getBook() {
        if (null == book) {
            book = new Book(2, "实例工厂", 12.3);
        }
        return book;
    }
}
