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

@RunWith(SpringJUnit4ClassRunner.class) // �ѹ �Ѻ Spring + JUnit 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) // �ҷ������������� classpast ��觤��  applicationContext.xml ����Ѻ��� ��¹ ੾�оǡ Test
public class BeanTest {

	@Autowired   // Spring ������� class �ء���ҧ�������������  ���͡�����¡�� ����ѹ
	private Hello hello;
	
	@Autowired
	private Humen humen;
	
	@Autowired
	private ExampleComponent examplecomponent;
	
	@Test
	public void testSimpleBean() {   // Ẻ��� 1 ���¡ hello Ẻ ����
		
		System.out.println("### This is test for Simple Bean ###");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) context.getBean("hello");
		System.out.println("#################### Hello ####################");
		System.out.println("hello : " + hello);
	}
	
	@Test
	public void testAutowiredBean() {  // Ẻ��� 2 �� Autowired ���������ͧ��С�� context 
		System.out.println("\n############# Autowired Hello #############");
		System.out.println(hello);
	}
	
	@Test
	public void testAutowiredBeanHumen() {  // Ẻ��� 2 �� Autowired ���������ͧ��С�� context 
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
