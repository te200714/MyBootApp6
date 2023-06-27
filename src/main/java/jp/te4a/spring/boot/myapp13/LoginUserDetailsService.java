package jp.te4a.spring.boot.myapp13;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import 
org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import jp.te4a.spring.boot.myapp13.bean.UserBean;
import jp.te4a.spring.boot.myapp13.other.LoginUserDetails;
import jp.te4a.spring.boot.myapp13.repository.UserRepository;

@Service
public class LoginUserDetailsService implements UserDetailsService{
	
}