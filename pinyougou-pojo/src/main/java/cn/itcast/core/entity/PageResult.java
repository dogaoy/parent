package cn.itcast.core.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @ClassName: PageResult
 * @Company: http://www.itcast.cn/
 * @Description: 封装分页需要的数据对象
 * @author 阮文 
 * @date 2018年9月17日 下午5:16:07
 */
public class PageResult implements Serializable {
	
	private long total;		// 总条数
	private List rows;			// 结果集
	
	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
	
	
	
}
