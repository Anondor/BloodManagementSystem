package juniv.edu.service;

import juniv.edu.model.UserDtls;

public interface UserService {
	
	public UserDtls createUser(UserDtls user);
	public boolean checkEmail(String email);

	

}
