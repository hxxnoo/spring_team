package com.spring.team.dto;

public class Zipcode {

	/*
	 ZIPCODE        NOT NULL CHAR(7)      
	 SIDO                    VARCHAR2(20) 
	 GUGURN                  VARCHAR2(20) 
	 DONG                    VARCHAR2(10) 
	 BUNJI                   VARCHAR2(20) 
	 DETAIL_ADDRESS          VARCHAR2(20)
	 */
	private String zipcode;
	private String sido;
	private String gugurn;
	private String dong;
	private String bunji;
	private String detail_address;
	
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugurn() {
		return gugurn;
	}
	public void setGugurn(String gugurn) {
		this.gugurn = gugurn;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getBunji() {
		return bunji;
	}
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}
	public String getDetail_address() {
		return detail_address;
	}
	public void setDetail_address(String detail_address) {
		this.detail_address = detail_address;
	}
	
	@Override
	public String toString() {
		return "Zipcode [zipcode=" + zipcode + ", sido=" + sido + ", gugurn=" + gugurn + ", dong=" + dong + ", bunji="
				+ bunji + ", detail_address=" + detail_address + "]";
	}
}
