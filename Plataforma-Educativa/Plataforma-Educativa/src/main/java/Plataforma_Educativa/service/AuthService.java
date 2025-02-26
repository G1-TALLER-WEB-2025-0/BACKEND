package Plataforma_Educativa.service;

import Plataforma_Educativa.model.dto.LoginRequest;
import Plataforma_Educativa.model.dto.SignUpRequest;
import Plataforma_Educativa.model.dto.UsuarioInfoResponse;
import Plataforma_Educativa.security.JwtAuthenticationResponse;

public interface AuthService {

    UsuarioInfoResponse registerUser (SignUpRequest signUpRequest);

    JwtAuthenticationResponse authenticateUser (LoginRequest loginRequest);

}
