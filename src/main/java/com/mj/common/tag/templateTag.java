package com.mj.common.tag;

import java.util.List;

public class templateTag extends CoreTag {
	
	public List<Object> item; 
	
	public String template;
	
	public String  prefix;

	/**
	 * 
	 */
	private static final long serialVersionUID = -8660137067347729386L;
	
	@Override
	protected void init() {
		this.isEnable = true;
		System.out.println(item.get(0));
		
		super.init();
	}

	

}
