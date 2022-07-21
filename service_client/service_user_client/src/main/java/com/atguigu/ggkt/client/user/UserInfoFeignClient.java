package com.atguigu.ggkt.client.user;

import com.atguigu.ggkt.model.user.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
@FeignClient(value = "service-user")
public interface UserInfoFeignClient {

    @GetMapping( "/admin/user/userInfo/inner/getById/{id}")
    public UserInfo getById(@PathVariable (value = "id") Long id);
}
