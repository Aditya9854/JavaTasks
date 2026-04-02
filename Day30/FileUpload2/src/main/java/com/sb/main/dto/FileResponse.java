package com.sb.main.dto;

public record FileResponse(String fileName,String contentType,long size,String message)
{
}
