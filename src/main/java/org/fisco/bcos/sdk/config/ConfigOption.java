/*
 * Copyright 2014-2020  [fisco-dev]
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package org.fisco.bcos.sdk.config;

import java.util.List;
import java.util.Map;

/**
 * ConfigOption is the java object of the config file.
 *
 * @author Maggie
 */
public class ConfigOption {
    public Map<String, String> cryptoMateral;
    public List<String> peers;
    public List<AmopTopic> AMOPKeys;

    public List<String> getPeers() {
        return peers;
    }

    public void setPeers(List<String> peers) {
        this.peers = peers;
    }

    public List<AmopTopic> getAMOPKeys() {
        return AMOPKeys;
    }

    public void setAMOPKeys(List<AmopTopic> AMOPKeys) {
        this.AMOPKeys = AMOPKeys;
    }

    public Map<String, String> getCryptoMateral() {
        return cryptoMateral;
    }

    public void setCryptoMateral(Map<String, String> cryptoMateral) {
        this.cryptoMateral = cryptoMateral;
    }

    public String getAlgorithm() {
        return cryptoMateral.get("algorithm");
    }

    public String getCaCert() {
        return cryptoMateral.get("caCert");
    }

    public String getSslCert() {
        return cryptoMateral.get("sslCert");
    }

    public String getSslKey() {
        return cryptoMateral.get("sslKey");
    }

    public String getEnSslCert() {
        return cryptoMateral.get("enSSLCert");
    }

    public String getEnSslKey() {
        return cryptoMateral.get("enSSLKey");
    }
}