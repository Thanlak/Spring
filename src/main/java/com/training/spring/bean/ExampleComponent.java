package com.training.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User: assanai.manurat
 * Date: 4/24/2014
 * Time: 10:33 PM
 */

@Component // ����� ���� class �������ͧ����ҧ ����  applicationContext ����͹���ҧ Hello  �������͹���������������������
public class ExampleComponent {

	@Autowired
	private Hello hello;
	
	@Autowired
	private Humen humen;
	
	public Humen getHumen() {
		return humen;
	}

	public void setHumen(Humen humen) {
		this.humen = humen;
	}

	@Value("${component.message}") // ������ҹ��� � resources.properties
    private String message = "This is my example component bean";
	
	@Value("${name}") // ������ҹ��� � resources.properties ���� ����� ��� Include ���
    private String message1;
	
	
    public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExampleComponent{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
