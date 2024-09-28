package com.tracky.backend.application.controllers;

import com.tracky.backend.application.dtos.idm.login.SysAuthenticationRequest;
import com.tracky.backend.application.dtos.idm.login.SysAuthenticationResponse;
import com.tracky.backend.application.dtos.idm.signup.SignupRequest;
import com.tracky.backend.application.dtos.idm.signup.SignupResponse;
import com.tracky.backend.domain.mappers.SysAuthenticationMapper;
import com.tracky.backend.domain.model.SysUser;
import com.tracky.backend.domain.services.IdmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/idm")
@RequiredArgsConstructor
public class IdmController {
    private final IdmService idmService;
    private final SysAuthenticationMapper authenticationMapper;

//    @PostMapping("/signup")
//    public ResponseEntity<SignupResponse> signup(@RequestBody SignupRequest signupRequest) {
//        SysUser user = authenticationMapper.signupRequestToModel(signupRequest);
//        SignupResponse response = authenticationMapper.modelToSignupResponse(idmService.signup(user));
//        return ResponseEntity.ok(response);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<SysAuthenticationResponse> login(@RequestBody SysAuthenticationRequest authenticationRequest) {
//        SysUser sysAuthentication = authenticationMapper.authenticationRequestToModel(authenticationRequest);
//        SysAuthenticationResponse response = authenticationMapper.modelToAuthenticationResponse(
//           idmService.login(sysAuthentication)
//        );
//        return ResponseEntity.ok(response);
//    }
}
