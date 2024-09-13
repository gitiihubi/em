package ir.freeland.springboot;

import ir.freeland.springboot.model.Article;


public class MainController {

    public String searchArticles(String name, String toDate, String fromDate) {
        return "Searching Article ";
    }


    public void postController(Article article) {
        System.out.println( article.toString() );
        
    }
    
    public String allFallback() {
        return "Bad api called";
    }

}