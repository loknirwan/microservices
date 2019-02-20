package com.service.careplan.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.service.careplan.cloud.property.DataSourcePropertyHolder;
import com.service.careplan.cloud.property.GeneralPropertyHolder;
import com.service.careplan.cloud.property.HibernatePropertyHolder;


@Configuration
@ComponentScan(basePackages= {"com.service.careplan.service", "com.service.careplan.repository"})
public class CareplanRootContextInitialiser {

	
	@Autowired
	private GeneralPropertyHolder generalPropertyHolder;
	
	@Autowired
	private HibernatePropertyHolder hibernatePropertyHolder;
	
	@Autowired
	private DataSourcePropertyHolder dataSourcePropertyHolder;
	
	@Autowired
	@DependsOn({"entityManagerFactory"})
	@Bean("transactionManager")
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}

	@Autowired
	@DependsOn({"jpaDialect", "jpaVendorAdapter", "jpaProperties", "generalPropertyHolder", "dataSource"})
	@Bean("entityManagerFactory")
	public EntityManagerFactory entityManagerFactory(JpaDialect jpaDialect, JpaVendorAdapter jpaVendorAdapter, DataSource dataSource, Properties jpaProperties) {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan("com.service.careplan.entity");
		factoryBean.setJpaDialect(jpaDialect);
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
		factoryBean.setJpaProperties(jpaProperties);
		factoryBean.setPersistenceUnitName(generalPropertyHolder.getName());
		factoryBean.setDataSource(dataSource);
		factoryBean.afterPropertiesSet();
		return factoryBean.getNativeEntityManagerFactory();
	}
	
	@Bean("jpaDialect")
	public JpaDialect jpaDialect() {
		return new HibernateJpaDialect();
	}
	
	@Bean("jpaVendorAdapter")
	public JpaVendorAdapter jpaVendorAdapter() {
		return new HibernateJpaVendorAdapter();
	}
	
	@Bean("jpaProperties")
	@DependsOn({"hibernatePropertyHolder"})
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty(hibernatePropertyHolder.getDilectKey(), hibernatePropertyHolder.getDilect());
		properties.setProperty(hibernatePropertyHolder.getFormatSqlKey(), hibernatePropertyHolder.getFormatSql());
		//properties.setProperty(hibernatePropertyHolder.getQueryCacheFactoryKey(), hibernatePropertyHolder.getQueryCacheFactory());
		//properties.setProperty(hibernatePropertyHolder.getRegionFactoryClassKey(), hibernatePropertyHolder.getRegionFactoryClass());
		properties.setProperty(hibernatePropertyHolder.getShowSqlKey(), hibernatePropertyHolder.getShowSql());
		//properties.setProperty(hibernatePropertyHolder.getUseSecondLevelCacheKey(), hibernatePropertyHolder.getUseSecondLevelCache());
		//properties.setProperty(hibernatePropertyHolder.getCacheProviderClassKey(), hibernatePropertyHolder.getCacheProvideClass());
		return properties;
	}
	
	@Bean("dataSource")
	@DependsOn({"dataSourcePropertyHolder"})
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(dataSourcePropertyHolder.getDriver());
		dataSource.setUsername(dataSourcePropertyHolder.getUsername());
		dataSource.setPassword(dataSourcePropertyHolder.getPassword());
		dataSource.setUrl(dataSourcePropertyHolder.getUri());
		dataSource.setSchema(dataSourcePropertyHolder.getName());
		return dataSource;
	}
	


}
