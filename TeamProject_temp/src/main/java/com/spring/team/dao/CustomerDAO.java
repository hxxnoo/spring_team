package com.spring.team.dao;

import java.util.Map;

import com.spring.team.dto.CustomerDTO;
import com.spring.team.dto.Zipcode;

public interface CustomerDAO {

		//중복확인 처리
		public int idCheck(String strId);
		// 회원가입처리
		public int insertCustomer(CustomerDTO dto);
		// 로그인 처리
		public int idPasswordChk(Map<String,String> map);
		// 회원 정보 인증 및 탈퇴
		public int deleteCustomerDetail(String strId);
		// 회원 인증 및 상세 페이지
		public CustomerDTO getCustomerDetail(String strId);
		// 회원 정보 수정
		public int updateCustomerDetail(CustomerDTO dto);
		// 이메일인증
		public String emailCheck(String code);
		// 우편번호 입력
		public int zipcodeInsert(Zipcode dto);
		// 우편 번호 검색 ( zipcode에 등록되어 있는지 확인 )
		public int zipcodechk(String zipcode);
		
		// 시큐리티 아이디 검색
		public CustomerDTO selectCustomerId(String id);
		
		// 인증 메일 발송
		public void sendEmail(String email, String key);
		// 인증 메일 - 인증키 검증
		public int selectKey(String key);
		// 이메일 인증- 등급 업그레이드
		public int updateGrade(String key);
		

}
