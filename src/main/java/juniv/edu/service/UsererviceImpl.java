package juniv.edu.service;

import java.util.List;

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
	

	@Override
	public List<UserDtls> findByUserUnionAndUserBloodGroupAndStatus(String union, String userBloodGroup,String status) {
		// TODO Auto-generated method stub
		return userRepo.findByUserUnionAndUserBloodGroupAndStatus(union, userBloodGroup,status);
	}
	@Override
	public List<UserDtls> findByUserThanaAndUserBloodGroupAndStatus(String thana, String userBloodGroup,String status) {
		// TODO Auto-generated method stub
		return userRepo.findByUserThanaAndUserBloodGroupAndStatus(thana, userBloodGroup,status);
	}

	public List<UserDtls> findByUserDistrictAndUserBloodGroupAndStatus(String userDistrict, String userBloodGroup,
			String status) {
		// TODO Auto-generated method stub
		return userRepo.findByUserDistrictAndUserBloodGroupAndStatus( userDistrict,  userBloodGroup, status);
	}

	public List<UserDtls> findByUserDivisionAndUserBloodGroupAndStatus(String userDivision, String userBloodGroup,
			String status) {
		// TODO Auto-generated method stub
		return userRepo.findByUserDivisionAndUserBloodGroupAndStatus( userDivision,  userBloodGroup, status);
	}

	public List<UserDtls> findByStatus(String status) {
		// TODO Auto-generated method stub
		return userRepo.findByStatus(status);
	}

	@Override
	public List<UserDtls> getBloodDonner(String status) {
		// TODO Auto-generated method stub
		return null;
	}




}
