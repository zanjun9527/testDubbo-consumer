package aka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDubbo {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("dubbo.xml");
		 testApi helloServicegogo = (testApi) ac.getBean("helloServicegogo");
		 while(true){
			 Thread.sleep(2000);
			 helloServicegogo.sayHello();
		 }
		 
	}

}
