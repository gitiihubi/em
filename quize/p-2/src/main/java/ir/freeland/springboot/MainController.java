package ir.freeland.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ir.freeland.springboot.model.Article;

@RestController
public class MainController {

    @GetMapping("/article")
    public String searchArticles(@RequestParam("name") final String name,
            @RequestParam("toDate") String toDate, @RequestParam("fromDate") String fromDate) {
        return "Searching Article " + name + " " + toDate + " " + fromDate;
    }

    @PostMapping(value = "/article/create", consumes = {"application/json", "text/plain"},
            produces = "text/plain")

    public String postController(@RequestBody Article article) {
        return article.toString();
    }

    @RequestMapping("/*")
    public String allFallback() {
        return "Bad api called";
    }

}
