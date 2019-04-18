package thebooklender.ooad.business;

import java.util.ArrayList;

import thebooklender.ooad.database.CaroselDatabase;
import thebooklender.ooad.models.ItemInfo;


public class CaroselService {
	private CaroselDatabase caroselDatabase=new CaroselDatabase();
	public ArrayList<ItemInfo> getAllItemsForACategory(String cate){
		return caroselDatabase.getAllItemsForACategory(cate);
	}

}
