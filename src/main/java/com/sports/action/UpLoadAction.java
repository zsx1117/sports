package com.sports.action;

import com.sports.utils.FileUploadingUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Gundam on 2017/3/27.
 */

@Controller
@RequestMapping("/files")
public class UpLoadAction {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upLoad(HttpServletRequest request){
        this.iniFileDir(request);
        try {
            MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
            Map<String,String> upLoadedFiles = FileUploadingUtil.upload(mRequest.getFileMap());

            for (Map.Entry<String, String> each : upLoadedFiles.entrySet()) {
                System.out.print("Upload File Name = " + each.getKey());
                System.out.println(", Saved Path in Server = " + each.getKey());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/files/";

    }

    private void iniFileDir(HttpServletRequest request){
        FileUploadingUtil.FILEDIR = request.getSession().getServletContext().getRealPath("/")+"files/";
    }

}
