package com.app.myprotask.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;

@RestController
@RequestMapping(value = "api/user")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
        RequestMethod.DELETE })
public class UserController {

    @Autowired
    DAOService daoS;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;  // Inyectar BCryptPasswordEncoder

    @GetMapping(value = "/displayUserById")
    public User displayUserById(@RequestParam("idUser") Long idUser) {
        return daoS.displayUserById(idUser);
    }

    @GetMapping(value = "/searchUserByEmailPassword")
    public Long searchUserByEmailPassword(@RequestParam("email") String email,
                                          @RequestParam("password") String password) {
        return daoS.searchUserByEmailPassword(email, password);
    }

    @GetMapping(value = "/searchUserByDasPassword")
    public Long searchUserByDasPassword(@RequestParam("das") String das, @RequestParam("password") String password) {
        return daoS.searchUserByDasPassword(das, password);
    }

    @PostMapping(value = "/addUser")
    public void addUser(@RequestBody User userData) {
        List<Characteristic> userCharacteristics = new ArrayList<>();
        for (Characteristic c : userData.getUserCharacteristics()) {
            userCharacteristics.add(daoS.displayCharacteristicById(c.getIdCharacteristic()));
        }
        String encodedPassword = passwordEncoder.encode(userData.getPassword());  // Usar passwordEncoder
        daoS.addUser(new User(userData.getName(), userData.getLastName(), encodedPassword,
                daoS.getRoleByName("employee"), userCharacteristics));
    }

    @PutMapping(value = "/updateUserByIdUser/{idUser}")
    public void updateUserByIdUser(@PathVariable("idUser") Long idUser, @RequestBody User userData) {
        User user = daoS.displayUserById(idUser);
        user.setCv(userData.getCv());
        user.setProfilePic(userData.getProfilePic());
        user.setUserCharacteristics(userData.getUserCharacteristics());
        daoS.updateUser(user);
    }
}
