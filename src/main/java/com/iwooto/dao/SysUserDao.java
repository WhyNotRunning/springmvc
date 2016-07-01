package com.iwooto.dao;

import com.iwooto.entity.SysUser;

public interface SysUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

	com.iwooto.entity.SysUser findByUsername(String username);
}