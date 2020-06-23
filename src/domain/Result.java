package domain;

import java.util.ArrayList;
/**
 * 百度翻译响应的JSON字符串对应的数据结构
 */
public class Result
{
	private String from;
	private String to;
	private ArrayList<TransResult> trans_result;
	public String getFrom()
	{
		return from;
	}
	public void setFrom(String from)
	{
		this.from = from;
	}
	public String getTo()
	{
		return to;
	}
	public void setTo(String to)
	{
		this.to = to;
	}
	public ArrayList<TransResult> getTrans_result()
	{
		return trans_result;
	}
	public void setTrans_result(ArrayList<TransResult> trans_result)
	{
		this.trans_result = trans_result;
	}
	@Override
	public String toString()
	{
		return "Result [from=" + from + ", to=" + to + ", trans_result="
				+ trans_result + "]";
	}

}
