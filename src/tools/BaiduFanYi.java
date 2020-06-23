package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import com.alibaba.fastjson.JSON;
import com.baidu.translate.demo.TransApi;
import domain.Result;
import domain.TransResult;

public class BaiduFanYi
{
	// 在平台申请的APP_ID 详见
	// http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
	private static final String APP_ID;
	private static final String SECURITY_KEY;
	static
	{
		Properties config = new Properties();
		try
		{
			config.load(new FileInputStream(new File("BaiduFanYi.properties")));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(config.getProperty("APP_ID"));
		// System.out.println(config.getProperty("SECURITY_KEY"));
		APP_ID = config.getProperty("APP_ID");
		SECURITY_KEY = config.getProperty("SECURITY_KEY");
	}

	/**
	 * 翻译成中文.
	 * @param query 要翻译的原文
	 * @return 中文译文.
	 */
	public static String translateToChinese(String query)
	{
		TransApi api = new TransApi(APP_ID, SECURITY_KEY);
		String english = api.toChinese(query);
		// JSON解析成对象
		Result result = JSON.parseObject(english, Result.class);
		// 取出翻译结果
		ArrayList<TransResult> transResults = result.getTrans_result();
		StringBuilder sb = new StringBuilder();
		// 遍历输出译文
		for (TransResult transResult : transResults)
		{
			sb.append(transResult.getDst() + "\n");
		}
		return sb.toString();
	}
	/**
	 * 翻译成英文.
	 * @param query 要翻译的源字符串.
	 * @return 英文译文.
	 */
	public static String translateToEnglish(String query)
	{
		TransApi api = new TransApi(APP_ID, SECURITY_KEY);
		String english = api.toEnglish(query);
		// JSON解析成对象
		Result result = JSON.parseObject(english, Result.class);
		// 取出翻译结果
		ArrayList<TransResult> transResults = result.getTrans_result();
		StringBuilder sb = new StringBuilder();
		// 遍历输出译文
		for (TransResult transResult : transResults)
		{
			sb.append(transResult.getDst() + "\n");
		}
		return sb.toString();
	}
}
