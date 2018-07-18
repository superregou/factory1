package com.offcn;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class SendMail001 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JavaMailSenderImpl	mailsend=(JavaMailSenderImpl) context.getBean("mailSender");
	
		//�����򵥵��ʼ�
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("hk109@126.com");
		msg.setTo("hk109@126.com");
		msg.setSubject("JAVA0115�����ʼ�");
		msg.setText("�ú�ѧϰ,��������!");
		
		//�����ʼ�
		
		mailsend.send(msg);
		
		System.out.println("send ok");
	}
}
