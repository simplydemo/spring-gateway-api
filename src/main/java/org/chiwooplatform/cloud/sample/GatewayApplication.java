package org.chiwooplatform.cloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@RefreshScope
@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run( GatewayApplication.class, args );
    }
}
