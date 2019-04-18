package thebooklender.ooad.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import thebooklender.ooad.models.ItemInfo;

public class CaroselDatabase {
  private Connection connection;

  public CaroselDatabase(){
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
 
 
  public ArrayList<ItemInfo> getAllItemsForACategory( String cate)
  {
    ArrayList<ItemInfo> allItems=new ArrayList<ItemInfo>();
    try {
      PreparedStatement stmt=connection.prepareStatement("select id,title,author,isbn,owner_id,category,publisher,description,image, book_id from book where category="+cate+";");
      //stmt.setString(1, category);

      ResultSet rs=stmt.executeQuery();
      System.out.println("here ="+stmt);
      while(rs.next()) {
        ItemInfo item=new ItemInfo();
        item.setId(rs.getInt(1));
        item.setAuthor(rs.getString(3));
        item.setTittle(rs.getString(2));
        item.setIsbn(rs.getString(4));
        item.setOwner_id(rs.getInt(5));
        item.setCategory(rs.getString(6));
        item.setPublisher(rs.getString(7));
        item.setImage(rs.getString(8));
        item.setDescription(rs.getString(9));
        item.setBook_id(rs.getString(10));
        allItems.add(item);
      }
    }catch(Exception e) {
      System.out.println(e);
    }
    return allItems;
  }
}