package factory;

import bean.Book;

public class StaticBookFactory {

    private static Book book;

    private static Book getBook() {
        if (null == book) {
            book = new Book(1, "静态工厂", 12.3);
        }
        return book;
    }
}
