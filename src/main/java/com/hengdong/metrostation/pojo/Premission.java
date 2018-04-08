package com.hengdong.metrostation.pojo;

import java.math.BigInteger;


import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 权限表
 */
public class Premission implements java.io.Serializable {

	private static final long serialVersionUID = -2318961028853904403L;
	private Long id;
	
	/**
	 * 
	 */
	private String name;
	private String url;
	
	/**
	 * 排序
	 */
	private Integer rank;
	
	/**
	 * 父级ID
	 */
	private Long parent;
	
	public Premission(){
		
	}
	
	public Premission(Long id,String name,String url,Integer rank,Long parent){
		this.id=id;
		this.name=name;
		this.url=url;
		this.rank=rank;
		this.parent=parent;
	}
	
	public Premission(BigInteger id,String name,String url){
		this.id=id.longValue();
		this.name=name;
		this.url=url;
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@JsonIgnore
	public void setId(BigInteger id){
		this.id = id.longValue();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Long getParent() {
		return this.parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
	}

}