/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yang.gen.v1.ne.l3vpn.api.rev20141225.nel3vpnapi.l3vpninstances.l3vpninstance;

import java.util.List;
import org.onosproject.yang.gen.v1.ne.l3vpn.api.rev20141225.nel3vpnapi.l3vpninstances.l3vpninstance.vpninstafs
            .VpnInstAf;

/**
 * Abstraction of an entity which represents the functionality of vpnInstAfs.
 */
public interface VpnInstAfs {

    /**
     * Returns the attribute vpnInstAf.
     *
     * @return list of vpnInstAf
     */
    List<VpnInstAf> vpnInstAf();

    /**
     * Builder for vpnInstAfs.
     */
    interface VpnInstAfsBuilder {

        /**
         * Returns the attribute vpnInstAf.
         *
         * @return list of vpnInstAf
         */
        List<VpnInstAf> vpnInstAf();

        /**
         * Returns the builder object of vpnInstAf.
         *
         * @param vpnInstAf list of vpnInstAf
         * @return builder object of vpnInstAf
         */
        VpnInstAfsBuilder vpnInstAf(List<VpnInstAf> vpnInstAf);

        /**
         * Builds object of vpnInstAfs.
         *
         * @return object of vpnInstAfs.
         */
        VpnInstAfs build();
    }
}