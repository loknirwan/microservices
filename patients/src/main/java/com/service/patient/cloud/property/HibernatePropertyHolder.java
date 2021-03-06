package com.service.patient.cloud.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hibernatePropertyHolder")
@Scope("singleton")
public class HibernatePropertyHolder {
	
	
	@Value("${patients.hibernate.dialect.name}")
	private String dilectKey;
	
	@Value("${patients.hibernate.show_sql.name}")
	private String showSqlKey;
	
	@Value("${patients.hibernate.format_sql.name}")
	private String formatSqlKey;
	
	@Value("${patients.hibernate.cache.use_second_level_cache.name}")
	private String useSecondLevelCacheKey;
	
	@Value("${patients.hibernate.cache.query_cache_factory.name}")
	private String queryCacheFactoryKey;
	
	@Value("${patients.hibernate.cache.region.factory_class.name}")
	private String regionFactoryClassKey;
	
	@Value("${patients.hibernate.cache.provider_class.name}")
	private String cacheProviderClassKey;
	
	@Value("${patients.hibernate.dialect}")
	private String dilect;
	
	@Value("${patients.hibernate.show_sql}")
	private String showSql;
	
	@Value("${patients.hibernate.format_sql}")
	private String formatSql;
	
	@Value("${patients.hibernate.cache.use_second_level_cache}")
	private String useSecondLevelCache;
	
	@Value("${patients.hibernate.cache.query_cache_factory}")
	private String queryCacheFactory;
	
	@Value("${patients.hibernate.cache.region.factory_class}")
	private String regionFactoryClass;
	
	@Value("${patients.hibernate.cache.provider_class}")
	private String cacheProvideClass;
	
	public String getDilectKey() {
		return dilectKey;
	}
	public void setDilectKey(String dilectKey) {
		this.dilectKey = dilectKey;
	}
	public String getShowSqlKey() {
		return showSqlKey;
	}
	public void setShowSqlKey(String showSqlKey) {
		this.showSqlKey = showSqlKey;
	}
	public String getFormatSqlKey() {
		return formatSqlKey;
	}
	public void setFormatSqlKey(String formatSqlKey) {
		this.formatSqlKey = formatSqlKey;
	}
	public String getUseSecondLevelCacheKey() {
		return useSecondLevelCacheKey;
	}
	public void setUseSecondLevelCacheKey(String useSecondLevelCacheKey) {
		this.useSecondLevelCacheKey = useSecondLevelCacheKey;
	}
	public String getQueryCacheFactoryKey() {
		return queryCacheFactoryKey;
	}
	public void setQueryCacheFactoryKey(String queryCacheFactoryKey) {
		this.queryCacheFactoryKey = queryCacheFactoryKey;
	}
	public String getRegionFactoryClassKey() {
		return regionFactoryClassKey;
	}
	public void setRegionFactoryClassKey(String regionFactoryClassKey) {
		this.regionFactoryClassKey = regionFactoryClassKey;
	}
	public String getDilect() {
		return dilect;
	}
	public void setDilect(String dilect) {
		this.dilect = dilect;
	}
	public String getShowSql() {
		return showSql;
	}
	public void setShowSql(String showSql) {
		this.showSql = showSql;
	}
	public String getFormatSql() {
		return formatSql;
	}
	public void setFormatSql(String formatSql) {
		this.formatSql = formatSql;
	}
	public String getUseSecondLevelCache() {
		return useSecondLevelCache;
	}
	public void setUseSecondLevelCache(String useSecondLevelCache) {
		this.useSecondLevelCache = useSecondLevelCache;
	}
	public String getQueryCacheFactory() {
		return queryCacheFactory;
	}
	public void setQueryCacheFactory(String queryCacheFactory) {
		this.queryCacheFactory = queryCacheFactory;
	}
	public String getRegionFactoryClass() {
		return regionFactoryClass;
	}
	public void setRegionFactoryClass(String regionFactoryClass) {
		this.regionFactoryClass = regionFactoryClass;
	}
	public String getCacheProviderClassKey() {
		return cacheProviderClassKey;
	}
	public void setCacheProviderClassKey(String cacheProviderClassKey) {
		this.cacheProviderClassKey = cacheProviderClassKey;
	}
	public String getCacheProvideClass() {
		return cacheProvideClass;
	}
	public void setCacheProvideClass(String cacheProvideClass) {
		this.cacheProvideClass = cacheProvideClass;
	}
}
