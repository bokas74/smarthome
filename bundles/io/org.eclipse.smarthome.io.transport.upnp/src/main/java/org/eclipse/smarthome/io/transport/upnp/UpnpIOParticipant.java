/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.transport.upnp;

/**
 * The {@link UpnpIOParticipant} is an interface that needs to
 * be implemented by classes that wants to participate in
 * UPNP communication
 *
 * @author Karel Goderis - Initial contribution
 */
public interface UpnpIOParticipant {

    /** Get the UDN of the participant **/
    public String getUDN();

    /** Called when the UPNP IO service receives a {variable,value} tuple for the given UPNP service **/
    public void onValueReceived(String variable, String value, String service);

    /**
     * Called when the UPNP IO service is unable to poll the UDN of the participant, given that
     * a addStatusListener is registered.
     * 
     * @param status - false, if the poll fails when the polling was previously successful; true if the poll succeeds
     *            when the polling was previously failing
     */
    public void onStatusChanged(boolean status);

}
