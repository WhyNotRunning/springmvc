package com.iwooto.service;

import com.iwooto.entity.SysUser;

public interface SysUserService {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

	com.iwooto.entity.SysUser findByUsername(String username);
}