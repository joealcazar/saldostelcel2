/*
 * XML Type:  DetailResponseType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.DetailResponseType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2;


/**
 * An XML DetailResponseType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public interface DetailResponseType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DetailResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("detailresponsetype0226type");
    
    /**
     * Gets the "code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" element
     */
    com.amx.mexico.telcel.esb.v1_2.CodeType xgetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" element
     */
    void xsetCode(com.amx.mexico.telcel.esb.v1_2.CodeType code);
    
    /**
     * Gets the "severityLevel" element
     */
    int getSeverityLevel();
    
    /**
     * Gets (as xml) the "severityLevel" element
     */
    com.amx.mexico.telcel.esb.v1_2.SeverityType xgetSeverityLevel();
    
    /**
     * True if has "severityLevel" element
     */
    boolean isSetSeverityLevel();
    
    /**
     * Sets the "severityLevel" element
     */
    void setSeverityLevel(int severityLevel);
    
    /**
     * Sets (as xml) the "severityLevel" element
     */
    void xsetSeverityLevel(com.amx.mexico.telcel.esb.v1_2.SeverityType severityLevel);
    
    /**
     * Unsets the "severityLevel" element
     */
    void unsetSeverityLevel();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    com.amx.mexico.telcel.esb.v1_2.DescriptionType xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(com.amx.mexico.telcel.esb.v1_2.DescriptionType description);
    
    /**
     * Gets the "actor" element
     */
    java.lang.String getActor();
    
    /**
     * Gets (as xml) the "actor" element
     */
    com.amx.mexico.telcel.esb.v1_2.ActorType xgetActor();
    
    /**
     * True if has "actor" element
     */
    boolean isSetActor();
    
    /**
     * Sets the "actor" element
     */
    void setActor(java.lang.String actor);
    
    /**
     * Sets (as xml) the "actor" element
     */
    void xsetActor(com.amx.mexico.telcel.esb.v1_2.ActorType actor);
    
    /**
     * Unsets the "actor" element
     */
    void unsetActor();
    
    /**
     * Gets the "businessMeaning" element
     */
    java.lang.String getBusinessMeaning();
    
    /**
     * Gets (as xml) the "businessMeaning" element
     */
    com.amx.mexico.telcel.esb.v1_2.MeaningType xgetBusinessMeaning();
    
    /**
     * True if has "businessMeaning" element
     */
    boolean isSetBusinessMeaning();
    
    /**
     * Sets the "businessMeaning" element
     */
    void setBusinessMeaning(java.lang.String businessMeaning);
    
    /**
     * Sets (as xml) the "businessMeaning" element
     */
    void xsetBusinessMeaning(com.amx.mexico.telcel.esb.v1_2.MeaningType businessMeaning);
    
    /**
     * Unsets the "businessMeaning" element
     */
    void unsetBusinessMeaning();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType newInstance() {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.DetailResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
