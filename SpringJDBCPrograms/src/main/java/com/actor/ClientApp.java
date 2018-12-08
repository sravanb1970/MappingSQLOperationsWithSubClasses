package com.actor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/actor/spring-config.xml");
	ActorDAO dao=con.getBean("ActorDAO", ActorDAO.class);
String date="2017-02-14 02:13:00";
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
java.util.Date udate = null;
try {
	udate = sdf.parse(date);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


dao.insert(new Actor("Sravan","Swathi",271987,"my life","Bangalore"));
	
	System.out.println("inserted successfully");
	
}
}
