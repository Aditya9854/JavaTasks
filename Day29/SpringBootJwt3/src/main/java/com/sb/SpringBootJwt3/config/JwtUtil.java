package com.sb.SpringBootJwt3.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
@Component
public class JwtUtil {

    private static final String SECRET = "3023805304232419591re3919t92f92fh92f22ea11";

    public String generateToken(String username,String role)
    {
        return Jwts.builder()
                .subject(username)
                .claim("role",role)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis()+ 3600000))
                .signWith(getSigningKey())
                .compact();
    }
    private SecretKey getSigningKey()
    {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET));
    }
    private Claims parseToken(String token)
    {
        return Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token).getPayload();
    }
    public String extractUsername(String token)
    {
        return parseToken(token).getSubject();
    }
    public String extractRole(String token)
    {
        return parseToken(token).get("role",String.class);
    }
    public boolean validateToken(String token)
    {
        try{
            Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token);
            return true;
        }
        catch (JwtException e)
        {
            return false;
        }
    }
}
