package com.iwooto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwooto.dao.SysOrganizationDao;
import com.iwooto.entity.SysOrganization;
@Service
public class OrganizationService implements com.iwooto.service.OrganizationService {

    @Autowired
    private SysOrganizationDao organizationDao;
    
	@Override
	public SysOrganization findOne(Long organizationId) {
		return organizationDao.selectByPrimaryKey(organizationId);
	}

}
