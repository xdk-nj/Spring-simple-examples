package txtest.service;

import jdbctest.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import txtest.dao.UserDao;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    @Transactional
    public void transfer() {
        userDao.add("zs", 10);
        int i = 1 / 0;
        userDao.min("ls", 10);
    }
}
