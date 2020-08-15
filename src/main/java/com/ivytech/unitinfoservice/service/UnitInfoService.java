package com.ivytech.unitinfoservice.service;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivytech.unitinfoservice.bean.FinalResponse;
import com.ivytech.unitinfoservice.commons.UnitInfoConstants;
import com.ivytech.unitinfoservice.dao.UnitInfoRepository;

/**
 * This class holds business logic for GETUNITINFO trigger
 * 
 * @author Rajkiran
 *
 */
@Service
public class UnitInfoService {
	
	@Autowired
	private UnitInfoRepository unitinforepository;
	private static final Logger LOGGER = LogManager.getFormatterLogger(UnitInfoService.class);
	
	/**
	 * This service gets unitInfo based on the Identification by calling GETUNITINFO
	 * PROC
	 * 
	 * @param unitIdentificationValue
	 * @param identificatorType
	 * 
	 * @return FinalResponse
	 */
	public FinalResponse getUnitInfo(String unitIdentificationValue, String identificatorType) {
		LOGGER.debug("Inside getUnitInfoService with params, unitIdentificationValue : " + unitIdentificationValue
				+ ", identificatorType : " + identificatorType);
		FinalResponse finalResponse = new FinalResponse();
		Map<String, String> unitsInfoMap = new HashMap<>();
		try {
			ResultSet unitInfoResultSet = unitinforepository.getUnitInfo(unitIdentificationValue,identificatorType);
			// Here we are iterating over a ResultSet object and putting into to a map
			while (unitInfoResultSet.next()) {
				unitsInfoMap.put(UnitInfoConstants.ITEM_BCN, unitInfoResultSet.getString(UnitInfoConstants.ITEM_BCN));
				unitsInfoMap.put(UnitInfoConstants.SERIAL_NO, unitInfoResultSet.getString(UnitInfoConstants.SERIAL_NO));
				unitsInfoMap.put(UnitInfoConstants.ITEM_ID, unitInfoResultSet.getString(UnitInfoConstants.ITEM_ID));
				unitsInfoMap.put(UnitInfoConstants.GEONAME, unitInfoResultSet.getString(UnitInfoConstants.GEONAME));
				unitsInfoMap.put(UnitInfoConstants.CLIENTNAME, unitInfoResultSet.getString(UnitInfoConstants.CLIENTNAME));
				unitsInfoMap.put(UnitInfoConstants.CONTRACTNAME, unitInfoResultSet.getString(UnitInfoConstants.CONTRACTNAME));
				unitsInfoMap.put(UnitInfoConstants.CLIENT_ID, unitInfoResultSet.getString(UnitInfoConstants.CLIENT_ID));
				unitsInfoMap.put(UnitInfoConstants.CONTRACT_ID, unitInfoResultSet.getString(UnitInfoConstants.CONTRACT_ID));
				unitsInfoMap.put(UnitInfoConstants.LOCATION_ID, unitInfoResultSet.getString(UnitInfoConstants.LOCATION_ID));
				unitsInfoMap.put(UnitInfoConstants.WORKCENTER, unitInfoResultSet.getString(UnitInfoConstants.WORKCENTER));
				unitsInfoMap.put(UnitInfoConstants.ROUTE, unitInfoResultSet.getString(UnitInfoConstants.ROUTE));
				unitsInfoMap.put(UnitInfoConstants.STATUS, unitInfoResultSet.getString(UnitInfoConstants.STATUS));
				unitsInfoMap.put(UnitInfoConstants.WORKCENTER_ID,unitInfoResultSet.getString(UnitInfoConstants.WORKCENTER_ID));
				unitsInfoMap.put(UnitInfoConstants.ROUTE_ID, unitInfoResultSet.getString(UnitInfoConstants.ROUTE_ID));
				unitsInfoMap.put(UnitInfoConstants.PART_NO, unitInfoResultSet.getString(UnitInfoConstants.PART_NO));
				unitsInfoMap.put(UnitInfoConstants.PART_ID, unitInfoResultSet.getString(UnitInfoConstants.PART_ID));
				unitsInfoMap.put(UnitInfoConstants.FAT, unitInfoResultSet.getString(UnitInfoConstants.FAT));
				unitsInfoMap.put(UnitInfoConstants.PART_DESC, unitInfoResultSet.getString(UnitInfoConstants.PART_DESC));
				unitsInfoMap.put(UnitInfoConstants.WAREHOUSE_NAME, unitInfoResultSet.getString(UnitInfoConstants.WAREHOUSE_NAME));
				unitsInfoMap.put(UnitInfoConstants.WAREHOUSE_ID, unitInfoResultSet.getString(UnitInfoConstants.WAREHOUSE_ID));
				unitsInfoMap.put(UnitInfoConstants.DESTINATIONWC, unitInfoResultSet.getString(UnitInfoConstants.DESTINATIONWC));
				unitsInfoMap.put(UnitInfoConstants.CURRLOCMATCHWO, unitInfoResultSet.getString(UnitInfoConstants.CURRLOCMATCHWO));
				unitsInfoMap.put(UnitInfoConstants.ONHOLD, unitInfoResultSet.getString(UnitInfoConstants.ONHOLD));
				unitsInfoMap.put(UnitInfoConstants.REVISION_LEVEL, unitInfoResultSet.getString(UnitInfoConstants.REVISION_LEVEL));
				unitsInfoMap.put(UnitInfoConstants.WORKORDER_ID, unitInfoResultSet.getString(UnitInfoConstants.WORKORDER_ID));
			}
			finalResponse.setData(unitsInfoMap);
			finalResponse.setStatus(Boolean.TRUE);
		} catch (Exception e) {
			LOGGER.error(UnitInfoConstants.GET_UNIT_INFO_SERVICE_ERROR_MSG + e.getMessage());
			finalResponse.setMessage(UnitInfoConstants.GET_UNIT_INFO_SERVICE_ERROR_MSG);
			finalResponse.setStatus(Boolean.FALSE);
		}
		LOGGER.debug("End of getUserInfo result= userInfo: " + finalResponse);
		return finalResponse;
	} // getUnitInfo


}
