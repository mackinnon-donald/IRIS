package com.temenos.interaction.core.command;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;
import javax.ws.rs.core.Response.StatusType;

public final class NotSupportedCommand implements ResourceCommand {

	public final static String HTTP_STATUS_NOT_IMPLEMENTED_MSG = "Not Implemented";
	public final static StatusType HTTP_STATUS_NOT_IMPLEMENTED = new StatusType() {

		public int getStatusCode() {
			return 501;
		}

		public Family getFamily() {
			return Response.Status.Family.SERVER_ERROR;
		}

		public String getReasonPhrase() {
			return "Not Implemented";
		}
		
	};
	
}