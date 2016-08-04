package org.onosproject.netl3vpnweb.codec;

import static com.google.common.base.Preconditions.checkNotNull;

import org.onosproject.codec.CodecContext;
import org.onosproject.codec.JsonCodec;
import org.onosproject.yang.gen.v1.net.l3vpn.rev20160701.netl3vpn.acgroup.acs.Ac;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class AcCodec extends JsonCodec<Ac> {
    public static final String OBJECTNODE_NOT_NULL = "ObjectNode can not be null";
    public static final String CODECCONTEXT_NOT_NULL = "CodecContext can not be null";

    @Override
    public ObjectNode encode(Ac ac, CodecContext context) {
        checkNotNull(ac, "ac cannot be null");
        ObjectNode result = context.mapper().createObjectNode()
                .put("acId", ac.id());
        return result;
    }
}
