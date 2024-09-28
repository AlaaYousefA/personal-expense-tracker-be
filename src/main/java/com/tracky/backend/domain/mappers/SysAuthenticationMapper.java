package com.tracky.backend.domain.mappers;

import com.tracky.backend.application.dtos.idm.login.SysAuthenticationRequest;
import com.tracky.backend.application.dtos.idm.login.SysAuthenticationResponse;
import com.tracky.backend.application.dtos.idm.signup.SignupRequest;
import com.tracky.backend.application.dtos.idm.signup.SignupResponse;
import com.tracky.backend.domain.model.SysUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SysAuthenticationMapper {
    SysUser signupRequestToModel(SignupRequest signupRequest);
    SignupResponse modelToSignupResponse(SysUser user);

    SysUser authenticationRequestToModel(SysAuthenticationRequest authenticationRequest);
    SysAuthenticationResponse modelToAuthenticationResponse(SysUser user);
}
