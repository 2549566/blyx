package com.blyx.web.controller.login;

import com.blyx.common.base.BlyxResult;
import com.blyx.common.utils.ParamCheckUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author quyang5
 * @description
 * @date 15:53 2021/1/7
 */
@RestController
@RequestMapping("/login")
public class LoginController {



    @PostMapping("/getCheckCode")
    public BlyxResult<Boolean> getCheckCode(HttpServletRequest request,String mobile){
        //校验手机号
        ParamCheckUtil.checkMobileNumber(mobile);

        //校验IP，防止网络攻击 todo

        return BlyxResult.setSuccessData(true);
    }
}
