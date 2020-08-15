package com.ivytech.unitinfoservice.commons;

public interface UnitInfoConstants {

	//constants for UnitInfo entity class
	public static final String INCREMENT	 = "increment";
	public static final String USERID	     = "USERID";

	//GETUNITINFO procedure names
	public static final String UNITINFOPROC 					= "UnitInfo.GetUnitInfo";

	//GETUNITINFO database Stored Procedure name
	public static final String GETUNITINFO 						= "MICROSERVICES_DEV.QUERYADAPTER.GETUNITINFO";

	//GETUNITINFO  Stored procedure input fields
	public static final String UNITIDENTIFICATORVALUE 	= " UNITIDENTIFICATORVALUE";
	public static final String IDENTIFICATORTYPE		= "IDENTIFICATORTYPE";


	//GETUNITINFO StoredProc OUT fields 
	public static final String ITEM_BCN       = "ITEM_BCN";
	public static final String SERIAL_NO      = "SERIAL_NO"; 
	public static final String ITEM_ID        = "ITEM_ID";
	public static final String GEONAME        = "GEONAME";
	public static final String CLIENTNAME     = "CLIENTNAME";
	public static final String CONTRACTNAME   = "CONTRACTNAME";
	public static final String CLIENT_ID      = "CLIENT_ID"; 
	public static final String CONTRACT_ID    = "CONTRACT_ID"; 
	public static final String LOCATION_ID    = "LOCATION_ID";
	public static final String WORKCENTER     = "WORKCENTER";
	public static final String ROUTE          = "ROUTE";
	public static final String STATUS         = "STATUS";
	public static final String WORKCENTER_ID  = "WORKCENTER_ID"; 
	public static final String ROUTE_ID       = "ROUTE_ID";
	public static final String FAT            = "FAT";
	public static final String PART_DESC      = "PART_DESC";
	public static final String WAREHOUSE_ID   = "WAREHOUSE_ID"; 
	public static final String WAREHOUSE_NAME = "WAREHOUSE_NAME";
	public static final String DESTINATIONWC  = "DESTINATIONWC";
	public static final String WORKORDER_ID   = "WORKORDER_ID";
	public static final String ONHOLD         = "ONHOLD";
	public static final String REVISION_LEVEL = "REVISION_LEVEL"; 
	public static final String CURRLOCMATCHWO = "CURRLOCMATCHWO";
	public static final String PART_ID              = "PART_ID";
	public static final String PART_NO              = "PART_NO";
	public static final String PCURSOR 					= "P_CURSOR";

	//GETUNITINFO constant error messages
	public static final String GET_UNIT_INFO_SERVICE_ERROR_MSG = "ERROR : Failed to get the getUnitInfoService from stored proc : " ;

}
