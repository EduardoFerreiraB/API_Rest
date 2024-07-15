package com.challengeAPI.topics_api.controller;


import com.challengeAPI.topics_api.dto.TokenDTO;
import com.challengeAPI.topics_api.dto.UserDTO;
import com.challengeAPI.topics_api.entity.User;
import com.challengeAPI.topics_api.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid UserDTO userDTO){
        var authToken = new UsernamePasswordAuthenticationToken(userDTO.username(), userDTO.password());
        var authentication = authenticationManager.authenticate(authToken);
        var token = tokenService.generateToken((User) authentication.getPrincipal());

        return ResponseEntity.ok(new TokenDTO(token));
    }
}
