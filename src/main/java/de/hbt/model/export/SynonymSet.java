//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.30 at 05:38:39 PM CEST 
//


package de.hbt.model.export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynonymSet", propOrder = {
        "hauptbegriff",
        "oberbegriff"
})
public class SynonymSet {

    @XmlElement(required = true)
    protected Synonym hauptbegriff;
    @XmlElement(required = true)
    protected SynonymSet oberbegriff;

    public Synonym getHauptbegriff() {
        return hauptbegriff;
    }

    public void setHauptbegriff(Synonym hauptbegriff) {
        this.hauptbegriff = hauptbegriff;
    }

    public SynonymSet getOberbegriff() {
        return oberbegriff;
    }

    public void setOberbegriff(SynonymSet oberbegriff) {
        this.oberbegriff = oberbegriff;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hauptbegriff == null) ? 0 : hauptbegriff.hashCode());
        result = prime * result + ((oberbegriff == null) ? 0 : oberbegriff.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SynonymSet other = (SynonymSet) obj;
        if (hauptbegriff == null) {
            if (other.hauptbegriff != null)
                return false;
        } else if (!hauptbegriff.equals(other.hauptbegriff))
            return false;
        if (oberbegriff == null) {
            if (other.oberbegriff != null)
                return false;
        } else if (!oberbegriff.equals(other.oberbegriff))
            return false;
        return true;
    }

}
