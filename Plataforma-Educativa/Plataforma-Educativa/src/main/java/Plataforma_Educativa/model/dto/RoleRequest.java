package Plataforma_Educativa.model.dto;

import Plataforma_Educativa.model.entity.ERole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoleRequest {
    private ERole name;

}
