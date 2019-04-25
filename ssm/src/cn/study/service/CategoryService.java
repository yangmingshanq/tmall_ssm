package cn.study.service;

import java.util.List;

import cn.study.pojo.Category;
import cn.study.util.Page;
 
public interface CategoryService {
 
    List<Category> list();
    int total();
    List<Category> list(Page page);
 
}