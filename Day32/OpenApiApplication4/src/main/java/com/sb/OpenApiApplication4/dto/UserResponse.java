package com.sb.OpenApiApplication4.dto;

public class UserResponse {

    private Long id;
    private String name;
    private String info;

    public UserResponse(Long id,String name,String info)
    {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Long getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getStatus()
    {
        return info;
    }
}
