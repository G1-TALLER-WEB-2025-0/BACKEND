package Plataforma_Educativa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Plataforma_Educativa.model.entity.ERole;
import Plataforma_Educativa.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
