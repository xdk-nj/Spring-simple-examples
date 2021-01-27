package jdbctest.test;

import jdbctest.bean.User;
import jdbctest.config.JdbcConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main1 {

    static JdbcTemplate jdbcTemplate;
    static ApplicationContext ctx;

    static {
        ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        jdbcTemplate = ctx.getBean(JdbcTemplate.class);
    }

    @Test
    public void insert() {
        jdbcTemplate.update(
                "insert into user (username, address) values (?,?);",
                "boy", "苏州");
    }

    @Test
    public void selectOne() {
        User user = jdbcTemplate.queryForObject(
                "select * from user where id = ?;",
                new BeanPropertyRowMapper<User>(User.class),
                1
        );
        System.out.println(user);
    }

    @Test
    public void selectMany() {
        List<User> users = jdbcTemplate.query(
                "select * from user;",
                new BeanPropertyRowMapper<>(User.class));
        System.out.println(users);
    }
}
