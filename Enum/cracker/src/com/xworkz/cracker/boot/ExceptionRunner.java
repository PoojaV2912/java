package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.ExceptionCode;
import com.xworkz.cracker.dto.ExceptionCodeDTO;

public class ExceptionRunner {

	public static void main(String[] args) {
ExceptionCodeDTO codeDTO =new ExceptionCodeDTO(ExceptionCode.COMPILE_TIME, "public(Exception e)", "Moring");
System.out.println(codeDTO);
System.out.println(codeDTO.getExceptionCode().getMsg());
System.out.println(codeDTO.getExceptionCode().getCode());
	}

}
