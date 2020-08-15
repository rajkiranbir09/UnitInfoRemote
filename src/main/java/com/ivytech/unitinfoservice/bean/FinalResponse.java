package com.ivytech.unitinfoservice.bean;

import lombok.Data;

/**
 * Purpose of this class is to prepare the FinalResponse end point.
 * 
 * @author Rajkiran
 *
 */
@Data
public class FinalResponse {

	private Object data;
	private Boolean status;
	private String message;

	@Override
	public String toString() {
		return "FinalResponse [data=" + data + ", status=" + status + ", message=" + message + "]";
	}

}
