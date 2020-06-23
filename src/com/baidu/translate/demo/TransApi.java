package com.baidu.translate.demo;

import java.util.HashMap;
import java.util.Map;

public class TransApi
{
	private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";

	private String appid;
	private String securityKey;

	public TransApi(String appid, String securityKey)
	{
		this.appid = appid;
		this.securityKey = securityKey;
	}
	/**
	 * 获取返回结果
	 * @param query 需要翻译的文本
	 * @param from 翻译源语言
	 * @param to 译文语言
	 * @return json字符串
	 */
	public String getTransResult(String query, String from, String to)
	{
		Map<String, String> params = buildParams(query, from, to);
		return HttpGet.get(TRANS_API_HOST, params);
	}
	/**
	 * 翻译成英语
	 * @param query 要翻译的文本
	 * @return 翻译后的文本.
	 */
	public String toEnglish(String query)
	{
		return getTransResult(query, "auto", "en");
	}
	/**
	 * 翻译成中文
	 * @param query 要翻译的文本
	 * @return 翻译后的文本.
	 */
	public String toChinese(String query)
	{
		return getTransResult(query, "auto", "zh");
	}
	/**
	 * 拼接请求参数
	 * @param query 需要翻译的文本
	 * @param from 源语言
	 * @param to 译文语言
	 * @return 保存有请求参数的Map集合
	 */
	private Map<String, String> buildParams(String query, String from,
			String to)
	{
		Map<String, String> params = new HashMap<String, String>();
		params.put("q", query);
		params.put("from", from);
		params.put("to", to);

		params.put("appid", appid);

		// 随机数
		String salt = String.valueOf(System.currentTimeMillis());
		params.put("salt", salt);

		// 签名
		String src = appid + query + salt + securityKey; // 加密前的原文
		params.put("sign", MD5.md5(src));

		return params;
	}

}
