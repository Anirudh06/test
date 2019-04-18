package thebooklender.ooad.models;

import java.time.LocalDate;

public class BuyerInfoModel {
	private int id;
	private String email;
	private String address;
	private String name;
	private String password;
	public BuyerInfoModel(){
		
	}
	
	@Override
	public String toString() {
		return "BuyerInfoModel [id=" + id + ", email=" + email + ", address=" + address + ", name=" + name
				+ ", password=" + password + "]";
	}




	public BuyerInfoModel(int id,String name, String email,  String password , String address) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
