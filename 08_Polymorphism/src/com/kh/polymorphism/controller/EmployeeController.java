package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {

	
	
	// Employee 객체 배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmployeeByname(Employee[] ea, String name) {
		for(int i=0; i<ea.length; i++) {
			if(ea[i] != null && ea[i].getName().equals(name)) {
				return ea[i];
			}
		}
		return null;
		
		
//		for(Employee employee :ea) {
//			if(employee.getName(),equals(name)) {
//				return employee;
//			}
//		} return null;
		
	}
	
	//연봉 계산 : engineer인 경우 보너스가 있음

	public int getAnnualSalary(Employee e) {
		int annualSalary = e.getSalary()*12;
		// instanceof 연산자 : 현재 참조변수가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지
        //		             확인할 때 사용
		if(e instanceof Engineer) {
		  Engineer eg = (Engineer) e; // 부모 -> 자식 : 강제 형 변환!
		  return annualSalary += eg.getBonus();
			
		}else {
			return  annualSalary;
		}
		
	}
	
	//전체 연봉 총 합계
	public int getTotalCoast(Employee[]ea) {
		int sum = 0;
		for(int i=0; i<ea.length; i++) {
			
			sum += getAnnualSalary(ea[i]);
			
		}
//		 향상된 for 문 쓰면 ↓
//        for(Employee employee : ea) {
//        	sum += getAnnualSalary(employee);
//        }
		return sum;		
		
		
	}
}
