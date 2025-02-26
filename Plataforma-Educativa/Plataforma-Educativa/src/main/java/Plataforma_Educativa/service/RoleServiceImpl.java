package Plataforma_Educativa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Plataforma_Educativa.exception.ResourceNotFoundException;
import Plataforma_Educativa.mapper.RoleMapper;
import Plataforma_Educativa.model.dto.RoleResponse;
import Plataforma_Educativa.model.entity.ERole;
import Plataforma_Educativa.model.entity.Role;
import Plataforma_Educativa.repository.RoleRepository;

@Service
public class RoleServiceImpl implements  RoleService{
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public RoleResponse getRoleByName(ERole name) {
        Role role = roleRepository.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Error: Role is not found."));
        return roleMapper.roleToRoleResponse(role);
    }
}
