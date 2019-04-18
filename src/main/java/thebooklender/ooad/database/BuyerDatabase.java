package thebooklender.ooad.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import thebooklender.ooad.models.BuyerInfoModel;
import thebooklender.ooad.models.LoginModel;
import thebooklender.ooad.models.SignUpModel;

public class BuyerDatabase {
	private Connection connection;
	public BuyerDatabase(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(
					DatabaseConfiguration.dataBaseUrl,
					DatabaseConfiguration.userName,
					DatabaseConfiguration.password);
		}catch(Exception e) {
			System.out.println("Exception while establishing connection");
			System.out.println(e);
		}
	}
	public Boolean validateLogin(LoginModel loginObj) {
		try {
			String mobileNum=loginObj.getEmail();
			System.out.println(loginObj);
			PreparedStatement stmt=connection.prepareStatement("SELECT password FROM users WHERE user_email='"+mobileNum+"';");
			System.out.println("anirudh ="+stmt);
			ResultSet resSet=stmt.executeQuery();
			while(resSet.next()) {
				String pwd=resSet.getString(1);
				if(pwd.equals(loginObj.getPassword())==true) {
					return true;
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	public BuyerInfoModel getBuyerInfo(LoginModel loginObj) {
		BuyerInfoModel buyer=new BuyerInfoModel();
		try {
			String email=loginObj.getEmail();
			PreparedStatement stmt=connection.prepareStatement("SELECT id, user_name, user_email, password,address FROM users WHERE user_email='"+email +"';");
			System.out.println("print123 ="+stmt);
			System.out.println("print email ="+email);
			ResultSet resSet=stmt.executeQuery();
			while(resSet.next()) {
				buyer.setId(resSet.getInt(1));
				buyer.setEmail(resSet.getString(3));
				buyer.setName(resSet.getString(2));
				buyer.setPassword(resSet.getString(4));
				buyer.setAddress(resSet.getString(5));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return buyer;
	}
	
	public Boolean validateUsername(String uname) 
	{
		Boolean result=false;
		try {
//			String uname=loginObj.getMobileNum();
			PreparedStatement stmt=connection.prepareStatement("SELECT * FROM users WHERE user_email='"+uname+"';");
			
			ResultSet resSet=stmt.executeQuery();
			while(resSet.next()) {
				result=true;
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public Integer signUp(SignUpModel signUpObj) {
		Integer result=0;
		try {
			System.out.println("print1 ="+signUpObj);
			System.out.println("print2 ="+signUpObj.getName());
			System.out.println("print3 ="+signUpObj.getPassword());
			System.out.println("print4 ="+signUpObj.getAddress());
			PreparedStatement stmt=connection.prepareStatement("insert into users(user_name,user_email,password,address) values('"+signUpObj.getName()+"','"+signUpObj.getEmail()+"','"+signUpObj.getPassword()+"','"+signUpObj.getAddress()+"');");
			System.out.println("print5 ="+stmt);
			result=stmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
