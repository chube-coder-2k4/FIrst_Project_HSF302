package fpt.java.demo_day1_hsf302.controller;

import fpt.java.demo_day1_hsf302.dto.request.UserRequestDTO;
import fpt.java.demo_day1_hsf302.dto.response.ResponseData;
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
    public ResponseData<Integer> addUser(@Validated @RequestBody UserRequestDTO user) {
        System.out.println("UserController addUser: " + user.getFirstName());
        return new ResponseData<>(HttpStatus.CREATED.value(), "User added successfully", 1);
    }

    @PutMapping("/{userid}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseData<?> updateUser(@PathVariable int userid, @RequestBody UserRequestDTO user) {
        System.out.println("UserController updateUser: " + userid);
        return new ResponseData<>(HttpStatus.ACCEPTED.value(), "User updated successfully");
    }

    @PatchMapping("/{userid}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseData<?> patchUser(@Min(1) @PathVariable int userid, @RequestParam boolean status) {
        System.out.println("UserController patchUser: " + userid);
        return new ResponseData<>(HttpStatus.ACCEPTED.value(), "UserController patched");
    }

    @DeleteMapping("/{userid}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseData<?> deleteUser(@PathVariable @Min(value = 1,message = "User must be > 0") int userid) {
        System.out.println("UserController deleteUser: " + userid);
        return new ResponseData<>(HttpStatus.NO_CONTENT.value(), "UserController deleted");
    }

    @GetMapping("/{userid}")
//    @ResponseStatus(HttpStatus.OK)
    public ResponseData<UserRequestDTO> getUser(@PathVariable @Min(value = 1,message = "User must be > 0") int userid) {
        System.out.println("UserController getUser: " + userid);
        return new ResponseData<>(HttpStatus.OK.value(), "User get successfully", new UserRequestDTO("Huy","Java","qhuy@gmail.com","0373777412"));
    }

    @GetMapping("/list")
//    @ResponseStatus(HttpStatus.OK)
    public ResponseData<List<UserRequestDTO>> getUsers(@RequestParam(defaultValue = "0", required = false) int pageNo,
                                                       @Min(10) @RequestParam(defaultValue = "20", required = false) int pageSize) {
        System.out.println("UserController getUsers");
        return new ResponseData<>(HttpStatus.OK.value(),"get list success",List.of(new UserRequestDTO("Huy","Java","qhuy@gmail.com","0373777412"),
                new UserRequestDTO("Nhi","Java","nhi@gmail.com","0935989931"),
                new UserRequestDTO("Hai","Python","hai@gmail.com","0218312842")));
    }




}
