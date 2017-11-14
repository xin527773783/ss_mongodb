package com.csywz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.csywz.dao.PdbDao;
import com.csywz.service.PdbService;
/**
 * 
 * pdb信息service接口方法实现
 * 
 * @author xulixin
 * @date 2017/11/13
 * 
 */
@Service
public class PdbServiceImple implements PdbService {
	@Resource
	private PdbDao pdbDao;
	/*查询所有pdb信息*/
	public Object queryAllPdb() {
		return pdbDao.queryAllPdb();
	}

}
