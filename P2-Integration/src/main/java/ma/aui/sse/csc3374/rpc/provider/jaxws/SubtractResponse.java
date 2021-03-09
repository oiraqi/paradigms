
package ma.aui.sse.csc3374.rpc.provider.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "subtractResponse", namespace = "http://provider.rpc.csc3374.sse.aui.ma/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtractResponse", namespace = "http://provider.rpc.csc3374.sse.aui.ma/")
public class SubtractResponse {

    @XmlElement(name = "return", namespace = "")
    private double _return;

    /**
     * 
     * @return
     *     returns double
     */
    public double getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(double _return) {
        this._return = _return;
    }

}
