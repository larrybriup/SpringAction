package com.briup.annotation.advise;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationHandler {

	// 在类中用注解的方式来定义切入点
	// 切入点的名字就是这个方法的名字
	// 这个方法本身并没什么用处,只是用来让我们写注解的
	@Pointcut(value = "execution(public * com.briup.annotation.service.*.*(..))")
	public void myPointCut() {
	}

	// 用注解定义一个advice.
	// 并指出这个advice在哪一个切入点上面起作用.
	// 这个方法的名字是随便起的,也可以不叫before.
	// 将来我们调用代理对象的方法的时候,最终会在切入点方法执行之前去调用这个before方法。
	// 我们还可以给这个before加一个参数,JoinPoint类型参数,
	// 这个参数就是连接点对象,因为spring中连接点指的就是方法,
	// 所以我们可以通过这个参数去获得将来调用的方法的信息,比如说方法的名字.
	@Before("myPointCut()")
	public void before(JoinPoint point) {
		System.out.println("before method " + point.getSignature().getName());
	}

	// 在切入点中的方法执行之后,会去调用这个@After注解所标注的方法
	// 不管方法是不是正常运行结束,都是去调用这个@After注解所标注的方法
	@After("myPointCut()")
	public void after(JoinPoint point) {
		System.out.println("after method " + point.getSignature().getName());
	}

	// 在切入点中的方法执行前和执行后都做一些事情的处理
	@Around("myPointCut()")
	public Object arround(ProceedingJoinPoint point) throws Throwable {
		// 切入点中的方法执行前
		System.out.println("around method " + point.getSignature().getName() + " start...");

		// 执行切入点中的方法
		Object obj = point.proceed();

		// 切入点中的方法执行后
		System.out.println("around method " + point.getSignature().getName() + " end!");
		return obj;
	}

	// 在切入点中的方法执行之后,会去调用这个@AfterReturning注解所标注的方法
	// 但是这个方法必须是正常结束的(代码运行完了或者是return返回了)
	@AfterReturning("myPointCut()")
	public void afterReturning() {
		System.out.println("afterReturning...");
	}

	// 在切入点中的方法执行期间抛出异常的时候,会调用这个@AfterThrowing注解所标注的方法
	@AfterThrowing("myPointCut()")
	public void throwException() {
		System.out.println("afterThrowing...");
	}

}
