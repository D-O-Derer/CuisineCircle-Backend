package com.ccb.service.impl;

import com.ccb.service.StorageService;
import com.ccb.service.StorageService;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
@Service
public class StorageServiceImpl implements StorageService {
    @Override
    public boolean save(MultipartFile file, String fileName, String filePath) {
        String path=filePath+fileName;
        File targetFile=new File(path);
        if(! targetFile.getParentFile().exists()){
            targetFile.getParentFile().mkdirs();

        }
        try {
            FileCopyUtils.copy(file.getBytes(),targetFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}