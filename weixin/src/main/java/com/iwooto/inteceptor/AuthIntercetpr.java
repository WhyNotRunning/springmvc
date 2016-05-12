/*package com.iwooto.inteceptor;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.XMLUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class AuthIntercetpr extends AbstractPhaseInterceptor<SoapMessage> {

	private static final Logger logger = Logger.getLogger(AuthIntercetpr.class);
    public static final String xml_namespaceUR_att = "http://gd.chinamobile.com//authentication";
	public static final String xml_header_el = "soap:Header";
	public static final String xml_authentication_el = "auth:authentication";
	public static final String xml_systemID_el = "auth:systemID";
	public static final String xml_userID_el = "auth:userID";
	public static final String xml_password_el = "auth:password";
	public AuthIntercetpr() {
		// 指定该拦截器在哪个阶段被激发
		super(Phase.PRE_INVOKE);
	}

	// 处理消息
	public void handleMessage(SoapMessage message) {
		logger.info("==================SoapMessage =" + message);
		// 获取SOAP消息的全部头
		List<Header> headers = message.getHeaders();

		if (null == headers || headers.size() < 1) {
			throw new Fault(new SOAPException("SOAP消息头格式不对哦！"));
		}
		for (Header header : headers) {
			SoapHeader soapHeader = (SoapHeader) header;
			// 取出SOAP的Header元素
			Element element = (Element) soapHeader.getObject();
			logger.info("ELEMENT =" + element.toString());
			XMLUtils.printDOM(element);
			NodeList userIdNodes = element
					.getElementsByTagName(xml_userID_el);
			NodeList pwdNodes = element
					.getElementsByTagName(xml_password_el);
			NodeList systemIdNodes = element
					.getElementsByTagName(xml_systemID_el);
			logger.info("############ 打印帐号信息 ##############");
			logger.info(userIdNodes.item(0) + "="
					+ userIdNodes.item(0).getTextContent());
			logger.info(systemIdNodes.item(0) + "="
					+ systemIdNodes.item(0).getTextContent());
			logger.info(pwdNodes.item(0) + "="
					+ pwdNodes.item(0).getTextContent());
			logger.info("############————————##############");
			if (null != userIdNodes
					&& userIdNodes.item(0).getTextContent().equals("test") ) {
				if (null != pwdNodes
						&& pwdNodes.item(0).getTextContent().equals("test")) {
					logger.info("$$$$$$$$ 认证成功");
				} else {//认证失败则抛出异常，停止继续操作
					SOAPException soapExc = new SOAPException("阁下可能不是合法用户！");
					throw new Fault(soapExc);
				}
			} else {//认证失败则抛出异常，停止继续操作
				SOAPException soapExc = new SOAPException("阁下可能不是合法用户！");
				throw new Fault(soapExc);
			}
			
		}
	}

}
*/