package kofthe.etic.controller;

import kofthe.etic.business.abstracts.user.UserService;
import kofthe.etic.core.request.user.user.UpdateUserRequest;
import kofthe.etic.core.response.user.GetAllUserResponse;
import kofthe.etic.core.response.user.GetUserResponse;
import kofthe.etic.core.results.DataResult;
import kofthe.etic.core.results.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllUserResponse>> getAll(){
        return this.userService.getAll();
    }

    @GetMapping("/id/{id}")
    public DataResult<GetUserResponse> getById(@PathVariable int id) {
        return this.userService.getById(id);
    }

   public Result<UpdateUserRequest> update(UpdateUserRequest updateUserRequest, int id) {
        return this.userService.update(updateUserRequest, id);
   }

}
