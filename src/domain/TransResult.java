package domain;
/**
 * 百度翻译返回的JSON字符串中的 trans_result对象数组 的 数组元素的数据结构
 */
public class TransResult
{
	private String src;
	private String dst;
	public String getSrc()
	{
		return src;
	}
	public void setSrc(String src)
	{
		this.src = src;
	}
	public String getDst()
	{
		return dst;
	}
	public void setDst(String dst)
	{
		this.dst = dst;
	}
	@Override
	public String toString()
	{
		return "TransResult [src=" + src + ", dst=" + dst + "]";
	}
}
