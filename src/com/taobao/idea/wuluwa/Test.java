package com.taobao.idea.wuluwa;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Author: yunshu.xw
 */
public class Test {
    public static void main(String[] args) {
        String filePath = "D:\\workplace\\BR_zs_site_43_daily_yunshu_20131011\\zuanshi-site-web\\src\\main\\webapp\\build\\libs\\error.jsp";
        FilePathAnalysts filePathAnalysts = new FilePathAnalysts();
        System.out.println(filePathAnalysts.getDestFilePath(filePath, Constants.DEFAULT_SRC_PATH, Constants.DEFAULT_DEST_PATH));
    }
}
