package com.iwooto.dao;

import java.util.List;

import com.iwooto.entity.SysResource;

public interface SysResourceDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);

	List<SysResource> findAll();
}