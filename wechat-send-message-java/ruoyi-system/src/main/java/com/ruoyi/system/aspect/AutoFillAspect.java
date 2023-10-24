package com.ruoyi.system.aspect;

import com.ruoyi.common.constant.AutoFillConstant;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.enums.OperationType;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.annotation.AutoFill;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

@Aspect
@Component
@Slf4j
public class AutoFillAspect {

    @Pointcut("execution(* com.ruoyi.system.mapper.*.*(..)) && @annotation(com.ruoyi.system.annotation.AutoFill)")
    public void autoFillPointCut() {

    }

    @Before("autoFillPointCut()")
    public void autoFill(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        AutoFill autoFill = signature.getMethod().getAnnotation(AutoFill.class);
        OperationType operationType = autoFill.value();

        Object[] args = joinPoint.getArgs();
        if (args == null || args.length == 0) {
            return;
        }

        Object arg = args[0];
        LocalDateTime time = LocalDateTime.now();
        String username = getLoginUser().getUsername();

        if (operationType == OperationType.INSERT) {

            try {
                Method setCreateTime = arg.getClass().getDeclaredMethod(AutoFillConstant.SET_CREATE_TIME, LocalDateTime.class);
                Method setCreateUser = arg.getClass().getDeclaredMethod(AutoFillConstant.SET_CREATE_BY, String.class);
                Method setUpdateTime = arg.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_TIME, LocalDateTime.class);
                Method setUpdateUser = arg.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_BY, String.class);

                setCreateTime.invoke(arg, time);
                setCreateUser.invoke(arg, username);
                setUpdateTime.invoke(arg, time);
                setUpdateUser.invoke(arg, username);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if (operationType == OperationType.UPDATE) {

            try {
                Method setUpdateTime = arg.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_TIME, LocalDateTime.class);
                Method setUpdateUser = arg.getClass().getDeclaredMethod(AutoFillConstant.SET_UPDATE_BY, String.class);
                setUpdateTime.invoke(arg, time);
                setUpdateUser.invoke(arg, username);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }


    /**
     * 获取用户缓存信息
     */
    public LoginUser getLoginUser()
    {
        return SecurityUtils.getLoginUser();
    }
}
