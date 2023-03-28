package ReusableCode;


import frameWork.Generic;

public class Runner {

	public static void main(String[] args) {
		Generic util=new Generic();
		MainReUsableCode reUseCde=new MainReUsableCode(util);
		util.extentReport("hello", "TC1");
		reUseCde.reUsableLoginCode();
		util.flushNew();
	}

}
