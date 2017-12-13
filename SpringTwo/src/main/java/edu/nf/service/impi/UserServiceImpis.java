package edu.nf.service.impi;

import edu.nf.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by hzq on 2017/12/13.
 */
@Service("userService")
public class UserServiceImpis implements UserService{


    public void addUser() {
        System.out.print("insert into class values(?,?,?,?)");
    }
}
