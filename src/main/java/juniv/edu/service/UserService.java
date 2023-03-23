package juniv.edu.service;

import java.util.List;

import juniv.edu.model.UserDtls;

public interface UserService {
	
	public UserDtls createUser(UserDtls user);
	public boolean checkEmail(String email);
	public List<UserDtls> getBloodDonner(String status);
	public List<UserDtls> findByUserUnionAndUserBloodGroupAndStatus(String union,String userBloodGroup,String status);
	public List<UserDtls> findByUserThanaAndUserBloodGroupAndStatus(String thana, String userBloodGroup, String status);
	public List<UserDtls> findByUserDistrictAndUserBloodGroupAndStatus(String userDistrict, String userBloodGroup, String status);
	
}
