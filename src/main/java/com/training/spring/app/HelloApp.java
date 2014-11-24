package com.training.spring.app;

import com.training.spring.bean.ExampleComponent;
import com.training.spring.bean.Hello;
import com.training.spring.bean.Humen;
import org.hibernate.criterion.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date: 10/31/2014
 * Time: 3:21 PM
 *
 * @author assanai.manurat
 */
public class HelloApp {

    public static void main(String[] args) {

        loadXmlClasspathApplicationContext();
    }

    private static void loadXmlClasspathApplicationContext() {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Hello hello = (Hello) context.getBean("hello");
        
        System.out.println("------ Hello ------");
        System.out.println("hello : " + hello);
        System.out.println("hello.humen : " + hello.getHumen());

//      cast เปลี่ยน type ให้ตรงกัน  >> (Humen)
        System.out.println("\n------ Humen ------");
        Humen humen = (Humen) context.getBean("humen");
        System.out.println("humen : "+ humen);

//      ประกาศเป็น >> (Humen.class) ปลอดภัยกว่า cast เพราะ cast อาจพิมผิดได้ 
        System.out.println("\n------ Humen Object ------");
        Humen humenObj = context.getBean(Humen.class);
        System.out.println("humenObj : "+ humenObj);
        
//      hello เรียก หรืออ้างอิง จาก humen
        System.out.println("\n------ Humen Reference ------");
        System.out.println("Display humen firstname : " + hello.getHumen().getFirstName());
        System.out.println("Display humen lastname : " + hello.getHumen().getLastName());
        
//      humen เรียก หรืออ้างอิง จาก hello
        System.out.println("\n------ Hello Reference ------");
        System.out.println("Display hello age : " + humen.getHello().getAge());
        System.out.println("Display hello message : " + humen.getHello().getMessage());
        
//        System.out.println("\n------ Component ------");   // ExampleComponent แบบ ปกติ
//        ExampleComponent component = context.getBean(ExampleComponent.class);
//        System.out.println("component : " + component);
    }
}
