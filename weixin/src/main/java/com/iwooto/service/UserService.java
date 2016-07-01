package com.iwooto.service;

import java.util.Set;

import com.iwooto.entity.SysUser;

public interface UserService {

	SysUser findByUsername(String username);

	Set<String> findRoles(String username);

	Set<String> findPermissions(String username);

}
