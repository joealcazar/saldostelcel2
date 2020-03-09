
/**
 * ConsultaSaldoHttpServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
        package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo;

        /**
        *  ConsultaSaldoHttpServiceMessageReceiverInOut message receiver
        */

        public class ConsultaSaldoHttpServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ConsultaSaldoHttpServiceSkeleton skel = (ConsultaSaldoHttpServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("consultaSaldo".equals(methodName)){
                
                mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument consultaSaldoResponse5 = null;
	                        mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument wrappedParam =
                                                             (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument.class);
                                                
                                               consultaSaldoResponse5 =
                                                   
                                                   
                                                         skel.consultaSaldo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), consultaSaldoResponse5, false,
                                                    new javax.xml.namespace.QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo", "consultaSaldoResponse"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ConsultaSaldoExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"consultaSaldoException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
        
        private final org.apache.xmlbeans.XmlOptions _xmlOptions;
        
        {
            _xmlOptions = new org.apache.xmlbeans.XmlOptions();
            _xmlOptions.setSaveNoXmlDecl();
            _xmlOptions.setSaveAggressiveNamespaces();
            _xmlOptions.setSaveNamespacesFirst();
        }
        
        /**
         * Get the {@link org.apache.xmlbeans.XmlOptions} object that the stub uses when
         * serializing objects to XML.
         *
         * @return the options used for serialization
         */
        public org.apache.xmlbeans.XmlOptions _getXmlOptions() {
            return _xmlOptions;
        }
        
        

            private  org.apache.axiom.om.OMElement  toOM(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{
        try{
        

            if (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoExceptionDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    