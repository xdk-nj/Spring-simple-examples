package service;

import bean.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1, "1", 1.1),
                new Book(2, "2", 2.1));
    }
}
