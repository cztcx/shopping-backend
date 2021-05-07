package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.model.img.ImgForm;
import com.chenzt.shoppingbackend.service.ImgService;
import com.chenzt.shoppingbackend.service.UploadPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IMGController extends AbstractController {
    @Autowired
    private UploadPicService uploadPicService;
    @Autowired
    private ImgService imgService;

    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public Map<String,Object> uploadOrder(MultipartFile file) {
        return uploadPicService.upload(file);
    }

    @RequestMapping(value = "goods/addImg", method = RequestMethod.POST)
    public void addImg(List<ImgForm> imgFormList) {
    }
    @RequestMapping(value = "goods/deleteImg/{filename}", method = RequestMethod.DELETE)
    public void addImg(@PathVariable String filename) {
        uploadPicService.delete(filename);

    }
}
