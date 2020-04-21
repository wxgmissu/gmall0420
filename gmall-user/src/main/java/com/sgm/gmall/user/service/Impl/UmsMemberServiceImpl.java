package com.sgm.gmall.user.service.Impl;


import com.sgm.gmall.user.mapper.UmsMemberDao;
import com.sgm.gmall.user.model.UmsMember;
import com.sgm.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: WXG
 * @CreateDate: 2020-04-21 21:19
 * @Note:
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberDao umsMemberDao;
    @Override
    public List<UmsMember> getAllUmsMembers() {
        return umsMemberDao.selectAllUmsMembers();
    }
}
