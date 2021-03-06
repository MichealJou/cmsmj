
package com.mj.common.config;

import java.util.Map;

import com.google.common.collect.Maps;
import com.mj.common.util.PropertiesLoader;

/**
 * 全局配置类
 * @author zhouping
 * @version 2015-08-20
 */
public class Global {
	
	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = Maps.newHashMap();
	
	/**
	 * 属性文件加载对象
	 */
	private static PropertiesLoader propertiesLoader = new PropertiesLoader("mj.properties");
	
	/**
	 * 获取配置
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = propertiesLoader.getProperty(key);
			map.put(key, value);
		}
		return value;
	}
	
}
