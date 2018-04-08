package com.hengdong.metrostation.security;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hengdong.metrostation.dto.CustomResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
	//private static final Gson gson=new GsonBuilder().disableHtmlEscaping().create();
    private static final long serialVersionUID = -8970718410437077606L;
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
//        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
        PrintWriter out = response.getWriter();
        response.setContentType("application/json; charset=utf-8");  
        CustomResponseBody resultVo = new CustomResponseBody("0","","权限验证失败");
        out.print(objectMapper.writeValueAsString(resultVo));
        out.flush();
        out.close();
    }
}
