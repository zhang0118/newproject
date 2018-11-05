package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class AccountController {

    @RequestMapping("fileupload")
    public String fileupload(HttpServletRequest request, MultipartFile upload) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
            System.out.println("创建文件");
        }
        System.out.println("正常运行");
        String filename = upload.getOriginalFilename();
        String s = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        filename=s+filename;
        upload.transferTo(new File(file,filename));
        System.out.println("跳转页面");
        return "success";
    }
}
