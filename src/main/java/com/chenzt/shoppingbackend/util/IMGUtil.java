package com.chenzt.shoppingbackend.util;

import java.io.*;
/*
* 上传图片工具类
* */
public class IMGUtil {
    public static int saveToImgByte(byte[] imgByte, String imgPath, String imgName) {
        int stateInt = 1;
        InputStream in = null;
        FileOutputStream fos = null;

        try {
            in = new ByteArrayInputStream(imgByte);
            File mark = new File(imgPath);
            if (!mark.exists()) {
                mark.mkdirs();
            }

            File file = new File(imgPath, imgName);
            fos = new FileOutputStream(file);
            byte[] b = new byte[1024];
            boolean var9 = false;

            int nRead;
            while((nRead = in.read(b)) != -1) {
                fos.write(b, 0, nRead);
            }
        } catch (Exception var18) {
            stateInt = 0;
            var18.printStackTrace();
        } finally {
            try {
                fos.flush();
                fos.close();
                in.close();
            } catch (IOException var17) {
                var17.printStackTrace();
            }

        }

        return stateInt;
    }
}
