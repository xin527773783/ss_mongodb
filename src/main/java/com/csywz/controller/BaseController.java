package com.csywz.controller;

import com.csywz.util.ResultInfo;

public abstract class BaseController {
	
	/**
	 * 请求成功
	 * 
	 *@param data 请求成功返回的内容
	 *@return 
	 */
	public Object success(Object data) {
		ResultInfo<Object> resultInfo = new ResultInfo<Object>();
		resultInfo.setCode(200);
		resultInfo.setData(data);
		return resultInfo;
	}
	/**
	 * 请求失败
	 * 
	 *@param msg 失败信息
	 *@return 
	 */
	public Object fail(String msg) {
		ResultInfo<Object> resultInfo = new ResultInfo<Object>();
		resultInfo.setCode(500);
		resultInfo.setData(msg);
		return resultInfo;
	}
	
}
