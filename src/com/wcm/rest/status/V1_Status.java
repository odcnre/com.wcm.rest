package com.wcm.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_Status {

	private static final String version = "00.00.01";

	@GET
	@Produces(value = MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<b> Hello</b>";
	}

	@Path("/version")
	@GET
	@Produces(value = MediaType.TEXT_HTML)
	public String returnVersion() {
		return "version = " + version;
	}

}
