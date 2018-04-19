package dao;

import org.apache.ibatis.annotations.Param;

import entity.Admin;

public interface AdminDao {
	//ÓÃ»§µÇÂ¼
	public Admin findoneadmin(@Param("name")String name,@Param("pwd")String pwd);
}
