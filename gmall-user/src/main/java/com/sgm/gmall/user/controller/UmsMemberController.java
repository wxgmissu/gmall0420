package com.sgm.gmall.user.controller;

import com.sgm.gmall.user.model.UmsMember;
import com.sgm.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: WXG
 * @CreateDate: 2020-04-21 21:16
 * @Note:
 */
@RestController
public class UmsMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @GetMapping("getAll")
    public List<UmsMember> getAllUmsMembers(){
        return umsMemberService.getAllUmsMembers();
    }

}
