package service;

import entity.Users;

import java.util.List;
public interface UsersService {
			List<Users> findAll();
			int add(Users users);
			int delete(int id);
			Users chaid(int id);
			int gai(Users users);
}
