package com.sb.SpringBootCaching1;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    @Cacheable(value = "square")
    public int computerSquare(int number)
    {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return number*number;
    }
}
