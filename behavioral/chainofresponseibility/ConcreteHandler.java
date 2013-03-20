/**
 * 
 */
package chainofresponseibility;

/**
 * @author chenminghao
 * 2007-11-15
 * 下午09:17:58
 */
public class ConcreteHandler extends Handler{

	//@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if(getHandler()!=null)
		{
			System.out.println("The request is passed to "+this.getName());
			getHandler().handleRequest();
			
			
		}else
		{
			//没有下家了，所以需要处理了
			System.out.println("The request is handled here");
			//处理完了后，需要在返回，在返回的路上也是需要把过滤器在经过
			
		}
		System.out.println("return  filter="+this.getName());
	}

}
