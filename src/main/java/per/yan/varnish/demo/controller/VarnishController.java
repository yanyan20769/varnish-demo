package per.yan.varnish.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import per.yan.varnish.demo.model.User;

/**
 * @author yan.gao
 * @date 2019-08-27 10:06
 */
@Slf4j
@RestController
public class VarnishController {

    @GetMapping(value = "/test/varnish")
    public String varnish() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "\n" +
                "    <esi:include src=\"http://localhost:8081/user\"/>\n" +
                "    <ul>\n" +
                "        <li>$id</li>\n" +
                "        <li>$name</li>\n" +
                "    </ul>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("/healthcheck")
    public void healCheck() {

    }

    @GetMapping("/user")
    public User getUser() {
        return new User(1, "yan");
    }

}
