package com.csywz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.csywz.dao.PdbDao;
import com.csywz.vo.Pdb;
/**
 * 
 * pdb信息Dao接口方法实现
 * 
 * @author xulixin
 * @date 2017/11/13
 * 
 */
@Repository
public class PdbDapImpl implements PdbDao {
	@Resource
	private MongoTemplate mongoTemplate;
	
	/**获得全部pdb信息*/
	public Object queryAllPdb() {
		List<Pdb> pdbList = mongoTemplate.findAll(Pdb.class);
		return pdbList;
	}

}
