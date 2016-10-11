package com.iwooto.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwooto.dao.UrlFilterDao;
import com.iwooto.entity.UrlFilter;
import com.iwooto.service.UrlFilterService;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-25
 * <p>Version: 1.0
 */
//@Service
public class UrlFilterServiceImpl implements UrlFilterService {

    @Autowired
    private UrlFilterDao urlFilterDao;

    @Autowired
    private ShiroFilerChainManager shiroFilerChainManager;

    @Override
    public UrlFilter createUrlFilter(UrlFilter urlFilter) {
        urlFilterDao.insert(urlFilter);
        initFilterChain();
        return urlFilter;
    }



    @Override
    public UrlFilter updateUrlFilter(UrlFilter urlFilter) {
        urlFilterDao.updateByPrimaryKey(urlFilter);
        initFilterChain();
        return urlFilter;
    }

    @Override
    public void deleteUrlFilter(Long urlFilterId) {
        urlFilterDao.deleteByPrimaryKey(urlFilterId);
        initFilterChain();
    }

    @Override
    public UrlFilter findOne(Long urlFilterId) {
        return urlFilterDao.selectByPrimaryKey(urlFilterId);
    }

    @Override
    public List<UrlFilter> findAll() {
        return urlFilterDao.findAll();
    }

    @PostConstruct
    public void initFilterChain() {
        shiroFilerChainManager.initFilterChains(findAll());
    }

}
