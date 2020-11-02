package test.aop.aspect;

import manager.RedisManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author : xiongyanjun  Date: 2020/8/10 ProjectName: settleprovisions Version: 1.0
 */
@Aspect
@Component
public class TestAspect {
    @Pointcut("execution(* test.bean.Person.showPhone())")
    public void pointCut(){}

    @Autowired
    RedisManager redisManager;
//
//    @After("pointCut()")
//    public void testPointcut()
//    {
//        redisManager.deleteKey("123");
//    }
//
//    @Before("pointCut()")
//    public void security(JoinPoint joinPoint)
//    {
//        redisManager.lockRedis("123","123",123);
//    }



    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object object = null;
        redisManager.lockRedis("123","123",123);
        try {
            object = proceedingJoinPoint.proceed();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            redisManager.deleteKey("123");
        }
        return object;
    }

//    @AfterThrowing("execution(* test.aop.service.TestService.*(int)))")
//    public void afterThrowing()
//    {
//        System.out.println("exception");
//    }
//
//    @AfterReturning("execution(* test.aop.service.TestService.*(int)))")
//    public void afterReturning()
//    {
//        System.out.println("return");
//    }
}
