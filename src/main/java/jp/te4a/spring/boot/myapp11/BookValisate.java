package jp.te4a.spring.boot.myapp11;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BookValisate implements ConstraintValidator<BookValid,String>{
	String param;
	@Override
	public void initialize(BookValid nv) {param = nv.param();}
	@Override
	public boolean isValid(String in ,ConstraintValidatorContext cxt) {
		if(in == null) {
			return false;
		}
		System.out.println(in.equals(param));
		return !in.equals(param);
	}
}