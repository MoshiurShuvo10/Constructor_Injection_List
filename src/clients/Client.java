package clients;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Question;

public class Client {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("resources/configuration.xml");
		BeanFactory bfactory = new XmlBeanFactory(resource);
		Question question = (Question)bfactory.getBean("question1");
		question.displayQuestion();
	}

}
