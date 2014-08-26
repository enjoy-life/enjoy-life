package com.enjoylife.common.utils;

import com.enjoylife.common.model.Page;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-26
 * Time: PM6:45
 * To change this template use File | Settings | File Templates.
 */
public class PageUtils {

    public static Page convertToPage(int pageNo, int pageSize, List records) {
        if (CollectionUtils.isEmpty(records))
            return null;
        Page page = new Page();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRecords(records);
        return page;
    }

    public static boolean isValid(int pageNo, int pageSize) {
        if ( pageNo<0 || pageSize>100 ) {
            return false;
        } else {
            return true;
        }
    }

}
