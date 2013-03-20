/**
 * 
 */
package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author tianyi
 * 2007-11-6
 * 上午12:13:40
 */
public class PanadaToClone implements Cloneable,Serializable{
	private int height;
	private int weight;
	private int age;
	private String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public PanadaToClone(){
		
	}
	public PanadaToClone(int height,int weight,int age){
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * deep clone method 
	 * @return
	 * @throws CloneNotSupportedException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws CloneNotSupportedException,IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		//此类实现了一个输出流，其中的数据被写入一个字节数组。缓冲区会随着数据的不断写入而自动增长
		ByteArrayOutputStream bo =new ByteArrayOutputStream();
		//创建写入指定 OutputStream 的 ObjectOutputStream
		ObjectOutputStream oo= new ObjectOutputStream(bo);
		oo.writeObject(this);
		ByteArrayInputStream bi= new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return(oi.readObject());
		//PanadaToClone temp=(PanadaToClone)super.clone();
		//return (Object)temp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PanadaToClone result=(PanadaToClone)super.clone();
		//result.name="change";
		return result;
	}
	
	
}
