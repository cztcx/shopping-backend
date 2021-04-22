package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.*;
import com.chenzt.shoppingbackend.mapper.CategoryMapper;
import com.chenzt.shoppingbackend.mapper.ShopMapper;
import com.chenzt.shoppingbackend.mapper.UserMapper;
import com.chenzt.shoppingbackend.model.shops.ShopCondition;
import com.chenzt.shoppingbackend.model.shops.ShopModel;
import com.chenzt.shoppingbackend.model.shops.ShopsForm;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShopsService {

    @Autowired
    private ShopMapper shopMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    /*
     * 添加商铺
     * */
    public int create(ShopsForm form, String userId) {

        Shop shop = new Shop();
        BeanUtils.copyProperties(form, shop);
        shop.setUserId(userId);
       /* shop.setName(form.getName());
        shop.setAddress(form.getAddress());
        shop.setCategoryId(form.getCategoryId());
        shop.setDescribe(form.getDescribe());*/
        String id = UuidUtil.createUuid();
        shop.setId(id);
        String status = "0";
        shop.setStatus(status);
        String managerId = "1";

        return shopMapper.insert(shop);
    }

    /*
     * 查看店铺信息
     * */
    public ShopModel retrieve(String shopId) {
        ShopModel shopModel = new ShopModel();

        Shop shop = shopMapper.selectByPrimaryKey(shopId);
        shopModel.setShop(shop);

        User user = userMapper.selectByPrimaryKey(shop.getUserId());
        shopModel.setUser(user);

        Category category = categoryMapper.selectByPrimaryKey(shop.getCategoryId());
        shopModel.setCategory(category);

        return shopModel;
    }

    /*
     * 检索商铺
     * */
    public List<ShopModel> search(ShopCondition shopCondition) {
        ShopExample example = new ShopExample();
        ShopExample.Criteria criteria = example.createCriteria();
        if (shopCondition.getCategoryId() != null)
            criteria.andCategoryIdEqualTo(shopCondition.getCategoryId());
        if (shopCondition.getShopname() != null)
            criteria.andNameLike("%" + shopCondition.getShopname() + "%");

        return shopMapper.selectByExample(example).stream().map(shop -> retrieve(shop.getId())).collect(Collectors.toList());
    }
    /*
    * 修改店铺信息
    * */
    public int update(ShopsForm shopsForm, String userId){
        ShopExample example = new ShopExample();
        ShopExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Shop> list = shopMapper.selectByExample(example);
        String shopId = list.get(0).getId();
        Shop shop = new Shop();
        BeanUtils.copyProperties(shopsForm, shop);
        shop.setId(shopId);
        return shopMapper.updateByPrimaryKeySelective(shop);
    }
    /*
    * 删除店铺
    * */
    public int delete(String shopId){
        return shopMapper.deleteByPrimaryKey(shopId);
    }

}
