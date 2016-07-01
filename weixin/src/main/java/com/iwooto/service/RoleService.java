package com.iwooto.service;

import java.util.Set;

import com.iwooto.entity.SysRole;

public interface RoleService {

	Set<String> findRoles(Long... roleIds);

	Set<String> findPermissions(Long[] array);

	SysRole findOne(Long roleId);

}
