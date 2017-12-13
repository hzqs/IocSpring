package edu.nf.service.impi;

import edu.nf.dao.UserDao;
import edu.nf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by hzq on 2017/12/13.
 * 使用service代替Compontent，代表受容器管理的业务组件
 */
@Service("service")
@Scope("singleton")
public class UserServiceimpi implements UserService{

    @Autowired
    private UserDao dao;

    public void addUser() {
           dao.addUser();
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }


}
