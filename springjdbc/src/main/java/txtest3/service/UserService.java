package txtest3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import txtest3.dao.UserDao;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void transfer() {
        userDao.add("zs", 10);
        int i = 1 / 0;
        userDao.min("ls", 10);
    }
}
