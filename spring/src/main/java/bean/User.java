package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private String name;
    private Book book;
    private String[] favs;
    private List<Book> bookList;
    private Map<String, Object> map;
    private Properties info;
}
