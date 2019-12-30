package service.impl;

import entity.Users;
import mapper.UsersMapper;
import org.springframework.stereotype.Service;
import service.UsersService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl  implements UsersService {
	
	@Resource
	private UsersMapper usersMapper;


	public List<Users> findAll() {
		List<Users> ff=usersMapper.findAll();
		return ff;
	}

	public int add(Users users) {
		return usersMapper.add(users);
	}

	public int delete(int id) {
		return usersMapper.delete(id);
	}

	public Users chaid(int id) {

		return usersMapper.chaid(id);
	}

	public int gai(Users users) {

		return usersMapper.gai(users);
	}
}
