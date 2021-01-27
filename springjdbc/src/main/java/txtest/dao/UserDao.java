package txtest.dao;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void add(String username, Integer money) {
        jdbcTemplate.update(
                "update account set money = money + ? where username = ?;",
                money, username
        );
    }

    public void min(String username, Integer money) {
        jdbcTemplate.update(
                "update account set money = money - ? where username = ?;",
                money, username
        );
    }
}
