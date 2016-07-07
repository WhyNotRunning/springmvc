//package com.iwooto.service.impl;
//
//import java.util.Collections;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.iwooto.dao.SysUserDao;
//import com.iwooto.entity.SysUser;
//import com.iwooto.service.RoleService;
//import com.iwooto.service.UserService;
//@Service
//public class UserServiceImpl implements UserService {
//
//
//	@Autowired
//	SysUserDao sysUserDao;
//	@Autowired
//	RoleService roleService;
//	
//	@Override
//	public SysUser findByUsername(String username) {
//		return sysUserDao.findByUsername(username);
//	}
//
//	@Override
//	public Set<String> findRoles(String username) {
//        SysUser user =findByUsername(username);
//        if(user == null) {
//            return Collections.EMPTY_SET;
//        }
//        return roleService.findRoles(user.getRoleIds().toArray(new Long[0]));
//	}
//
//	@Override
//	public Set<String> findPermissions(String username) {
//		SysUser user =findByUsername(username);
//        if(user == null) {
//            return Collections.EMPTY_SET;
//        }
//        return roleService.findPermissions(user.getRoleIds().toArray(new Long[0]));
//	}
//
//}
