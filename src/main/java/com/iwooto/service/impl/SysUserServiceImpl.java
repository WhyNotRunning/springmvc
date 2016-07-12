package com.iwooto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwooto.dao.SysUserDao;
import com.iwooto.entity.SysUser;
import com.iwooto.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserDao sysuserdao;
	
	@Override
	public int deleteByPrimaryKey(Long id) {
		return sysuserdao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysUser selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysUser findByUsername(String username) {
		return sysuserdao.findByUsername(username);
	}

}
