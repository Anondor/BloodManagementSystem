package juniv.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import juniv.edu.model.UserDtls;
import juniv.edu.repository.UserRepository;


@Service
public class UsererviceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@Override
	public UserDtls createUser(UserDtls user) {
		user.setUserPassword(passwordEncode.encode(user.getUserPassword()));
		user.setRole("ROLE_USER");

		return userRepo.save(user);
	}
	
	@Override
	public boolean checkEmail(String email) {

		return userRepo.existsByEmail(email);
	}


}
