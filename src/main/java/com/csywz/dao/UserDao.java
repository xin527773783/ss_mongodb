package com.csywz.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.csywz.vo.User;

@Repository
public class UserDao {
	@Resource
	private MongoTemplate mongoTemplate;
	
	public Object findById(int id) {
		long begin = System.currentTimeMillis();
		List<User> list = mongoTemplate.find(new Query(Criteria.where("name").is("name5217")), User.class);
		long end = System.currentTimeMillis();
		System.out.println("查询用时：" + (end - begin) + "毫秒。");
		return list;
	}
	
	public boolean add() {
		User user = null;
		long begin = System.currentTimeMillis();
		System.out.println("===开始插入===");
		for (int i = 50; i < 1000000; i++) {
			//System.out.println("====" + i + "====");
			user = new User();
			user.setId(i);
			user.setName("name" + i);
			user.setPwd("pwd" + i );
			user.setBirthday(new Date());
			mongoTemplate.insert(user);
			if(i%1000 == 0) {
				System.out.println("第" + ((i / 1000) + 1) + "批插入成功，本批次共1000条数据。");
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("插入100W数据，累计用时：" + (end - begin) / 1000 + "秒。");
		return true;
	}
}
