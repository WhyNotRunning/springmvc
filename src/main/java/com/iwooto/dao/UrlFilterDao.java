package com.iwooto.dao;

import java.util.List;

import com.iwooto.entity.UrlFilter;

public interface UrlFilterDao {
    int deleteByPrimaryKey(Long id);

    int insert(UrlFilter record);

    int insertSelective(UrlFilter record);

    UrlFilter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UrlFilter record);

    int updateByPrimaryKey(UrlFilter record);
    
    public List<UrlFilter> findAll();
}