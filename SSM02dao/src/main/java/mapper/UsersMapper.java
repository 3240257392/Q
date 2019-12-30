package mapper;
import entity.Users;
import java.util.List;
public interface UsersMapper {
		List<Users> findAll();
		int add(Users users);
		int delete(int id);
		Users chaid(int id);
		int gai(Users users);
}
