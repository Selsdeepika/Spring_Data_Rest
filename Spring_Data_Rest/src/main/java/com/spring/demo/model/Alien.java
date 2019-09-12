/**
 * 
 */
package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author lenovo
 *
 */
@Entity
public class Alien {
	
	@Id
	@GeneratedValue 
	public int aid;
	public String aname;
	public String tech;
	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * @return the aname
	 */
	public String getAname() {
		return aname;
	}
	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}
	/**
	 * @return the tech
	 */
	public String getTech() {
		return tech;
	}
	/**
	 * @param tech the tech to set
	 */
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", getAid()=" + getAid() + ", getAname()="
				+ getAname() + ", getTech()=" + getTech() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
