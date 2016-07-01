package com.iwooto.service;

import java.util.Set;

import com.iwooto.entity.SysResource;

public interface ResourceService {

	Set<String> findPermissions(Set<Long> resourceIds);

	SysResource findOne(Long resourceId);

}
