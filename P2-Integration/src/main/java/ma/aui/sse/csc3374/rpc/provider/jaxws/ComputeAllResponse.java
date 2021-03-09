
package ma.aui.sse.csc3374.rpc.provider.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "computeAllResponse", namespace = "http://provider.rpc.csc3374.sse.aui.ma/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "computeAllResponse", namespace = "http://provider.rpc.csc3374.sse.aui.ma/")
public class ComputeAllResponse {

    @XmlElement(name = "return", namespace = "")
    private ma.aui.sse.csc3374.rpc.provider.Result _return;

    /**
     * 
     * @return
     *     returns Result
     */
    public ma.aui.sse.csc3374.rpc.provider.Result getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ma.aui.sse.csc3374.rpc.provider.Result _return) {
        this._return = _return;
    }

}
