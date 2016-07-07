package com.iwooto.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwooto.dao.SysRoleDao;
import com.iwooto.entity.SysRole;
import com.iwooto.service.RoleService;
import com.iwooto.service.ResourceService;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	SysRoleDao sysRoleDao;
	@Autowired
	ResourceService sysResourceService;

    @Override
    public Set<String> findRoles(Long... roleIds) {
        Set<String> roles = new HashSet<String>();
        for(Long roleId : roleIds) {
            SysRole role = findOne(roleId);
            if(role != null) {
                roles.add(role.getRole());
            }
        }
        return roles;
    }
    @Override
    public SysRole findOne(Long roleId) {
		return sysRoleDao.selectByPrimaryKey(roleId);
	}

	@Override
    public Set<String> findPermissions(Long[] roleIds) {
        Set<Long> resourceIds = new HashSet<Long>();
        for(Long roleId : roleIds) {
            SysRole role = findOne(roleId);
            if(role != null) {
                resourceIds.addAll(role.getResIds());
            }
        }
        return sysResourceService.findPermissions(resourceIds);
    }

}
