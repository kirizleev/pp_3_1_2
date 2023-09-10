package ru.kirizleev.pp_3_1_2.dao;

import ru.kirizleev.pp_3_1_2.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void delete(User user);
   void edit(User user);
   User getById(Long id);
   List<User> listUsers();
}
