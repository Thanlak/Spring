package com.training.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Date: 10/31/2014
 * Time: 3:32 PM
 *
 * @author assanai.manurat
 */
@Component // ใส่หลังจากเรียน service เพื่อเตรียมทุกๆอย่าง เพื่อให้หาเจอ
public class Humen {

	Hello hello;
	
    public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}

	private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Humen{");
//        sb.append("hello=").append(hello);
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
