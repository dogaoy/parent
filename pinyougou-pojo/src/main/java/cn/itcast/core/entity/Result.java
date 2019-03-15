package cn.itcast.core.entity;

import java.io.Serializable;

/**
 * 
 * @ClassName: Result
 * @Company: http://www.itcast.cn/
 * @Description: 用来封装操作结果对象
 * @author 阮文 
 * @date 2018年9月17日 下午6:10:29
 */
public class Result implements Serializable{
	
	private boolean flag;	// 操作是否成功
	private String message; // 操作信息
	
	public Result(boolean flag, String message) {
		super();
		this.flag = flag;
		this.message = message;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
