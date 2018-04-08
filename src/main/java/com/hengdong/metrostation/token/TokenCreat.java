package com.hengdong.metrostation.token;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Map;

/**
 * JWT生成Token/解密Token
 * Created by QZH on 2017/12/27.
 */
@Component
public class TokenCreat {

    //生成Token
    public static String creatToken(Map<String,Object> map){
        return Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS256,getKey()).compact();
    }
    //解析Token，同时也能验证Token，当验证失败返回null
    public static Map<String, Object> parserJavaWebToken(String jwt) {
            try {
            Map<String, Object> jwtClaims =
                    Jwts.parser().setSigningKey(getKey()).parseClaimsJws(jwt).getBody();
            return jwtClaims;
        } catch (Exception e) {
            return null;
        }
    }
    public static Key getKey(){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("bankgl");
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        return signingKey;
    }
    public static void main(String args[]){
        //生成Token
       /* Map<String,Object> map=new HashMap<String,Object>();
        Map<String,Object> map2=new HashMap<String,Object>();
        map2.put("userid",10001);
        map.put("payload",map2);
        String s=creatToken(map);
        System.out.println(s);*/
        //解析Token
        Map map=parserJavaWebToken("eyJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjp7InVzZXJpZCI6MTAwMDF9fQ.unlbLwgFcZet7AossqCwS8gnnDuyJ1RJNDQpzib4bec");
        System.out.println(map.toString());
    }

}
