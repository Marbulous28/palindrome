import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
     staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/index", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/results.vtl");

      String result = request.queryParams("enteredWord");
      Palindrome newPalindrome = new Palindrome();
      Boolean answer = newPalindrome.isPalindrome(result);

      model.put("answer", answer);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


}
