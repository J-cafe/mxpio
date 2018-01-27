package com.mxpio;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.mxpio.*.dao")
@SpringBootApplication
public class MxpIOApplication {
    public static void main(String[] args) {
        SpringApplication.run(MxpIOApplication.class, args);
        System.out.println("=======================mxpio.com========================");
        System.out.println("___  ___          _____ _____  ______ _     _____ _____ ");
        System.out.println("|  \\/  |         |_   _|  _  | | ___ \\ |   |  _  |  __ \\");
        System.out.println("| .  . |_  ___ __  | | | | | | | |_/ / |   | | | | |  \\/");
        System.out.println("| |\\/| \\ \\/ / '_ \\ | | | | | | | ___ \\ |   | | | | | __ ");
        System.out.println("| |  | |>  <| |_) || |_\\ \\_/ / | |_/ / |___\\ \\_/ / |_\\ \\");
        System.out.println("\\_|  |_/_/\\_\\ .__/\\___/ \\___/  \\____/\\_____/\\___/ \\____/");
        System.out.println("            | |                                         ");
        System.out.println("            |_|                                         ");
        System.out.println("===============MxpIO-BLOG========v:1.1==================");
    }
}
