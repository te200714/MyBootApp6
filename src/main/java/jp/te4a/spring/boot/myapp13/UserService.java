package jp.te4a.spring.boot.myapp13;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;
import jp.te4a.spring.boot.myapp13.UserBean;
import jp.te4a.spring.boot.myapp13.UserForm;
import jp.te4a.spring.boot.myapp13.UserRepository;

@Service
public class UserService{
	@Autowired
	UserRepository userRepository;
	
	public UserForm create(UserForm userForm) {
		userForm.setPassword(new Pbkdf2PasswordEncoder(userFrom.getPassword()));
		
		UserBean userBean = new UserBean();
		BeanUtils.copyProperties(userForm, userBean);
		
		userRepository.save(userBean);
		
		return userForm;	
	}
}