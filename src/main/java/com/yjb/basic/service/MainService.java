package com.yjb.basic.service;

import org.springframework.http.ResponseEntity;

import com.yjb.basic.dto.request.PostUserRequestDto;
import com.yjb.basic.dto.response.PostUserResponseDto;

public interface MainService {
    
    String getMethod();
    ResponseEntity<? super PostUserResponseDto> postUser(PostUserRequestDto dto);

}
