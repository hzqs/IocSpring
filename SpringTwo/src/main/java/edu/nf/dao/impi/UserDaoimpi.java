package edu.nf.dao.impi;

import edu.nf.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by hzq on 2017/12/13.
 */
@Repository("userDao")
@Scope("singleton")
public class UserDaoimpi implements UserDao {
    public void addUser() {
      System.out.print("insert into user values(?,?,?,?)");
    }

}
