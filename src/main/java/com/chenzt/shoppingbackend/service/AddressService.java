package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.Address;
import com.chenzt.shoppingbackend.entity.AddressExample;
import com.chenzt.shoppingbackend.mapper.AddressMapper;
import com.chenzt.shoppingbackend.model.address.AddressForm;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressMapper addressMapper;

    public int create(AddressForm addressForm) {
        Address address = new Address();
        String id = UuidUtil.createUuid();
        address.setId(id);
        address.setAddress(addressForm.getAddress());
        address.setPhone(addressForm.getPhone());
        address.setUsername(addressForm.getUsername());
        address.setUserId(addressForm.getUserId());
        return addressMapper.insert(address);
    }

    public List<Address> getAll(String userId) {
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return addressMapper.selectByExample(addressExample);
    }

    public int update(AddressForm addressForm) {
        Address address = retrieve(addressForm.getId());
        address.setAddress(addressForm.getAddress());
        address.setUserId(addressForm.getUserId());
        address.setPhone(addressForm.getPhone());
        address.setUsername(addressForm.getUsername());
       return addressMapper.updateByPrimaryKey(address);
    }

    public Address retrieve(String addressId) {
        return addressMapper.selectByPrimaryKey(addressId);
    }

    public int delete(String addressId) {
        return addressMapper.deleteByPrimaryKey(addressId);
    }
}
