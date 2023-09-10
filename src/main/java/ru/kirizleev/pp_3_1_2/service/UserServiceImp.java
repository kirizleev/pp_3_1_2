package ru.kirizleev.pp_3_1_2.service;

import ru.kirizleev.pp_3_1_2.dao.UserDao;
import ru.kirizleev.pp_3_1_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private UserDao userDao;

   @Autowired
   public void setUserDao(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void delete(User user) {
      userDao.delete(user);
   }

   @Transactional
   @Override
   public void edit(User user) {
      userDao.edit(user);
   }

   @Transactional(readOnly = true)
   @Override
   public User getById(Long id) {
      return userDao.getById(id);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

}
