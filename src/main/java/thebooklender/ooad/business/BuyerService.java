package thebooklender.ooad.business;

import thebooklender.ooad.database.BuyerDatabase;
import thebooklender.ooad.models.BuyerInfoModel;
import thebooklender.ooad.models.LoginModel;
import thebooklender.ooad.models.SignUpModel;

public class BuyerService {
	private BuyerDatabase buyerDatabase;
	public BuyerService() {
		buyerDatabase=new BuyerDatabase();
	}
	public BuyerInfoModel validateLogin(LoginModel loginObj) {
		System.out.println("a"+loginObj);
		if(buyerDatabase.validateLogin(loginObj)==true) {
			System.out.println("c");
			return buyerDatabase.getBuyerInfo(loginObj);
		}else {
			return null;
		}
	}
	public boolean signUp(SignUpModel signUpObj) {
			if(buyerDatabase.signUp(signUpObj)==1) {
				return true;
			}
		return false;
	}
	public boolean validate(String email) {
		//System.out.println(signUpObj);
		return buyerDatabase.validateUsername(email); 
	}
}
