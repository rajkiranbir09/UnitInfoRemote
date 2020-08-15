package com.ivytech.unitinfoservice.entity;

import java.sql.ResultSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.ivytech.unitinfoservice.commons.UnitInfoConstants;



@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = UnitInfoConstants.UNITINFOPROC, procedureName = UnitInfoConstants.GETUNITINFO, parameters = {
			@StoredProcedureParameter(name=UnitInfoConstants.UNITIDENTIFICATORVALUE ,type = String.class, mode = ParameterMode.IN),
			@StoredProcedureParameter(name= UnitInfoConstants.IDENTIFICATORTYPE, type = String.class, mode = ParameterMode.IN),
			@StoredProcedureParameter(name=UnitInfoConstants.PCURSOR , type = ResultSet.class, mode = ParameterMode.REF_CURSOR) })})

/**
 * Entity class for UnitInfo
 * @author Rajkiran
 *
 */
public class UnitInfo {
	@Id
	@GeneratedValue(generator = UnitInfoConstants.INCREMENT)
	@Column(name = UnitInfoConstants.USERID)
	private int USERID;

}
