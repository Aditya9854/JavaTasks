package com.sb.SpringBootJwt2.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtUtil {

    private static final String SECRET = "40122E3R345T366F31290884208WQ728Q937F3V209";

    public String generateToken(String username,String role)
    {
        Map<String,Object>claims = new HashMap<>();
        claims.put("role",role); //Adding role to the token
        return Jwts.builder()
                .claims(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+ 1000 * 60 * 60))
                .signWith(getSigningKey())
                .compact();
    }

    public boolean validateToken(String token)
    {
        try
        {
            Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token);
            return true;
        }
        catch(ExpiredJwtException e)
        {
            System.out.println("Token Expired : "+e.getMessage());
        }
        catch (MalformedJwtException | SignatureException e)
        {
            System.out.println("Invalid token Signature : "+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Token Error : "+e.getMessage());
        }
        return false;
    }

    public String extractUsername(String token)
    {
        return extractClaim(token, Claims::getSubject);
    }
    public String extractRole(String token)
    {
        Claims claims = extractAllClaims(token);
        return (String) claims.get("role");
    }
    private <T> T extractClaim(String token, Function<Claims,T> claimsResolver)
    {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    private Claims extractAllClaims(String token)
    {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
    private SecretKey getSigningKey()
    {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
