package com.sgm.gmall.user.service.Impl;

import com.sgm.gmall.user.model.UmsMember;
import com.sgm.gmall.user.model.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
