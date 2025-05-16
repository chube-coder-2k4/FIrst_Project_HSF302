package fpt.java.demo_day1_hsf302.controller;

import fpt.java.demo_day1_hsf302.dto.request.UserRequestDTO;
import fpt.java.demo_day1_hsf302.dto.response.ResponseSuccess;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @PostMapping("/")
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseSuccess addUser(@Validated @RequestBody UserRequestDTO user) {
        System.out.println("UserController addUser: " + user.getFirstName());
        return new ResponseSuccess(HttpStatus.CREATED, "User added successfully", 1);
    }

    @PutMapping("/{userid}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseSuccess updateUser(@PathVariable int userid, @RequestBody UserRequestDTO user) {
        System.out.println("UserController updateUser: " + userid);
        return new ResponseSuccess(HttpStatus.ACCEPTED, "User updated successfully");
    }

    @PatchMapping("/{userid}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseSuccess patchUser(@Min(1) @PathVariable int userid, @RequestParam boolean status) {
        System.out.println("UserController patchUser: " + userid);
        return new ResponseSuccess(HttpStatus.ACCEPTED, "UserController patched");
    }

    @DeleteMapping("/{userid}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseSuccess deleteUser(@PathVariable @Min(value = 1,message = "User must be > 0") int userid) {
        System.out.println("UserController deleteUser: " + userid);
        return new ResponseSuccess(HttpStatus.NO_CONTENT, "UserController deleted");
    }

    @GetMapping("/{userid}")
//    @ResponseStatus(HttpStatus.OK)
    public ResponseSuccess getUser(@PathVariable @Min(value = 1,message = "User must be > 0") int userid) {
        System.out.println("UserController getUser: " + userid);
        return new ResponseSuccess(HttpStatus.OK, "User get successfully", new UserRequestDTO("Huy","Java","qhuy@gmail.com","0373777412"));
    }

    @GetMapping("/list")
//    @ResponseStatus(HttpStatus.OK)
    public ResponseSuccess getUsers(@RequestParam(defaultValue = "0", required = false) int pageNo,
                               @Min(10) @RequestParam(defaultValue = "20", required = false) int pageSize) {
        System.out.println("UserController getUsers");
        return new ResponseSuccess(HttpStatus.OK,"get list success",List.of(new UserRequestDTO("Huy","Java","qhuy@gmail.com","0373777412"),
                new UserRequestDTO("Nhi","Java","nhi@gmail.com","0935989931"),
                new UserRequestDTO("Hai","Python","hai@gmail.com","0218312842")));
    }



}
