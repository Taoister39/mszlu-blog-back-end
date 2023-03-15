package com.mszlu.blog.utils;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {
    private static Key jwtKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);// 设置加密算法

    public static String createToken(Long userId) {
        // jwt里的数据
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);

        JwtBuilder jwtBuilder = Jwts.builder()
                .signWith(jwtKey)
                .setClaims(claims).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000));// 过期时间

        String token = jwtBuilder.compact();
        return token;
    }

    public static Map<String, Object> parseToken(String token) {
        JwtParser parser = Jwts.parserBuilder().setSigningKey(jwtKey).build();

        Map claims = parser.parseClaimsJws(token).getBody();

        return claims;
    }
}
