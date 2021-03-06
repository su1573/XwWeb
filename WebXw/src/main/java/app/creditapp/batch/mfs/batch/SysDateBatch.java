package app.creditapp.batch.mfs.batch;

import app.base.PUBParm;
import app.creditapp.batch.entity.BatchNode;
import app.creditapp.batch.prjbatch.JavaBatch;
import app.creditapp.batch.util.DBUtil;

/**
 * 批量程序初始化
 * 
 */
public class SysDateBatch extends JavaBatch {

	public SysDateBatch(String batchDate) {
		super(batchDate);
	}

	@Override
	public void doBatch(BatchNode batchNode) throws Exception {
		nodeNo = batchNode.getNode_no();
		nodeName = batchNode.getNode_name();
		try {
			// 更新营业日期
			String sql = "UPDATE SYS_GLOBAL SET LST_DATE=SYS_DATE,SYS_DATE=TO_CHAR(TO_DATE(SYS_DATE, 'YYYYMMDD') + 1, 'YYYYMMDD') ";
			sql += "WHERE GLO_NO = '0000000000' AND BAT_DATE=?";
			this.updateWithLog("批量开始", sql, new String[] { batchDate });
			logInfo = "任务执行成功";
			this.updateNoteSts(nodeNo, PUBParm.NODE_STATUS_4, batchDate);// 节点执行成功
			logger.info("节点号为:" + nodeNo + "的任务执行成功");
		} catch (Exception e) {
			logger.error("---------节点号为:" + nodeNo + "的任务执行失败--------\n" + e.getMessage());
			DBUtil.rollback(conn);
			logInfo = e.getMessage().length() > 3000 ? e.getMessage().substring(0, 2999) : e.getMessage();
			this.updateNoteSts(nodeNo, PUBParm.NODE_STATUS_3, batchDate);// 节点执行失败
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			this.insertBatchLog();// 插入日志信息
		}
	}

}
