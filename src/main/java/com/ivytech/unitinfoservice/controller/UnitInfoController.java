package com.ivytech.unitinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivytech.unitinfoservice.bean.FinalResponse;
import com.ivytech.unitinfoservice.service.UnitInfoService;


/**
 * Controller class for getUnitinfo trigger
 *  
 * @author Rajkiran
 *
 */
@RestController
public class UnitInfoController {

	@Autowired
	private UnitInfoService unitinfoservice;

	/**
	 * Get the UnitInfo based on Identification by calling the GETUNITINFO stored PROC 
	 * 
	 * @param unitIdentificationValue
	 * @param identificatorType
	 * 
	 * 
	 * @return FinalResponse
	 */
	@GetMapping("/getUnitInfo")
	public  FinalResponse getUnitInfo(String unitIdentificationValue, String identificatorType) {
		return unitinfoservice.getUnitInfo(unitIdentificationValue,identificatorType);
	}
	
	/**
	 * 1. Prepare request parameter for updateFailureAnalysis SL API using JAXB
	 * 2. Get the http response
	 * 3. Insert data into updateFailureAnalysis SL API
	 * 
	 * @param faInfo
	 * 
	 * @return PerformFAResponse
	 */
	@PostMapping("/performFA")
	public FinalResponse performFA(@RequestBody FAInfo faInfo) {
		return failureAnalysisService.performFA(faInfo);
	}

	@GetMapping("/getAllInfo")
	public FinalResponse getAllInfo(String unitIdentificationValue, String identificatorType) {
		return unitinfoservice.getUnitInfo(unitIdentificationValue,identificatorType);
	}

	public String getAllInfoAbout(String Value) {
		return "Hello"+Value;
	}
}
