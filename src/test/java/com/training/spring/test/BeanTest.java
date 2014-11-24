package com.training.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.training.spring.bean.ExampleComponent;
import com.training.spring.bean.Hello;
import com.training.spring.bean.Humen;

@RunWith(SpringJUnit4ClassRunner.class) // รัน กับ Spring + JUnit 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) // หาทั้งหมดที่อยู่ใน classpast ซึ่งคือ  applicationContext.xml สำหรับไว้ เขียน เฉพาะพวก Test
public class BeanTest {

	@Autowired   // Spring จะเตรียม class ทุกอย่างไว้ให้เราแล้ว  หรือการเรียกใช้ ต่อๆกัน
	private Hello hello;
	
	@Autowired
	private Humen humen;
	
	@Autowired
	private ExampleComponent examplecomponent;
	
	@Test
	public void testSimpleBean() {   // แบบที่ 1 เรียก hello แบบ ปกติ
		
		System.out.println("### This is test for Simple Bean ###");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) context.getBean("hello");
		System.out.println("#################### Hello ####################");
		System.out.println("hello : " + hello);
	}
	
	@Test
	public void testAutowiredBean() {  // แบบที่ 2 ใช้ Autowired มำให้ไม่ต้องประกาศ context 
		System.out.println("\n############# Autowired Hello #############");
		System.out.println(hello);
	}
	
	@Test
	public void testAutowiredBeanHumen() {  // แบบที่ 2 ใช้ Autowired มำให้ไม่ต้องประกาศ context 
		System.out.println("\n############# Autowired Humen #############");
		System.out.println(humen);
	}
	
	@Test
	public void testExmapleComponent() {
		
		System.out.println("\nShow message : " + examplecomponent);
		System.out.println("\nShow hello : " + examplecomponent.getHello());
		System.out.println("\nShow humen : " + examplecomponent.getHumen());
		System.out.println("\nShow message : " + examplecomponent.getMessage());
		System.out.println("\nShow message : " + examplecomponent.getMessage1());
	}
}
