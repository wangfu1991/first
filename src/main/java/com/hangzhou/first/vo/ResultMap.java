package com.hangzhou.first.vo;

import java.util.HashMap;
import java.util.Objects;

/**
 * 返回结果对象
 * 
 * @author wangfan
 * @date 2017-6-10 上午10:10:07
 */
public class ResultMap extends HashMap<String, Object>{
	private static final long serialVersionUID = 1L;
	
	private ResultMap() { }

	/**
	 * 返回成功
	 */
	public static ResultMap ok() {
		return ok("操作成功！");
	}

	/**
	 * 返回成功
	 */
	public static ResultMap ok(String message) {
		return ok(200, message);
	}
	
	/**
	 * 返回成功
	 */
	public static ResultMap ok(int code,String message) {
		ResultMap resultMap = new ResultMap();
		resultMap.put("code", code);
		resultMap.put("msg", message);
		return resultMap;
	}
	
	/**
	 * 返回失败
	 */
	public static ResultMap error() {
		return error("操作失败！");
	}
	
	/**
	 * 返回失败
	 */
	public static ResultMap error(String messag) {
		return error(500, messag);
	}

	/**
	 * 返回失败
	 */
	public static ResultMap error(int code, String message) {
		return ok(code, message);
	}
	
	/**
	 * 设置code
	 */
	public ResultMap setCode(int code){
		super.put("code", code);
		return this;
	}
	
	/**
	 * 设置message
	 */
	public ResultMap setMessage(String message){
		super.put("msg", message);
		return this;
	}

	public boolean isOk() {
		return Objects.equals(this.get("code"), 200);
	}
	
	/**
	 * 放入object
	 */
	@Override
	public ResultMap put(String key, Object object){
		super.put(key, object);
		return this;
	}
}