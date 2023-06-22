package jp.te4a.spring.boot.myapp12;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WritterSate implements ConstraintValidator<Writter,String>{
	String param;
	@Override
	public void initialize(Writter nv) {param = nv.ok();}
	@Override
	public boolean isValid(String in ,ConstraintValidatorContext cxt) {
		if(in == null) {
			return false;
		}
		System.out.println(in.equals(param));
		return in.equals(param);
	}
}