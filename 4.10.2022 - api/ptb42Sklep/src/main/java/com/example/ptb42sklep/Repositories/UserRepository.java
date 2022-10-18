package com.example.ptb42sklep.Repositories;

import com.example.ptb42sklep.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jt;

    public List<User> getAllUsers(){
        // return new User(5, "john", "green", "jg@o2.dpf", "22323", 3);
        return
                jt.query(
                        "SELECT * FROM user",
                        BeanPropertyRowMapper.newInstance(User.class)
                );
    }
    public User getUserbyId(int id){
        // return new User(5, "john", "green", "jg@o2.dpf", "22323", 3);
        return
                jt.queryForObject(
                        "SELECT * FROM user WHERE id = ?",
                        BeanPropertyRowMapper.newInstance(User.class), id
                );
    }

    public void insertUsers(List<User> users) {
        for (User user: users) {
            jt.update(
                    "INSERT INTO user VALUES(?,?,?,?,?,?)",
                    user.getId(),
                    user.getName(),
                    user.getSurname(),
                    user.getEmail(),
                    user.getPassword(),
                    user.getRole()
            );

        }
    }
}
