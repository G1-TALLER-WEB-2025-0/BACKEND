package Plataforma_Educativa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Plataforma_Educativa.model.dto.LoginRequest;
import Plataforma_Educativa.model.dto.SignUpRequest;
import Plataforma_Educativa.model.dto.UsuarioInfoResponse;
import Plataforma_Educativa.security.JwtAuthenticationResponse;
import Plataforma_Educativa.service.AuthService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;


    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> authenticateUser(@RequestBody LoginRequest loginRequest) {
        JwtAuthenticationResponse jwtResponse = authService.authenticateUser(loginRequest);

        return new ResponseEntity<>(jwtResponse, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<UsuarioInfoResponse> registerUser(@RequestBody SignUpRequest signUpRequest) {
        UsuarioInfoResponse userInfoResponse = authService.registerUser(signUpRequest);

        return new ResponseEntity<>(userInfoResponse, HttpStatus.CREATED);
    }
}