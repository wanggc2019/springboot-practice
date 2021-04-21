package com.wgc.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * http://localhost:8080/hello
 * */
@SpringBootApplication
//@RestController
public class SpringbootPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPracticeApplication.class, args);
    }

    /**
     * 可以把controller放到这里（在SpringbootPracticeApplication上标注@RestController），也可以放到Controller目录（去掉刚才
     * 添加的@RestController，在com.wgc.springbootpractice下新建一个controller目录，在目录里新建一个TestController类，在类上
     * 添加@RestController注解
     * */
    /*
    @GetMapping("hello")
    public String hello(@RequestParam(value = "name",defaultValue = "world") String name) {
        return String.format("Hello %s!", name);
    }
    */

}

/**
 * 1、打成一个可执行的jar包
 * 需要spring-boot-maven-plugin插件
 * 点击右侧maven-->springbootpractice-->Lifecycle-->package 等待打包完毕
 * 完毕后jar包位置在target下名为springboot-practice-0.0.1-SNAPSHOT.jar
 *
 * 如何运行呢？
 * java -jar springboot-practice-0.0.1-SNAPSHOT.jar
 * 访问ip:8080/hello测试。
 *
 * 2、可以直接在测试的时候，配置传入命令行参数指定配置文件
 * java -jar spring-boot-02-config-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
 *
 * 3、项目打包好以后，我们可以使用命令行参数的形式，启动项目的时候来指定配置文件的新位置；
 * 指定配置文件和默认加载的这些配置文件共同起作用形成互补配置
 * java -jar spring-boot-02-config-02-0.0.1-SNAPSHOT.jar --spring.config.location=G:/application.properties
 *
 *
 * 4、外部配置文件加载顺序，优先级从高到低，覆盖，互补
 *      1）命令行参数
 *      先打包，然后再cmd上执行jar包。注：打包得时候，只能识别main下得东西，file:./config和file:./下得是识别不了的，所以执行
 *      默认的配置文件就是file:./config下的配置文件。
 *      java -jar springboot-practice-0.0.1-SNAPSHOT.jar （8083，http://localhost:8083/boot/hello）
 *      java -jar springboot-practice-0.0.1-SNAPSHOT.jar --server.port=8084 （8084，http://localhost:8084/boot/hello）
 *      java -jar springboot-practice-0.0.1-SNAPSHOT.jar --server.port=8085 server.servlet.context-path=/context
 *          （8085，http://localhost:8085/context/hello）
 *
 *      2）jar包外向jar包内，优先加载带profile的配置文件
 *      将jar包拷贝到桌面hello文件夹，在hello下创建一个properties文件，内容：
 *      server.port=8088
 *      server.servlet.context-path=/abc
 *      执行jar包，按照加载顺序会优先加载这个外部的properties文件。
 *      java -jar springboot-practice-0.0.1-SNAPSHOT.jar  （8088，http://localhost:8088/abc/hello）
 *
 *
 *
 *
 *
 *
 *
 * */
