package com.mj.common.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public abstract class CoreTag extends TagSupport {

	private static final long serialVersionUID = 758326015040766769L;
	protected static Logger logger = Logger.getLogger(CoreTag.class);
	protected String outContent;

	protected boolean isEnable = false;

	protected void init() {

	}

	@Override
	public int doStartTag() throws JspException {

		try {
			init();
			if (isEnable) {
				if (StringUtils.isNotBlank(outContent)) {
					this.pageContext.getOut().write(outContent);
				} else {
					logger.info("输出的内容为空");
				}
			}

		} catch (IOException e) {
			logger.error(CoreTag.class.getName(), e);
		}
		return super.doStartTag();
	}

}
