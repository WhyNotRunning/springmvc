package com.iwooto.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwooto.dao.SysUserDao;
import com.iwooto.entity.SysUser;
import com.iwooto.service.RoleService;
import com.iwooto.service.UserService;
@Service
public class UserServiceImpl implements UserService {


	@Autowired
	SysUserDao sysUserDao;
	@Autowired
	RoleService roleService;
	
	@Override
	public SysUser findByUsername(String username) {
		return sysUserDao.findByUsername(username);
	}

	@Override
	public Set<String> findRoles(String username) {
        SysUser user =findByUsername(username);
        if(user == null) {
            return Collections.EMPTY_SET;
        }
        String[] rids = user.getRoleIds().split(",");
        List<Long> rid = new ArrayList<Long>();
        for(String r:rids){
        	rid.add(Long.parseLong(r));
        }
        return roleService.findRoles(rid.toArray(new Long[0]));
	}

	@Override
	public Set<String> findPermissions(String username) {
		SysUser user =findByUsername(username);
        if(user == null) {
            return Collections.EMPTY_SET;
        }
        String[] rids = user.getRoleIds().split(",");
        List<Long> rid = new ArrayList<Long>();
        for(String r:rids){
        	rid.add(Long.parseLong(r));
        }
        return roleService.findPermissions(rid.toArray(new Long[0]));
	}

}
