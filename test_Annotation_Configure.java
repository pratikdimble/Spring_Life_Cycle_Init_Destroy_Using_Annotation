package com.app.annotation_config;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_Annotation_Configure {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/annotation_config/config.xml");
			Object ob=ctx.getBean("Annotation");
				model mod=(model)ob;
					System.out.println("\t\t"+mod);
						ctx.registerShutdownHook();
	}
}