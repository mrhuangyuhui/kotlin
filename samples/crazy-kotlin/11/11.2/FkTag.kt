

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
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
// ָ����ע���ǿ��ظ�ע��
@Repeatable
annotation class FkTag(val name: String = "�������", 
	val age: Int)

@FkTag(age=5)
@FkTag(name="���Java" , age=9)
class FkTagTest
