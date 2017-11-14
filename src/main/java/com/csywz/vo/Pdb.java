package com.csywz.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pdb")
public class Pdb {
	@Id
	private String id;
	private String pdbid;
	private String pdbname;
	private String pdbcontent;
	/*
	 * 构造方法*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPdbid() {
		return pdbid;
	}
	public void setPdbid(String pdbid) {
		this.pdbid = pdbid;
	}
	public String getPdbname() {
		return pdbname;
	}
	public void setPdbname(String pdbname) {
		this.pdbname = pdbname;
	}
	public String getPdbcontent() {
		return pdbcontent;
	}
	public void setPdbcontent(String pdbcontent) {
		this.pdbcontent = pdbcontent;
	}
	
	
	public Pdb() {
		super();
	}
	public Pdb(String id, String pdbid, String pdbname, String pdbcontent) {
		super();
		this.id = id;
		this.pdbid = pdbid;
		this.pdbname = pdbname;
		this.pdbcontent = pdbcontent;
	}
	@Override
	public String toString() {
		return "Pdb [id=" + id + ", pdbid=" + pdbid + ", pdbname=" + pdbname + ", pdbcontent=" + pdbcontent + "]";
	}
	
	
}
