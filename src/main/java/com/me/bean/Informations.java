package com.me.bean;

import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.ExtractByUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

import java.util.*;

/**
 * 包含所有要收集的信息，通过注解模式收集（正则，xpath）
 */
//@HelpUrl("http://toutiao.hc360.com/")
//目标链接
@TargetUrl("http://toutiao.hc360.com/new/\\d+/*")
public class Informations {
    //文章标题
    @ExtractBy("//div[@class='left_2']/h2/text()")
    private String title;
    //作者
    @ExtractBy("//div[@class='left_2']/p/span[3]/text()")
    private String authorName;
    //链接
    @ExtractByUrl
    private String source;
    //时间
    @ExtractBy("//div[@class='left_2']/p/span[1]/text()")
    private String date;
    //文章内容
    @ExtractBy(value = "//div[@class='left_3']/*/text()")
    private String content;


    public Informations() {
    }

    public Informations(String title, String authorName, String source, String date, String content) {
        this.title = title;
        this.authorName = authorName;
        this.source = source;
        this.date = date;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Informations{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", source='" + source + '\'' +
                ", date='" + date + '\'' +
                ", content=" + content +
                '}';
    }
}
