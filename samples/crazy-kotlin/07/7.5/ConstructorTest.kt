

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
// 提供主构造器，该构造器包含两个参数
class ConstructorTest(name: String, count: Int){
	var name: String
	var count: Int
	// 定义初始化块，相当于主构造器的执行体
	init {
		// 初始化块里的this代表它进行初始化的对象
		// 下面两行代码将传入的2个参数赋给this代表对象的name和count属性
		this.name = name
		this.count = count
	}
}
fun main(args: Array<String>) {
	// 使用自定义的构造器来创建对象
	// 系统将会对该对象执行自定义的初始化
	var tc = ConstructorTest("疯狂Java讲义" , 90000)
	// 输出ConstructorTest对象的name和count两个属性
	println(tc.name)
	println(tc.count)
}