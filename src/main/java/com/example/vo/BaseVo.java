package com.example.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import io.swagger.annotations.ApiModelProperty;

/**
 * 基础映射VO
 *
 * @author chongwenjun
 *
 */
public class BaseVo implements Serializable {
	private static final long serialVersionUID = 1L;
	// ID
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "UUID")
	@ApiModelProperty(hidden = true, value = "数据库主键id")
	protected String id;
	// 逻辑删除标记
	@Column(name = "is_deleted", nullable = false)
	@ApiModelProperty(hidden = true, value = "逻辑删除标记")
	protected String isDeleted;
	// 创建人Code
	@Column(name = "create_by", nullable = false)
	@ApiModelProperty(hidden = true, value = "创建人Code")
	protected String createBy;
	// 创建时间
	@Column(name = "create_time", nullable = false)
	@ApiModelProperty(hidden = true, value = "创建时间")
	protected Date createTime;
	// 更新者Code
	@Column(name = "update_by", nullable = false)
	@ApiModelProperty(hidden = true, value = "更新者Code")
	protected String updateBy;
	// 更新时间
	@Column(name = "update_time", nullable = false)
	@ApiModelProperty(hidden = true, value = "更新时间")
	protected Date updateTime;
	// 组织编码【当前记录创建人所处的组织编码】
	@Column(name = "create_org_code", nullable = false)
	@ApiModelProperty(hidden = true, value = "组织编码【当前记录创建人所处的组织编码】")
	protected String createOrgCode;
	// 开始页数
	@Transient
	@ApiModelProperty(value = "开始页数")
	protected int pageStart;
	// 每页显示行数
	@Transient
	@ApiModelProperty(value = "每页显示行数")
	protected int pageNums;
	// 员工登录token
	@Transient
	@ApiModelProperty(value = "员工登录token")
	protected String empToken;

	public BaseVo() {
		this.updateTime = new Date();

	}

	public String getCreateBy() {
		return createBy;
	}

	public String getCreateOrgCode() {
		return createOrgCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getEmpToken() {
		return empToken;
	}

	public String getId() {
		return id;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public int getPageNums() {
		return pageNums;
	}

	public int getPageStart() {
		return pageStart;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setCreateOrgCode(String createOrgCode) {
		this.createOrgCode = createOrgCode;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setEmpToken(String empToken) {
		this.empToken = empToken;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setPageNums(int pageNums) {
		this.pageNums = pageNums;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
