package com.xml.ioc.cyclic.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProCirculationA {
	//产生代理
	@Autowired
	@Lazy
	private  ProCirculationB proCirculationB;
}
