/**
 * Copyright(c) Foresee Science & Technology Ltd. 
 */
package com.mqm.frame.security.role.vo;

/**
 * <pre>
 * 程序的中文名称。
 * </pre>
 * 
 * @author luoweihong luoweihong@foresee.cn
 * @version 1.00.00
 * 
 *          <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
public class RoleDtoVO {

	private static final String SPLITER = "_%%3##6%%_";

	private String id;
	private String code;
	private String name;
	private String remark;

	/**
	 * 构建器。
	 */
	public RoleDtoVO() {

	}

	/**
	 * 构建器。
	 * 
	 * @param vo
	 *            FbrpSecRole
	 */
	public RoleDtoVO(FbrpSecRole vo) {
		this.id = vo.getId();
		String tempCode = vo.getCode();
		this.code = (tempCode == null) ? "" : tempCode;
		this.name = vo.getName();
		String tempRemark = vo.getRemark();
		this.remark = (tempRemark == null) ? "" : tempRemark;
	}

	/**
	 * 构建器。
	 * 
	 * @param id
	 *            String
	 * @param code
	 *            String
	 * @param name
	 *            String
	 */
	public RoleDtoVO(String id, String code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	/**
	 * 构建器。
	 * 
	 * @param value
	 *            String
	 */
	public RoleDtoVO(String value) {
		String[] values = value.split(SPLITER);
		this.id = values[0];
		this.code = values[1];
		this.name = values[2];
		if (values.length > 3) {
			this.remark = values[3];
		}
	}

	/**
	 * 转换成字符串。
	 * 
	 * @return String
	 */
	public String convertToString() {
		return this.id + SPLITER + this.code + SPLITER + this.name + SPLITER
				+ this.remark;
	}

	/**
	 * 返回 id。
	 * 
	 * @return 返回 id。
	 */
	public String getId() {
		return id;
	}

	/**
	 * id参与hash计算，不要手动调用该方法改变id的值。
	 * 
	 * @param id
	 *            设置 id。
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 返回 code。
	 * 
	 * @return 返回 code。
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置 code。
	 * 
	 * @param code
	 *            设置 code。
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 返回 name。
	 * 
	 * @return 返回 name。
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置 name。
	 * 
	 * @param name
	 *            设置 name。
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 返回 remark。
	 * 
	 * @return 返回 remark。
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置 remark。
	 * 
	 * @param remark
	 *            设置 remark。
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RoleDtoVO other = (RoleDtoVO) obj;
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
}
