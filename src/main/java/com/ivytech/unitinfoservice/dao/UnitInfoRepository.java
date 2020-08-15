package com.ivytech.unitinfoservice.dao;

import java.sql.ResultSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ivytech.unitinfoservice.commons.UnitInfoConstants;
import com.ivytech.unitinfoservice.entity.UnitInfo;

/**
 * This class gets data from stored procedure 
 * 
 * @author Rajkiran
 *
 */

@Repository
public interface UnitInfoRepository extends JpaRepository<UnitInfo, Long> {


	/**
	 * Call the MICROSERVICES_DEV.QUERYADAPTER.GETUNITINFO stored procedure
	 *
	 * @param unitIdentificationValue
	 * @param identificatorType
	 *
	 * @return ResultSet stored PROC response
	 */
	@Procedure(name = UnitInfoConstants.UNITINFOPROC)
	ResultSet getUnitInfo(@Param(UnitInfoConstants.UNITIDENTIFICATORVALUE) String unitIdentificationValue,
			@Param(UnitInfoConstants.IDENTIFICATORTYPE) String identificatorType);

}
