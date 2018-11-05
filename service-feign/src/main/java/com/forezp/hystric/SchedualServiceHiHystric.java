package com.forezp.hystric;

import com.forezp.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 断路器
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry invoke error --->" + name;
	}
}
