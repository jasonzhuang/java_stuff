package utility;

public class PasswordUtil {

@UseCase(id=16,say="Password musy contain at least one numeric")
public boolean validate(String password)
{
	return (password.matches("\\w*\\d\\w*"));
}
@UseCase(id=17)
public  String encrypt(String password)
{
	return new StringBuilder(password).reverse().toString();
}
}
