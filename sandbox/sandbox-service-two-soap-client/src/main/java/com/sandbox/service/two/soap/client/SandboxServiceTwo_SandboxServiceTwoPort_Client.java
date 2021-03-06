
package com.sandbox.service.two.soap.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Sep 29 15:43:54 EDT 2011
 * Generated source version: 2.3.1
 * 
 */

public final class SandboxServiceTwo_SandboxServiceTwoPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.thesearchagency.com/SandboxServiceTwo/", "SandboxServiceTwo");

    private SandboxServiceTwo_SandboxServiceTwoPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SandboxServiceTwo_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SandboxServiceTwo_Service ss = new SandboxServiceTwo_Service(wsdlURL, SERVICE_NAME);
        SandboxServiceTwo port = ss.getSandboxServiceTwoPort();  
        
        {
        System.out.println("Invoking sandboxServiceTwoEcho...");
        port.sandboxServiceTwoEcho();


        }

        System.exit(0);
    }

}
