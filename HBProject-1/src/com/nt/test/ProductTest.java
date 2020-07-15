package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class ProductTest {

	public static void main(String[] args) {
          
		Configuration cfg=null;
		SessionFactory factory=null;
		Product product=null;
		Session session=null;
		Transaction txn=null;
		boolean flag=false;
		
		//Activate Hibernate Framework
		cfg=new Configuration();
		//Supply hibernate File as configuration file
		cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		//Build Session Factory
		factory=cfg.buildSessionFactory();
		//Open Session
		session=factory.openSession();
		//Create Entity Object save with DB s/w
		product=new Product();
		product.setProductId(2); product.setProductName("chair");product.setProductPrice(20000.0f);product.setProductQuentity(1);
		try {
		      txn=session.beginTransaction();
		      System.out.println(product);
		      session.save(product);
		      flag=true;
		}catch(HibernateException e) {
			e.printStackTrace();
			flag=false;
		}
		if(flag==true) {
			txn.commit();
		System.out.println("record inserted successfully");
		}
		else {
			txn.rollback();
			System.out.println("record not inserted");
		}
	}

}
