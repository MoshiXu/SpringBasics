package ccgg.SpringIOC;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import stereotype.Book;

@Configuration
@ComponentScan(basePackages= {"stereotype"})
public class JavaConfig {
	@Autowired
	@Qualifier("historyBook")
	Book book;
	
	@Bean
	public Set<String>emails(){
		Set<String>emails=new HashSet<>();
		emails.add("bob@gmail.com");
		emails.add("bob@cloud.com");
		return emails;
	}

}
