package com.blyx.infrastructure.mapper;

import com.blyx.infrastructure.entity.AddressDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @description 权限配置类
 * @author: quyang5
 * @date: 2020/9/7 19:33
 */
@Repository
public interface AddressMapper {

    /**
     * 获取配置枚举
     *
     * */
    List<AddressDTO>  selectAddress();
}
