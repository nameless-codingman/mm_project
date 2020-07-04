package com.itheima.mm.controller;


import com.itheima.mm.entity.Result;

import com.itheima.mm.utils.UploadUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RestController
public class CommendController {
    @RequestMapping("/commend/upload")
    public Result commendUpload(MultipartFile icon, HttpServletRequest request) throws Exception {
        try {
                    String uploadPath = request.getServletContext().getRealPath("/upload");

                    File file = new File(uploadPath);
                    //该文件夹不存在
                    if (!file.exists()) {
                        //创建文件夹
                        file.mkdirs();
                    }

                    //4. 往文件夹中写文件,使用IO流
            String uuidName = UploadUtils.getUUIDName(icon.getOriginalFilename());
            icon.transferTo(new File(file,uuidName));
                    //文件已经存入到文件夹中
                    //5. 获取文件存储路径
                 String   storePath = "/upload/"+uuidName;
          return new Result(true,storePath,"图片上传成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"图片上传失败");
        }
    }
}
