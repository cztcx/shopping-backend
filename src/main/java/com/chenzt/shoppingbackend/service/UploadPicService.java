package com.chenzt.shoppingbackend.service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UploadPicService {
    private static final String[] IMAGE_TYPE = new String[]{".bmp", ".jpg", ".jpeg", ".gif", ".png"};

    public static final String accessKeyId = "LTAI5tAmDT5T3XUCGv8b1ZtL";
    public static final String accessKeySecret = "RrE3o9G7wGt1WwMMlTNiEcTVDUKPHR";
    public static final String endpoint = "oss-cn-beijing.aliyuncs.com";
    public static final String bucketName = "czt-first-bucket";
    public static final String urlPrefix = "https://czt-first-bucket.oss-cn-beijing.aliyuncs.com";

    public Map<String,Object> upload(MultipartFile multipartFile) {
        try {
            InputStream inputStream = multipartFile.getInputStream();
            String filename = multipartFile.getOriginalFilename();
            filename = UUID.randomUUID().toString().replace("-", "") + filename;

            String localDateTime = LocalDateTime.now().toString();

            filename = localDateTime + "" + filename;
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
            ossClient.putObject(bucketName, filename, inputStream);

            ossClient.shutdown();

            // 上传后获取文件的路径
            // https://czt-first-bucket.oss-cn-beijing.aliyuncs.com/shopImg/songbing.jpg
            String url = "https://" + bucketName + "." + endpoint + "/" + filename;
            Map<String,Object> map = new HashMap<>();
            map.put("name",filename);
            map.put("url", url);
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void delete(String filename) {

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.deleteObject(bucketName, filename);

        ossClient.shutdown();
    }
}
