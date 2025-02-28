package Plataforma_Educativa.service;

import Plataforma_Educativa.model.dto.RoleResponse;
import Plataforma_Educativa.model.entity.ERole;

public interface RoleService {
    RoleResponse getRoleByName(ERole name);
}
