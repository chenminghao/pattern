/**
 * 
 */
package chainofresponseibility;

/**
 * @author chenminghao
 * 2007-11-15
 * ����09:17:58
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
			//û���¼��ˣ�������Ҫ������
			System.out.println("The request is handled here");
			//�������˺���Ҫ�ڷ��أ��ڷ��ص�·��Ҳ����Ҫ�ѹ������ھ���
			
		}
		System.out.println("return  filter="+this.getName());
	}

}
