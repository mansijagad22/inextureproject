package config1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import model.Person;
 

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	 @Autowired
	  private ApplicationContext context;
	 
	  @Bean
	  public LocalSessionFactoryBean getSessionFactory() {
	    LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	    factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
	    factoryBean.setAnnotatedClasses(Person.class);
	    return factoryBean;
	  }
	 
	  @Bean
	  public HibernateTransactionManager getTransactionManager() {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	    transactionManager.setSessionFactory(getSessionFactory().getObject());
	    return transactionManager;
	  }
}
