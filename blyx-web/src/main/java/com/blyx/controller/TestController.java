package com.blyx.controller;

import com.alibaba.fastjson.JSON;
import com.blyx.common.utils.RedisUtil;
import com.blyx.infrastructure.entity.AddressDTO;
import com.blyx.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author quyang5
 * @description
 * @date 15:53 2020/12/24
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private AddressService addressService;


    @GetMapping("/getAddress")
    public String getAddress( String userCode){

        System.out.println("userCode="+userCode);



        List<AddressDTO> list=addressService.getAddressList();


        redisUtil.setEx("redis_address_test",JSON.toJSONString(list),10000);

        String str= redisUtil.get("redis_address_test");


        return str;
    }

}
