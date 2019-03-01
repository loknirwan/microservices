package com.service.allergy.cloud.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hibernatePropertyHolder")
@Scope("singleton")
public class HibernatePropertyHolder {
	
	
	@Value("${allergies.hibernate.dialect.name}")
	private String dilectKey;
	
	@Value("${allergies.hibernate.show_sql.name}")
	private String showSqlKey;
	
	@Value("${allergies.hibernate.format_sql.name}")
	private String formatSqlKey;
	
	@Value("${allergies.hibernate.cache.use_second_level_cache.name}")
	private String useSecondLevelCacheKey;
	
	@Value("${allergies.hibernate.cache.query_cache_factory.name}")
	private String queryCacheFactoryKey;
	
	@Value("${allergies.hibernate.cache.region.factory_class.name}")
	private String regionFactoryClassKey;
	
	@Value("${allergies.hibernate.cache.provider_class.name}")
	private String cacheProviderClassKey;
	
	@Value("${allergies.hibernate.dialect}")
	private String dilect;
	
	@Value("${allergies.hibernate.show_sql}")
	private String showSql;
	
	@Value("${allergies.hibernate.format_sql}")
	private String formatSql;
	
	@Value("${allergies.hibernate.cache.use_second_level_cache}")
	private String useSecondLevelCache;
	
	@Value("${allergies.hibernate.cache.query_cache_factory}")
	private String queryCacheFactory;
	
	@Value("${allergies.hibernate.cache.region.factory_class}")
	private String regionFactoryClass;
	
	@Value("${allergies.hibernate.cache.provider_class}")
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
