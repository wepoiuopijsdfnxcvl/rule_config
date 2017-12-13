package com.honglu.headline.rule.config.core.utils;


import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SysParamUtils {

	private static Logger logger = LoggerFactory.getLogger(SysParamUtils.class);

	/**
	 * Object转Json
	 */
	public static String ObjectToJson(Object value) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String js = mapper.writeValueAsString(value);
			return js;
		} catch (Exception e) {
			logger.error("Object转换Json异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Object转换Json异常:" + e.getMessage());
		}
	}

	/**
	 * Json转Object（List）
	 *
	 * @param json
	 *            需要转换的JSON字符串
	 * @param bean
	 *            JavaBean,
	 * @return 拿到结果需要强转一次，因为你拿到的是Object, 例如这样调用和强转： List&lt;School&gt; lst
	 *         =(List&lt;School&gt;)StringUtil.JsonToObjectList(value,
	 *         School.class);
	 */
	public static Object JsonToList(String json, Class<?> bean) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, bean);
		return mapper.readValue(json, javaType);
	}

	/**
	 * Json转Object（JavaBean）
	 *
	 * @param json
	 *            需要转换的JSON字符串
	 * @param bean
	 *            JavaBean,
	 * @return 拿到结果需要强转一次，因为你拿到的是Object, 例如这样调用和强转： School lst
	 *         =(School)StringUtil.JsonToObjectList(value, School.class);
	 */
	public static Object JsonToBean(String json, Class<?> bean) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory().uncheckedSimpleType(bean);
		return mapper.readValue(json, javaType);
	}

	/**
	 * 将json格式的字符串解析成Map对象
	 */
	public static Map<String, Map<String, Object>> JsonToMap(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Map<String, Object>> maps = mapper.readValue(json, Map.class);
			return maps;
		} catch (Exception e) {
			logger.error("将json格式的字符串解析成Map对象异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("将json格式的字符串解析成Map对象异常:" + e.getMessage());
		}
	}

	/**
	 * 将json转换成List<Map<String,Object>>
	 * 
	 * @param json
	 * @return
	 */
	public static List<Map<String, Object>> JsonToListString(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String, Object>> maps = mapper.readValue(json, List.class);
			return maps;
		} catch (Exception e) {
			logger.error("将json转换成List异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("将json转换成List异常:" + e.getMessage());
		}
	}

	/**
	 * 将json转换成Map<String, Map>
	 * 
	 * @param json
	 * @return
	 */
	public static Map<String, Map> JsonToMapContainMap(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Map> maps = mapper.readValue(json, Map.class);
			return maps;
		} catch (Exception e) {
			logger.error("将json转换成Map异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("将json转换成Map异常:" + e.getMessage());
		}
	}

	/**
	 * 将json转换成Map<String, String>
	 * 
	 * @param json
	 * @return
	 */
	public static Map<String, String> JsonToMapString(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<String, String> maps = mapper.readValue(json, Map.class);
			return maps;
		} catch (Exception e) {
			logger.error("将json转换成Map异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("将json转换成Map异常:" + e.getMessage());
		}
	}

	/**
	 * 将json转换成Map<String, Object>
	 * 
	 * @param json
	 * @return
	 */
	public static Map<String, Object> JsonToMapObject(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> maps = mapper.readValue(json, Map.class);
			return maps;
		} catch (Exception e) {
			logger.error("将json转换成Map异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("将json转换成Map异常:" + e.getMessage());
		}
	}

	/**
	 * 将json转换成Map
	 * 
	 * @param json
	 * @return
	 */
	public static Map JsonToRealMap(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map maps = mapper.readValue(json, Map.class);
			return maps;
		} catch (Exception e) {
			logger.error("将json转换成Map异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("将json转换成Map异常:" + e.getMessage());
		}
	}

	/**
	 * 正则表达式验证
	 *
	 * @param value
	 *            需要验证的值
	 * @param regexp
	 *            进行验证的正则表达式
	 */
	public static boolean regExpTest(String value, String regexp) {
		// 验证标识符必须由字母、数字、下划线组成
		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(value);
		boolean flg = m.matches();
		return flg;
	}

	/**
	 * ISO-8859-1转UTF-8 主要用于POST数据处理
	 *
	 * @param str
	 *            需要转码的值
	 */
	public static String encodeStr(String str) {
		try {
			return new String(str.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	/**
	 * 利用MD5进行加密
	 *
	 * @param str
	 *            待加密的字符串
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException
	 *             没有这种产生消息摘要的算法
	 * @throws UnsupportedEncodingException
	 */
	public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {

		byte[] bs = MessageDigest.getInstance("MD5").digest(str.getBytes());
		StringBuilder sb = new StringBuilder(40);
		for (byte x : bs) {
			if ((x & 0xff) >> 4 == 0) {
				sb.append("0").append(Integer.toHexString(x & 0xff));
			} else {
				sb.append(Integer.toHexString(x & 0xff));
			}
		}
		return sb.toString();
	}

	/**
	 * 对文字进行编码处理
	 *
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String encoderUrl(String str) {
		try {
			return URLEncoder.encode(str, "utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.error("对文字进行编码处理异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("对文字进行编码处理异常:" + e.getMessage());
		}
	}

	/**
	 * 对编码后的文字进行解码
	 *
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String decoderUrl(String str) {
		try {
			return URLDecoder.decode(str, "utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.error("对编码后的文字进行解码异常:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("对编码后的文字进行解码异常:" + e.getMessage());
		}
	}

	/**
	 * 根据key获取map中对应的value, 不存在则返回空
	 * 
	 * @param map
	 * @param key
	 * @return
	 */
	public static String mapValueToString(Map map, String key) {
		if (map != null && map.get(key) != null) {
			String str = map.get(key).toString();
			logger.info("key = [" + key + "]对应的值为：" + str);
			return str;
		}
		logger.info("key = [" + key + "]对应的值为空");
		return "";
	}
}
