package com.github.hpaluch.axisgeoip.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.hpaluch.axisgeoip.ws.GeoIPServiceStub;
import com.github.hpaluch.axisgeoip.ws.GeoIPServiceStub.GeoIP;
import com.github.hpaluch.axisgeoip.ws.GeoIPServiceStub.GetGeoIP;
import com.github.hpaluch.axisgeoip.ws.GeoIPServiceStub.GetGeoIPResponse;

/**
 * Test call of public SOAP WS to convert IP address to country name
 * See http://www.webservicex.net/WS/WSDetails.aspx?WSID=64&CATID=12 for WS description
 * @author John
 *
 */
public class TestGeoipWS {

	@Test
	public void test() throws Exception {
		
		GeoIPServiceStub client = new GeoIPServiceStub();
		
		GetGeoIP param = new GetGeoIP();
		param.setIPAddress("8.8.8.8");
		GetGeoIPResponse resp = client.getGeoIP(param);
		assertNotNull(resp);
		GeoIP ip = resp.getGetGeoIPResult();
		assertNotNull(ip);
		assertNotNull(ip.getCountryCode());
		assertEquals("USA",ip.getCountryCode());
		assertNotNull(ip.getCountryName());
		assertEquals("United States",ip.getCountryName());
		System.out.println("For IP "+param.getIPAddress()+ " got "+ip.getCountryCode()+" - "+ip.getCountryName());
	}

}
