package dao;

import org.apache.ibatis.annotations.Param;

import entity.Admin;

public interface AdminDao {
	//�û���¼
	public Admin findoneadmin(@Param("name")String name,@Param("pwd")String pwd);
}
