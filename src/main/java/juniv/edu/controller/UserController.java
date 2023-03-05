package juniv.edu.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import juniv.edu.model.UserDtls;
import juniv.edu.repository.UserRepository;

@Controller
@RequestMapping("/user/")

public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		UserDtls user = userRepo.findByEmail(email);

		m.addAttribute("user", user);

	}
	
	@GetMapping("/")
	public String home()
	{
		return "user/home";
	}
	@GetMapping("/search")
	public String search()
	{
		return "user/search";
	}
	
	@GetMapping("/changePassword")
	public String loadChangePassword()
	{
		return "user/change_password";
	}
	
	@GetMapping("/updateProfile")
	public String loadUpdateProfile()
	{
		return "user/update_profile";
	}
	@PostMapping("/editProfile")
	
/*	public String updateProfile(Principal p,@RequestParam("userPhone") String userPhone,
			@RequestParam("status") String status,@RequestParam("userDistrict") String userDistrict,HttpSession session)
	{
		String email=p.getName();
		UserDtls loginUser= userRepo.findByEmail(email);
		if(userPhone!="")loginUser.setUserPhone(userPhone);
		loginUser.setStatus(status);
		userRepo.save(loginUser);
		session.setAttribute("msg", "Update Sucess");
		
		System.out.println(userDistrict);
		
		
		
		return "redirect:/user/updateProfile";
	}
	
	*/
	public String updateProfile(HttpServletRequest request,Principal p, HttpSession session)
	{
		String email=p.getName();
		UserDtls loginUser= userRepo.findByEmail(email);
		
		String name=request.getParameter("userName");
		if(name!="")loginUser.setUserName(name);
		String age=request.getParameter("userAge");
		if(age!="")loginUser.setUserAge(age);
		
		String phone=request.getParameter("userPhone");
		if(phone!="")loginUser.setUserPhone(phone);
		String status=request.getParameter("status");
		loginUser.setStatus(status);
		String division=request.getParameter("userDivision");
		if(division!="")
		loginUser.setUserDivision(division);
		
		
		
		String district=request.getParameter("userDistrict");
		if(district!=null)
		loginUser.setUserDistrict(district);
		
		String thana=request.getParameter("userThana");
		if(thana!=null)
		loginUser.setUserThana(thana);
		
		String union=request.getParameter("userUnion");
		if(union!=null)
		loginUser.setUserUnion(union);
		
		
		userRepo.save(loginUser);
		session.setAttribute("msg", "Update Sucess");
		
		return "redirect:/user/updateProfile";
	}
	
	@PostMapping("/updatePassword")
	
	
	
	public String changePassword(Principal p,@RequestParam("oldPass") String oldPass,
				@RequestParam("newPass") String newPass,HttpSession session)
	{
		String email=p.getName();
		UserDtls loginUser= userRepo.findByEmail(email);
		
		boolean f=passwordEncode.matches(oldPass, loginUser.getUserPassword());
		
		if(f)
		{
			
			loginUser.setUserPassword(passwordEncode.encode(newPass));
			UserDtls updatePasswordUser= userRepo.save(loginUser);
			if(updatePasswordUser!=null)
			{
				
				session.setAttribute("msg", "Password Change Sucess");
			}
			else
			{
				session.setAttribute("msg", "someThing wrong on server");
			}
		}
		else
		{
			session.setAttribute("msg", "Old password incorrect");
			
		}
		
		
		return "redirect:/user/changePassword";
	}

}
