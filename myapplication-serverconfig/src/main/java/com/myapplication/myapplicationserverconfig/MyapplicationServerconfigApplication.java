package com.myapplication.myapplicationserverconfig;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyapplicationServerconfigApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyapplicationServerconfigApplication.class, args);
		System.out.println("Spring boot hello world ............");
	}

}
