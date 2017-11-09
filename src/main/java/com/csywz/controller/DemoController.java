package com.csywz.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.csywz.dao.UserDao;


@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {
	private static final Logger L = Logger.getLogger(DemoController.class); 
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 通过主键查询
	 * @param id
	 * @return 
	 */
	@RequestMapping("/findById/{id}")
	@ResponseBody
	public Object findByid(@PathVariable("id") int id) {
		try {
			System.out.println(id);
			return super.success(userDao.findById(id));	
		} catch (Exception e) {
			L.error("============" + e);
			e.printStackTrace();
		}
		return super.fail("查询错误！");
		
	}
	/**
	 *添加 
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Object add() {
		try {
			userDao.add();
			return super.success("添加成功！");
		} catch (Exception e) {
			L.error("============" + e);
			e.printStackTrace();
		}
		return super.fail("添加失败！");	
	}
}
