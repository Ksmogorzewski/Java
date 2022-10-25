package com.example.sklep4ptb2.Repositories;

import com.example.sklep4ptb2.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jt;

    public List<User> getAllUsers() {
        //return new User(1, "Jan1", "Kowalski1", "k@gmail.com", "1111", 1);
        return
                jt.query(
                        "SELECT * FROM user",
                        BeanPropertyRowMapper.newInstance(User.class)
                );
    }

    public User getUserById(int id) {
        return
                jt.queryForObject(
                        "SELECT * FROM user WHERE id = ?",
                        BeanPropertyRowMapper.newInstance(User.class),
                        id
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
                    user.getEmail(),
                    user.getRole()
            );
        }
    }

    public int deleteUser(int id){
        return jt.update(
          "DELETE FROM user WHERE id = ?",
          id
        );
    }

    public int updateUsers(User user){
        return jt.update(
                "UPDATE user SET name=?,surname=?,email=?,password=?,role=? WHERE id=?",
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                user.getPassword(),
                user.getRole(),
                user.getId()
                );
    }
}
