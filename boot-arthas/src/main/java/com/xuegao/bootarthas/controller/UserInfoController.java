package com.xuegao.bootarthas.controller;

import com.xuegao.bootarthas.model.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserInfoController {

    @GetMapping("/userInfo/list")
    public List<UserInfo> list() {
        List<UserInfo> userInfoList = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(i);
            userInfo.setuName(String.valueOf(i));
            userInfo.setPsd(String.valueOf(i));
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }
}
