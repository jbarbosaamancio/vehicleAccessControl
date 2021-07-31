package br.jbit.vehicleAccessControlApp.Domain.Controllers;


import br.jbit.vehicleAccessControlApp.Domain.Entities.User;
import br.jbit.vehicleAccessControlApp.Domain.Enums.UserLevel;
import br.jbit.vehicleAccessControlApp.Domain.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private IUserRepository userRepository;

    @GetMapping({"/"})
    public ModelAndView login(){
       ModelAndView loginForm = new ModelAndView("/viewpages/login.html")
               .addObject("user", new User());
        return loginForm;
    }

    @PostMapping("/signin")
    public ModelAndView realizeLogin(User user){
        ExampleMatcher userMatcher = ExampleMatcher.matchingAll().withIgnorePaths("id").withIgnoreNullValues();

        Example<User> userExample = Example.of(user, userMatcher);

        User searchUser;
        searchUser = userRepository.findByUsername(user.getUsername());

        if(userRepository.exists(userExample)){

            if(searchUser.getUserLevel() == UserLevel.USER) {

                return new UserController().home();
            }

            else if(searchUser.getUserLevel() == UserLevel.ADMIN){
                return new AdminLevelController().home();
            }
        }
        System.out.println(searchUser.getUserLevel());

       return new ModelAndView("/infopages/help.html");
    }


}
