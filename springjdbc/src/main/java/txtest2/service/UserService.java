package txtest2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import txtest2.dao.UserDao;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    /**
     * propagation = REQUIRED,
     * isolation = Isolation.DEFAULT,
     * readOnly = false,
     * timeout = 100,
     * rollbackFor = {},
     * noRollbackFor = {}
     * */
    @Transactional(isolation = Isolation.REPEATABLE_READ,
                    propagation = REQUIRED) //propagation等属性在这里配置
    public void transfer() {
        userDao.add("zs", 10);
        int i = 1 / 0;
        userDao.min("ls", 10);
    }
}
