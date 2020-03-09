/*
 * XML Type:  BesCbsOwnershipInfoType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2;


/**
 * An XML BesCbsOwnershipInfoType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public interface BesCbsOwnershipInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BesCbsOwnershipInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("bescbsownershipinfotypee21btype");
    
    /**
     * Gets the "BEID" element
     */
    java.lang.String getBEID();
    
    /**
     * Gets (as xml) the "BEID" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType xgetBEID();
    
    /**
     * Sets the "BEID" element
     */
    void setBEID(java.lang.String beid);
    
    /**
     * Sets (as xml) the "BEID" element
     */
    void xsetBEID(com.amx.mexico.telcel.esb.v1_2.BesCbsBEIDType beid);
    
    /**
     * Gets the "BRID" element
     */
    java.lang.String getBRID();
    
    /**
     * Gets (as xml) the "BRID" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType xgetBRID();
    
    /**
     * True if has "BRID" element
     */
    boolean isSetBRID();
    
    /**
     * Sets the "BRID" element
     */
    void setBRID(java.lang.String brid);
    
    /**
     * Sets (as xml) the "BRID" element
     */
    void xsetBRID(com.amx.mexico.telcel.esb.v1_2.BesCbsBRIDType brid);
    
    /**
     * Unsets the "BRID" element
     */
    void unsetBRID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType newInstance() {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
