package com.mingbao.spring.boot.demo.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * description: @Value注解 demo
 * date: 2023-04-18
 *
 * @author Wind の Wound
 */
@Component
public class ValueDemo {

	@Value("${name:ming}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
