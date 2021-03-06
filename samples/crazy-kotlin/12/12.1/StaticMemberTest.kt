

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
fun main(args: Array<String>) {
	// 调用Runtime的静态方法（就像调用伴生对象的方法）
	val rt = Runtime.getRuntime()
	println(rt)
	// 访问java.awt.BorderLayout的NORTH静态成员（就像访问伴生对象的属性）
	val str = java.awt.BorderLayout.NORTH
	println(str)
}