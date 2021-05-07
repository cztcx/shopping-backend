package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.Img;
import com.chenzt.shoppingbackend.mapper.ImgMapper;
import com.chenzt.shoppingbackend.model.img.ImgForm;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgService {
    @Autowired
    private ImgMapper imgMapper;

    public int addImg(ImgForm imgForm,String goodsId) {
        Img img = new Img();
        String id = UuidUtil.createUuid();
        img.setId(id);
        img.setUrl(imgForm.getUrl());
        img.setName(imgForm.getName());
        img.setGoodsId(goodsId);
        return imgMapper.insert(img);
    }
}
