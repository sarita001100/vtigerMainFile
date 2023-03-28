package testScript;


import java.lang.reflect.Method;
//com.evs.vtiger.framework.Generic;
import frameWork.Generic;

public class GetAllMethodsByMethodClass {

	public static void main(String[] args) {

		//Class.forName("vtigerPage.frameWork.Generic");
		Method [] allMethodsArr = Generic.class.getDeclaredMethods();
for(int i=0;i<=allMethodsArr.length-1;i++) {
Method methodObj=	allMethodsArr[i];
System.out.println(methodObj.getName());
}
	}

}
