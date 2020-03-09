/*
 * XML Type:  ConsultaSaldoResponse
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo;


/**
 * An XML ConsultaSaldoResponse(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public interface ConsultaSaldoResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsultaSaldoResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("consultasaldoresponsef06atype");
    
    /**
     * Gets the "controlData" element
     */
    com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType getControlData();
    
    /**
     * Sets the "controlData" element
     */
    void setControlData(com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType controlData);
    
    /**
     * Appends and returns a new empty "controlData" element
     */
    com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType addNewControlData();
    
    /**
     * Gets the "detailResponse" element
     */
    com.amx.mexico.telcel.esb.v1_2.DetailResponseType getDetailResponse();
    
    /**
     * Sets the "detailResponse" element
     */
    void setDetailResponse(com.amx.mexico.telcel.esb.v1_2.DetailResponseType detailResponse);
    
    /**
     * Appends and returns a new empty "detailResponse" element
     */
    com.amx.mexico.telcel.esb.v1_2.DetailResponseType addNewDetailResponse();
    
    /**
     * Gets the "consultaSaldoResponse" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType getConsultaSaldoResponse();
    
    /**
     * Sets the "consultaSaldoResponse" element
     */
    void setConsultaSaldoResponse(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType consultaSaldoResponse);
    
    /**
     * Appends and returns a new empty "consultaSaldoResponse" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType addNewConsultaSaldoResponse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse newInstance() {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
