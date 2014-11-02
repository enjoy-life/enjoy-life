package com.enjoylife.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-16
 * Time: PM8:49
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    // http://localhost:8080/enjoylife/demo/index
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(User user, @RequestParam(value = "name") String name){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("isOk", true);
        modelAndView.addObject("message", "hello "+ name);
        if (user!=null) {
            modelAndView.addObject("name", user.getName());
        } else {
            modelAndView.addObject("name", "user is null");
        }

        return modelAndView;
    }

    @RequestMapping(value = "/ajax/shop/{shopId}", method = RequestMethod.GET)
    public @ResponseBody Shop loadShop(@PathVariable("shopId") int shopId){

        Shop shop = new Shop();
        shop.setShopId(shopId);
        shop.setShopName("云中小雅");
        shop.setAddTime(new Date());

        return shop;
    }

    // Upload single file using Spring Controller
    @RequestMapping(value = "/addShopWithPic", method = RequestMethod.POST)
    public String addShopWithPic(@RequestParam(value = "shopname") String shopname,
                                 @RequestParam(value = "name") String name,
                                 @RequestParam(value = "file") MultipartFile file) throws IOException {

        return "index";
    }

    // Upload multiple file using Spring Controller
    @RequestMapping(value = "/addShopWithPics", method = RequestMethod.POST)
    public String addShopWithPics(@RequestParam(value = "shopname") String shopname,
                                  @RequestParam(value = "name") String[] names,
                                  @RequestParam(value = "file") MultipartFile[] files) throws IOException {

        return "index";
    }

    @RequestMapping(value = "/getpic", method = RequestMethod.GET )
    public void getpic(HttpServletResponse response) throws IOException {

        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = webApplicationContext.getServletContext();

        InputStream inputStream = servletContext.getResourceAsStream("/images/enjoy-life.jpeg");

        FileCopyUtils.copy(inputStream, response.getOutputStream());
        response.flushBuffer();
        inputStream.close();
    }

    @RequestMapping(value = "/reqandres", method = RequestMethod.GET )
    public String testReqAndRes(HttpServletRequest request,  HttpServletResponse response) {
        return "index";
    }

    @RequestMapping(value = "/chunked", method = RequestMethod.GET )
    public void testChunked(HttpServletResponse response) throws Exception {
        String firstPart = "<html>\n" +
                "    <head>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "        <script src=\"/js/lib/jquery-min.js\"></script>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "\n" +
                "        <h2>this part is rendered at first time</h2>\n" +
                "\n" +
                "        <div id=\"J_chunked\">\n" +
                "            <!-- <h2>this part is rendered secondary and is responded by chunked</h2> -->\n" +
                "        </div>";

        String secondPart = "<script type=\"text/javascript\">\n" +
                "            console.log(\"get chunked response\");\n" +
                "            $(\"#J_chunked\").html(\"<h2>this part is rendered secondary and is responded by chunked</h2>\");\n" +
                "        </script>";

        String theEnd = "</body>\n" +
                "</html>";

        //response.setHeader("Transfer-Encoding", "chunked");
        PrintWriter writer = response.getWriter();
        //ServletOutputStream writer = response.getOutputStream();
        writer.print(firstPart);
        response.flushBuffer();
        Thread.sleep(2000);
        writer.print(secondPart);
        response.flushBuffer();
        Thread.sleep(5000);
        writer.print(theEnd);
        response.flushBuffer();

    }

    @Autowired
    private UserTestDao userTestDao;

    @RequestMapping(value = "/dao/test", method = RequestMethod.GET )
    public @ResponseBody long daoTest() {
        long count = userTestDao.count();
        return count;
    }




}
