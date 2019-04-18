package thebooklender.ooad.models;

public class LoginModel {
	private String email;
	private String password;
	public LoginModel()
	{
		
	}
	
	@Override
	public String toString() {
		return "LoginModel [email=" + email + ", password=" + password + "]";
	}

	public LoginModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
