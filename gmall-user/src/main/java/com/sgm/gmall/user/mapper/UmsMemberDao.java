package com.sgm.gmall.user.mapper;

import com.sgm.gmall.user.model.UmsMember;

import java.util.List;

public interface UmsMemberDao {

    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    List<UmsMember> selectAllUmsMembers();
}