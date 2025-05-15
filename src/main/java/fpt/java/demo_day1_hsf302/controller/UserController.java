package fpt.java.demo_day1_hsf302.controller;

import fpt.java.demo_day1_hsf302.dto.request.UserRequestDTO;
import jakarta.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    @PostMapping("/")
    public String addUser(@Validated @RequestBody UserRequestDTO user) {
        System.out.println("UserController addUser: " + user.getFirstName());
        return "UserController added";
    }

    @PutMapping("/{userid}")
    public String updateUser(@PathVariable int userid, @RequestBody UserRequestDTO user) {
        System.out.println("UserController updateUser: " + userid);
        return "UserController updated";
    }

    @PatchMapping("/{userid}")
    public String patchUser(@Min(1) @PathVariable int userid, @RequestParam boolean status) {
        System.out.println("UserController patchUser: " + userid);
        return "UserController patched";
    }

    @DeleteMapping("/{userid}")
    public String deleteUser(@PathVariable @Min(value = 1,message = "User must be > 0") int userid) {
        System.out.println("UserController deleteUser: " + userid);
        return "UserController deleted";
    }

    @GetMapping("/{userid}")
    public UserRequestDTO getUser(@PathVariable @Min(value = 1,message = "User must be > 0") int userid) {
        System.out.println("UserController getUser: " + userid);
        return new UserRequestDTO("Huy","Java","qhuy@gmail.com","0373777412");
    }

    @GetMapping("/list")
    public List<UserRequestDTO> getUsers(@RequestParam(defaultValue = "0", required = false) int pageNo,
                               @Min(10) @RequestParam(defaultValue = "20", required = false) int pageSize) {
        System.out.println("UserController getUsers");
        return List.of(new UserRequestDTO("Huy","Java","qhuy@gmail.com","0373777412"),
                new UserRequestDTO("Nhi","Java","nhi@gmail.com","0935989931"),
                new UserRequestDTO("Hai","Python","hai@gmail.com","0218312842"));
    }



}
