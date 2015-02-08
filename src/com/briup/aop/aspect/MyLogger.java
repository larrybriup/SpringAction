package com.briup.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class MyLogger {
	public void log(String msg){
		System.out.println("log:"+msg);
	}
	
	/*//在类中用注解的方式来定义切入点
	//切入点的名字就是这个方法的名字
	//这个方法本身并没什么用处,只是用来让我们写注解的
	@Pointcut("execution(public * com.briup.spring.aop.service.*.*(..))")
	public void myPointCut(){}
	
	//用注解定义一个advice.
	//并指出这个advice在哪一个切入点上面起作用.
	//这个方法的名字是随便起的,也可以不叫before.
	//将来我们调用代理对象的方法的时候,最终会在切入点方法执行之前去调用这个before方法。
	//我们还可以给这个before加一个参数,JoinPoint类型参数,
	//这个参数就是连接点对象,因为spring中连接点指的就是方法,
	//所以我们可以通过这个参数去获得将来调用的方法的信息,比如说方法的名字.
	@Before("myPointCut()")
	public void beforeTest(JoinPoint jp){
		String method = jp.getSignature().getName();
		System.out.println(method+" before...");
	}
	
	//在切入点中的方法执行之后,会去调用这个@AfterReturning注解所标注的方法
	//但是这个方法必须是正常结束的(代码运行完了或者是return返回了)
	@AfterReturning("myPointCut()")
	public void afterReturningTest(){
		System.out.println("afterReturning...");
	}
	
	//在切入点中的方法执行之后,会去调用这个@After注解所标注的方法
	//不管方法是不是正常运行结束,都是去调用这个@After注解所标注的方法
	@After("myPointCut()")
	public void afterTest(){
		System.out.println("after...");
	}
	
	//在切入点中的方法执行前和执行后都做一些事情的处理
	@Around("myPointCut()")
	public void aroundTest(ProceedingJoinPoint pjp)throws Throwable{
		//切入点中的方法执行前
		System.out.println("start..");
		
		//执行切入点中的方法
		pjp.proceed();
		
		//切入点中的方法执行后
		System.out.println("end...");
	}
	
	//在切入点中的方法执行期间抛出异常的时候,会调用这个@AfterThrowing注解所标注的方法
	@AfterThrowing("myPointCut()")
	public void afterThrowingTest(){
		System.out.println("afterThrowing...");
	}
	*/
}
