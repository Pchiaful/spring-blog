package com.codeup.springblog.controllers;

//import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    private final PostRepository postDao;
    public PostController(PostRepository postRepository) {
        this.postDao = postRepository;
    }

    @GetMapping("/posts")
    @ResponseBody
    public String showPosts(){
        System.out.println(postDao.findAll());
        return "post hopefully";
    }

    //seed posts in db
//    fetch all posts with postsSao
    //

//    @GetMapping("/posts")
//    @ResponseBody
//    public String posts() {
//        return "This will be the posts index page.";
//    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable long id) {
        return "Will view individual posts. This post is number " + id + ".";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "Create a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreation() {
        return "Created a post";
    }
}
