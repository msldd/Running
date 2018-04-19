package biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import biz.AdminBiz;
import dao.AdminDao;
import entity.Admin;
@Transactional
@Service
public class AdminBizImpl implements AdminBiz{
	@Resource
	private AdminDao adminDao;
	//ÓÃ»§µÇÂ¼
	@Override
	public Admin findoneadmin(String name, String pwd) {
		
		return adminDao.findoneadmin(name, pwd);
	}

}
