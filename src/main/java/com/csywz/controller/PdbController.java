package com.csywz.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csywz.service.PdbService;

@Controller
@RequestMapping("/pdb")
public class PdbController extends BaseController{
	
	private static final Logger L = Logger.getLogger(PdbController.class); 
	
	@Resource
	private PdbService pdbService;
	
	/**
	 * @describe 获取全部pdb信息
	 * 
	 * @param
	 * @author xulixin
	 * @date 2017/11/14
	 * 
	 * */
	@RequestMapping("queryAllPdb.action")
	@ResponseBody
	public Object queryAllPdb() {
		try {
			return super.success(pdbService.queryAllPdb());
		} catch (Exception e) {
			L.error("============" + e);
			e.printStackTrace();
		}
		return super.fail("查询错误！");
	}

}
