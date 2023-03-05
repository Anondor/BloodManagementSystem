package juniv.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import juniv.edu.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
	
	public boolean existsByEmail(String email);

	public UserDtls findByEmail(String email);
	
	public UserDtls findByEmailAndUserPhone(String email, String mobno);

	
	

	
	

}
