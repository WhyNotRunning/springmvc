package com.iwooto.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.iwooto.dao.SysResourceDao;
import com.iwooto.entity.SysResource;
import com.iwooto.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	SysResourceDao sysResourceDao;
	
	@Override
	public Set<String> findPermissions(Set<Long> resourceIds) {
        Set<String> permissions = new HashSet<String>();
        for(Long resourceId : resourceIds) {
            SysResource resource = findOne(resourceId);
            if(resource != null && !StringUtils.isEmpty(resource.getPermission())) {
                permissions.add(resource.getPermission());
            }
        }
        return permissions;
	}
	@Override
	public SysResource findOne(Long resourceId) {
		return sysResourceDao.selectByPrimaryKey(resourceId);
	}

}
