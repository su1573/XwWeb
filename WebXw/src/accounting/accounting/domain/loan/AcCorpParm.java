package accounting.domain.loan;
/**
* Title: CorpParm.java
* Description:
* @作者 su
* @日期 2018-3-20
* @version：1.0
**/
public class AcCorpParm extends accounting.domain.sys.CMISDomain {
	private String accType;//核算方式[A信托核算B机构核算]
	private String parmId;//配置参数ID
	private String brName;//合作机构名称
	private String brNo;//合作机构编号
	private String putType;//放款模式[01自动 02定时]
	private String rpyDay;//扣款日类型[01固定扣款02放款日扣款]
	private String rpyScheme;//节假日扣款方案[01无 02默认 03自定义]
	private Integer graceDay;//逾期宽限期（天）
	private Double tolAmt;//入账容错额度
	private String ftpPath;//非机构化存储FTP路径
	private String upOpno;//修改人员
	private String upDate;//修改日期
	private String txDate;//登记日期
	private String opNo;//操作员
	private String deptNo;//登记部门
	private String filler;//备注

	public String getUpOpno() {
		return upOpno;
	}
	public void setUpOpno(String upOpno) {
		this.upOpno = upOpno;
	}
	public String getUpDate() {
		return upDate;
	}
	public void setUpDate(String upDate) {
		this.upDate = upDate;
	}
	public String getTxDate() {
		return txDate;
	}
	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}
	public String getOpNo() {
		return opNo;
	}
	public void setOpNo(String opNo) {
		this.opNo = opNo;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	/**
	 * @return 核算方式[A信托核算B机构核算]
	 */
	public String getAccType() {
	 	return accType;
	}
	/**
	 * @设置 核算方式[A信托核算B机构核算]
	 * @param accType
	 */
	public void setAccType(String accType) {
	 	this.accType = accType;
	}
	/**
	 * @return 配置参数ID
	 */
	public String getParmId() {
	 	return parmId;
	}
	/**
	 * @设置 配置参数ID
	 * @param parmId
	 */
	public void setParmId(String parmId) {
	 	this.parmId = parmId;
	}
	/**
	 * @return 合作机构名称
	 */
	public String getBrName() {
	 	return brName;
	}
	/**
	 * @设置 合作机构名称
	 * @param brName
	 */
	public void setBrName(String brName) {
	 	this.brName = brName;
	}
	/**
	 * @return 合作机构编号
	 */
	public String getBrNo() {
	 	return brNo;
	}
	/**
	 * @设置 合作机构编号
	 * @param brNo
	 */
	public void setBrNo(String brNo) {
	 	this.brNo = brNo;
	}
	/**
	 * @return 放款模式[01自动 02定时]
	 */
	public String getPutType() {
	 	return putType;
	}
	/**
	 * @设置 放款模式[01自动 02定时]
	 * @param putType
	 */
	public void setPutType(String putType) {
	 	this.putType = putType;
	}
	/**
	 * @return 扣款日类型[01固定扣款02放款日扣款]
	 */
	public String getRpyDay() {
	 	return rpyDay;
	}
	/**
	 * @设置 扣款日类型[01固定扣款02放款日扣款]
	 * @param rpyDay
	 */
	public void setRpyDay(String rpyDay) {
	 	this.rpyDay = rpyDay;
	}
	/**
	 * @return 节假日扣款方案[01无 02默认 03自定义]
	 */
	public String getRpyScheme() {
	 	return rpyScheme;
	}
	/**
	 * @设置 节假日扣款方案[01无 02默认 03自定义]
	 * @param rpyScheme
	 */
	public void setRpyScheme(String rpyScheme) {
	 	this.rpyScheme = rpyScheme;
	}
	/**
	 * @return 逾期宽限期（天）
	 */
	public Integer getGraceDay() {
	 	return graceDay;
	}
	/**
	 * @设置 逾期宽限期（天）
	 * @param graceDay
	 */
	public void setGraceDay(Integer graceDay) {
	 	this.graceDay = graceDay;
	}
	/**
	 * @return 入账容错额度
	 */
	public Double getTolAmt() {
	 	return tolAmt;
	}
	/**
	 * @设置 入账容错额度
	 * @param tolAmt
	 */
	public void setTolAmt(Double tolAmt) {
	 	this.tolAmt = tolAmt;
	}
	/**
	 * @return 非机构化存储FTP路径
	 */
	public String getFtpPath() {
	 	return ftpPath;
	}
	/**
	 * @设置 非机构化存储FTP路径
	 * @param ftpPath
	 */
	public void setFtpPath(String ftpPath) {
	 	this.ftpPath = ftpPath;
	}
}