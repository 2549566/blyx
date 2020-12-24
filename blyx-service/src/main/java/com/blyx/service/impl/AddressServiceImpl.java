package com.blyx.service.impl;

import com.blyx.infrastructure.entity.AddressDTO;
import com.blyx.infrastructure.mapper.AddressMapper;
import com.blyx.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author quyang5
 * @description
 * @date 15:53 2020/12/24
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<AddressDTO> getAddressList() {
        return addressMapper.selectAddress();
    }
}
