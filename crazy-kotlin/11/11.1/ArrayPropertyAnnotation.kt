

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
annotation class MyTag(vararg val infos: String)

class Role{
	// ʹ�ô����Ե�ע��
	// ��Ϊ����������Ĭ��ֵ�����Կ��Բ�Ϊ��������ָ��ֵ
	@MyTag("java", "yeeku", "kotlin")  // ��
	fun info(){
//		...
	}
//	...
}