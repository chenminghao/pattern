/**
 * 
 */
package prototype;

import java.util.Date;



/**
 * @author tianyi
 * 2007-11-8
 * ÏÂÎç08:58:21
 */
public class Monkey implements Cloneable{
	private int height;
	private int weight;
	private GoldRingsStaff staff;
	private Date birthDate;
	/**
	 * constructor method
	 *
	 */
	public Monkey(){
		this.birthDate =new Date();
		
	}
	/**
	 * clone method
	 */
	public Object clone(){
		Monkey monkey =null;
		try{
			monkey=(Monkey)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}finally{
			return monkey;
		}
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
	 * @return the staff
	 */
	public GoldRingsStaff getStaff() {
		return staff;
	}
	/**
	 * @param staff the staff to set
	 */
	public void setStaff(GoldRingsStaff staff) {
		this.staff = staff;
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
	
}
