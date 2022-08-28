package com.jarvis.service.impl;

import com.jarvis.entity.Blog;
import com.jarvis.mapper.BlogMapper;
import com.jarvis.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Shaun
 * @since 2022-05-08
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
