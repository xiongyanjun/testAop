package test.aop.aspect;

import manager.RedisManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.aop.manage.DataManage;

import java.util.Arrays;

/**
 * @author : xiongyanjun  Date: 2020/8/10 ProjectName: settleprovisions Version: 1.0
 */
@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* test.aop.service.MyService.*())")
    public void pointCut(){}


//    @After("pointCut()")
//    public void testPointcut()
//    {
//        System.out.println("testPointcut");
//    }
//
//    @Before("execution(* test.aop.service.TestService.*(..))")
//    public void security(JoinPoint joinPoint)
//    {
//        System.out.println(joinPoint.getKind()+"."+joinPoint.getSignature().getName()+":("+ Arrays.toString(joinPoint.getArgs())+")");
//        System.out.println("权限");
//    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        DataManage dataManage = new DataManage();
        dataManage.getManage();
        Object object = null;
        try {
            object = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "异常";
        }finally {
            System.out.println("finally 关闭资源");
            dataManage.quitManage();
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
