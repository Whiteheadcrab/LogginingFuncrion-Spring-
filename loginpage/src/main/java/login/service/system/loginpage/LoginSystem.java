package login.service.system.loginpage;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("start")
public class LoginSystem {

    @RequestMapping("/")
    public void HomePage()
    {
        HomePageView view = new HomePageView();
        view.Answer();
    }
}
