package com.dylan.giflib.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@Configuration
@PropertySource("app.properties")
public class DataConfig {

  @Autowired
  private Environment env;

  @Bean
  public LocalSessionFactoryBean sessionFactoryBean() {
    // load the xml into the classpath
    Resource config = new ClassPathResource("hibernate.cfg.xml");
    // create a new session factory bean and set the location for config
    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
    sessionFactoryBean.setConfigLocation(config);
    // set packages to scan
    sessionFactoryBean.setPackagesToScan(env.getProperty("giflib.entity.package"));
    // set the data source for session factory
    sessionFactoryBean.setDataSource(dataSource());
    // return the session factory
    return sessionFactoryBean;
  } // end sessionFactoryBean method

  @Bean
  public DataSource dataSource() {
    // create basic data source object
    BasicDataSource dataSource = new BasicDataSource();
    // Set Driver class name
    dataSource.setDriverClassName(env.getProperty("giflib.db.driver"));
    // Set URL connections string
    dataSource.setUrl(env.getProperty("giflib.db.url"));
    // Set username and password
    dataSource.setUsername(env.getProperty("giflib.db.username"));
    dataSource.setPassword(env.getProperty("giflib.db.password"));
    return dataSource;
  } // end dataSource method

} // end DataConfig class
