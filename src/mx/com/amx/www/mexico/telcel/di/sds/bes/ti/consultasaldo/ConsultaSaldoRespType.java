/*
 * XML Type:  ConsultaSaldoRespType
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo;


/**
 * An XML ConsultaSaldoRespType(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public interface ConsultaSaldoRespType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsultaSaldoRespType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("consultasaldoresptype0b53type");
    
    /**
     * Gets the "codigoCuenta" element
     */
    java.lang.String getCodigoCuenta();
    
    /**
     * Gets (as xml) the "codigoCuenta" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type xgetCodigoCuenta();
    
    /**
     * Sets the "codigoCuenta" element
     */
    void setCodigoCuenta(java.lang.String codigoCuenta);
    
    /**
     * Sets (as xml) the "codigoCuenta" element
     */
    void xsetCodigoCuenta(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type codigoCuenta);
    
    /**
     * Gets the "csSaldoBalance" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType getCsSaldoBalance();
    
    /**
     * True if has "csSaldoBalance" element
     */
    boolean isSetCsSaldoBalance();
    
    /**
     * Sets the "csSaldoBalance" element
     */
    void setCsSaldoBalance(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType csSaldoBalance);
    
    /**
     * Appends and returns a new empty "csSaldoBalance" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType addNewCsSaldoBalance();
    
    /**
     * Unsets the "csSaldoBalance" element
     */
    void unsetCsSaldoBalance();
    
    /**
     * Gets the "csSaldoCapas" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType getCsSaldoCapas();
    
    /**
     * True if has "csSaldoCapas" element
     */
    boolean isSetCsSaldoCapas();
    
    /**
     * Sets the "csSaldoCapas" element
     */
    void setCsSaldoCapas(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType csSaldoCapas);
    
    /**
     * Appends and returns a new empty "csSaldoCapas" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoCapasType addNewCsSaldoCapas();
    
    /**
     * Unsets the "csSaldoCapas" element
     */
    void unsetCsSaldoCapas();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType newInstance() {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoRespType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
