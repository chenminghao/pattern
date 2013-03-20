/**
 * 
 */
package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * @author tianyi
 * 2007-10-26
 * ÏÂÎç12:01:59
 */
public class VectorProxy implements InvocationHandler{
	private Object proxyObj;
	private VectorProxy(Object oibj)
	{
		this.proxyObj = oibj;
	}
	public static Object factory(Object obj)
	{
		Class cl = obj.getClass();
		return Proxy.newProxyInstance(cl.getClassLoader(), cl.getInterfaces(), new VectorProxy(obj));
	}
	

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before");
		if(args!=null)
		{
			for(int i = 0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}
		Object obj = method.invoke(proxyObj, args);
		System.out.println("after");
		return obj;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = null;
		list  = (List)VectorProxy.factory(new Vector(10));
		list.add("dd");
	}
}
