package com.example.demo.registration;

import lombok.AllArgsConstructor;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    //RequestBody主要是從前端接收後端的JSON資料
    private RegistrationService registrationService;
    public  String register(@RequestBody RegistrationRequest request){
        return  registrationService.register(request);
    }
}
