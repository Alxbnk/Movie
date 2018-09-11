import org.springframework.web.bind.annotation.GetMapping;

public class MovieController {

    @GetMapping("/")
    public String Index(){
        return "Index";
    }

    @GetMapping("/Hello")
    public String Hello(){
        return "Hello";
    }

    @GetMapping("/Alex")
    public String Alex(){
        return "Alex";
    }

    @GetMapping("/Hello2")
    public String Hello2(){
        return "Hello2";
    }
}
