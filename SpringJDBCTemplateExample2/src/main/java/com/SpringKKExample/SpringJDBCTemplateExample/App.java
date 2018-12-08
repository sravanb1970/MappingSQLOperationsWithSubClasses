package com.SpringKKExample.SpringJDBCTemplateExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringKKExample.Service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   ApplicationContext con=new ClassPathXmlApplicationContext("com/SpringKKExample/cfgs/applicationContext.xml");
Employee e =new Employee("Srikanth","male","email@nomail.com");

   EmployeeService es=con.getBean("EmployeeService", EmployeeService.class);
es.createEmployee(e);
   System.out.println("inserted");
    }
}
