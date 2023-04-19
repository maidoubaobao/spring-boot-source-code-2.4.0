package com.mingbao.spring.boot.demo;

import com.mingbao.spring.boot.demo.value.ValueDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * description: springBoot demo启动入口
 * date: 2023-04-18
 *
 * @author Wind の Wound
 */
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class);
		ValueDemo valueDemo = context.getBean(ValueDemo.class);
		System.out.println(valueDemo.getName());
	}
}
