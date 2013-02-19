/*
 * Copyright (c) 2010, The OpenRTB Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimer.
 *
 *   2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *
 *   3. Neither the name of the OpenRTB nor the names of its contributors
 *      may be used to endorse or promote products derived from this
 *      software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.openrtb.dsp.core;

import java.util.List;

import org.mortbay.jetty.Connector;
import org.openrtb.common.api.Advertiser;
import org.openrtb.dsp.intf.model.SupplySidePlatform;
/**
 *
 */
public class DSPConfig {

	static String pathToConfigFile = ""; // TODO if no path is provided, initialize a default path name for config file
	List<SupplySidePlatform> sspList;
	
	
	/**
	 * 
	 */
	public DSPConfig(String pathToConfigFile) {
		// TODO Auto-generated constructor stub
		if (pathToConfigFile == null || pathToConfigFile == "") 
			throw new IllegalArgumentException("Illegal pathToConfigFile");
		readConfig(pathToConfigFile);
	}

	// Config file is a JSON encoded file
	void readConfig(String pathToConfigFile) {
		// TODO read config here
	}

	/**
	 * 
	 */
	public void LoadConfiguration() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return
	 */
	public java.util.List<Advertiser> getAdvertisers() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	public java.util.List<SupplySidePlatform> getExchanges() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	public Connector getServerPort() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
