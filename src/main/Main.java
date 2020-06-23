package main;
import tools.BaiduFanYi;

public class Main
{
	public static void main(String[] args)
	{
		// 需要翻译的文本
		String multiline = "高度600米\n真的吗\n是的";
		System.out.println(BaiduFanYi.translateToEnglish(multiline));

		// String chineseStr = "多行";
		// System.out.println(BaiduFanYi.translateToEnglish(chineseStr));

		// String englishStr ="translate";
		// System.out.println(BaiduFanYi.translateToChinese(englishStr));
	}
}
