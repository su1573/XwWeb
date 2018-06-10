package app.creditapp.batch.mfs.batch;

import app.base.PUBParm;
import app.creditapp.batch.entity.BatchNode;
import app.creditapp.batch.prjbatch.JavaBatch;
import app.creditapp.batch.util.DBUtil;

/**
 * ���������ʼ��
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
			// ����Ӫҵ����
			String sql = "UPDATE SYS_GLOBAL SET LST_DATE=SYS_DATE,SYS_DATE=TO_CHAR(TO_DATE(SYS_DATE, 'YYYYMMDD') + 1, 'YYYYMMDD') ";
			sql += "WHERE GLO_NO = '0000000000' AND BAT_DATE=?";
			this.updateWithLog("������ʼ", sql, new String[] { batchDate });
			logInfo = "����ִ�гɹ�";
			this.updateNoteSts(nodeNo, PUBParm.NODE_STATUS_4, batchDate);// �ڵ�ִ�гɹ�
			logger.info("�ڵ��Ϊ:" + nodeNo + "������ִ�гɹ�");
		} catch (Exception e) {
			logger.error("---------�ڵ��Ϊ:" + nodeNo + "������ִ��ʧ��--------\n" + e.getMessage());
			DBUtil.rollback(conn);
			logInfo = e.getMessage().length() > 3000 ? e.getMessage().substring(0, 2999) : e.getMessage();
			this.updateNoteSts(nodeNo, PUBParm.NODE_STATUS_3, batchDate);// �ڵ�ִ��ʧ��
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			this.insertBatchLog();// ������־��Ϣ
		}
	}

}